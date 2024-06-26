package com.example.do_an_cs3.Database;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.example.do_an_cs3.Model.Project;
import com.example.do_an_cs3.Model.Task;
import com.example.do_an_cs3.Model.User;
import com.example.do_an_cs3.View.Users.AddProfileActivity;
import com.example.do_an_cs3.View.Users.ChooseRoleActivity;
import com.example.do_an_cs3.View.MainActivity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private Database dbhelper;
    private SQLiteDatabase db;
    private Context mContext;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 8;
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final String DATABASE_NAME = "tasks_database";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_TASKS = "Tasks";
    private static final String COLUMN_ID = "task_id";
    private static final String COLUMN_TASK_NAME = "task_name";
    private static final String COLUMN_TASK_DESCRIPTION = "task_description";
    private static final String COLUM_TASK_DEADLINE= "deadline";
    public DatabaseManager(Context context) {
        dbhelper = new Database(context);
        db = dbhelper.getWritableDatabase();
        mContext = context;
    }

    public static String generateReferralCode() {
        StringBuilder referralCode = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            referralCode.append(CHARACTERS.charAt(index));
        }
        return referralCode.toString();
    }

    public long addUser(String email, String password) {
        // Kiểm tra email có đúng định dạng "@gmail.com"
        if (!isValidEmail(email)) {
            return -1; // hoặc một giá trị khác biểu thị lỗi
        }
        // Kiểm tra mật khẩu có đúng độ dài 6 ký tự không
        if (password.length() <= 1) {
            return -2; // hoặc một giá trị khác biểu thị lỗi
        }

        // Kiểm tra xem email đã tồn tại trong cơ sở dữ liệu chưa
        Cursor cursor = db.query("Users", null, "email=?", new String[]{email}, null, null, null);
        if (cursor.getCount() > 0) {
            // Nếu email đã tồn tại, đóng cursor và trả về -3 hoặc một giá trị mà bạn xác định để biểu thị lỗi
            cursor.close();
            return -3; // hoặc một giá trị khác biểu thị lỗi
        }
        cursor.close();

        String referralCode = generateReferralCode();


        // Nếu email hợp lệ và không tồn tại trong cơ sở dữ liệu, thêm mới người dùng vào cơ sở dữ liệu
        ContentValues values = new ContentValues();

        values.put("email", email);
        values.put("password", password);
        values.put("referral_code", referralCode);

        long id = db.insert("Users", null, values);
        return id;
    }


    public long addProjectParticipants(String email, String project_id) {
        // Kiểm tra email có đúng định dạng "@gmail.com"
        if (!isValidEmail(email)) {
            return -1; // hoặc một giá trị khác biểu thị lỗi
        }

        // Kiểm tra xem email đã tồn tại trong bảng Users chưa
        Cursor userCursor = db.query("Users", null, "email=?", new String[]{email}, null, null, null);
        if (userCursor.getCount() == 0) {
            // Nếu email không tồn tại, đóng cursor và trả về -2 hoặc một giá trị mà bạn xác định để biểu thị lỗi
            userCursor.close();
            return -2; // hoặc một giá trị khác biểu thị lỗi
        }
        userCursor.close();

        // Kiểm tra xem cặp email và project_id đã tồn tại trong bảng Project_Participants chưa
        Cursor participantCursor = db.query("Project_Participants", null, "email=? AND project_id=?", new String[]{email, project_id}, null, null, null);
        if (participantCursor.getCount() > 0) {
            // Nếu cặp email và project_id đã tồn tại, đóng cursor và trả về -3 hoặc một giá trị mà bạn xác định để biểu thị lỗi
            participantCursor.close();
            return -3; // hoặc một giá trị khác biểu thị lỗi
        }
        participantCursor.close();

        // Nếu email hợp lệ và không tồn tại trong bảng Project_Participants, thêm mới người tham gia vào cơ sở dữ liệu
        ContentValues values = new ContentValues();
        values.put("email", email);
        values.put("project_id", project_id);

        long id = db.insert("Project_Participants", null, values);
        return id;
    }
    // Giả định là có một phương thức để kiểm tra định dạng email



    //    private byte[] getBytesFromImage(String imagePath) {
//        try {
//            File imageFile = new File(imagePath);
//            FileInputStream fis = new FileInputStream(imageFile);
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = fis.read(buffer)) != -1) {
//                baos.write(buffer, 0, bytesRead);
//            }
//            fis.close();
//            return baos.toByteArray();
//        } catch (IOException e) {
//            Log.e("DatabaseHelper", "Failed to convert image to byte array", e);
//            return null;
//        }
//    }
//    public byte[] getBytesFromImage(String filePath) {
//        FileInputStream fis = null;
//        ByteArrayOutputStream baos = null;
//        try {
//            fis = new FileInputStream(filePath);
//            baos = new ByteArrayOutputStream();
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = fis.read(buffer)) != -1) {
//                baos.write(buffer, 0, bytesRead);
//            }
//            return baos.toByteArray();
//        } catch (FileNotFoundException e) {
//            Log.e("DatabaseHelper", "File not found", e);
//        } catch (IOException e) {
//            Log.e("DatabaseHelper", "Failed to read file", e);
//        } finally {
//            try {
//                if (fis != null) {
//                    fis.close();
//                }
//                if (baos != null) {
//                    baos.close();
//                }
//            } catch (IOException e) {
//                Log.e("DatabaseHelper", "Failed to close streams", e);
//            }
//        }
//        return null;
//    }

    @SuppressLint("Range")
    public User getUserInfo(String email) {
        User user = null; // Khởi tạo user là null để kiểm tra sau
        SQLiteDatabase db = null;
        Cursor cursor = null;
        try {
            db = this.dbhelper.getReadableDatabase();
            // Sử dụng câu lệnh SQL với điều kiện email
            cursor = db.rawQuery("SELECT * FROM Users WHERE email = ?", new String[]{email});
            if (cursor.moveToFirst()) {
                // Lấy thông tin người dùng từ cursor
                String userName = cursor.getString(cursor.getColumnIndex("username"));
                String phoneNumber = cursor.getString(cursor.getColumnIndex("phone_number"));
                String address = cursor.getString(cursor.getColumnIndex("address"));
                String referralCode = cursor.getString(cursor.getColumnIndex("referral_code"));
                byte[] avatarBytes = cursor.getBlob(cursor.getColumnIndex("avatar_url"));
                int department = cursor.getInt(cursor.getColumnIndex("department_id"));
                String role = cursor.getString(cursor.getColumnIndex("role"));

                // Chuyển đổi byte array thành String
                String avatar = (avatarBytes != null) ? Base64.encodeToString(avatarBytes, Base64.DEFAULT) : null;

                user = new User(userName, phoneNumber, address, referralCode, avatar, department, role);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Log lỗi hoặc xử lý ngoại lệ tại đây
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return user;
    }


    // Phương thức kiểm tra định dạng email
    private boolean isValidEmail(String email) {
        String emailPattern = "[a-zA-Z0-9._-]+@gmail\\.com";
        return email.matches(emailPattern);
    }

    @SuppressLint("Range") // Phương thức đăng nhập
    public boolean login(String email, String password, Activity activity) {
        String[] columns = {"email", "role",};
        String selection = "email=? AND password=?";
        String[] selectionArgs = {email, password};

        Cursor cursor = null;
        try {
            cursor = db.query("Users", columns, selection, selectionArgs, null, null, null);
            int count = cursor.getCount();

            if (count > 0) {
                cursor.moveToFirst();
                String role = cursor.getString(cursor.getColumnIndexOrThrow("role"));

                // Lưu email của người dùng vào SharedPreferences
                SharedPreferences sharedPreferences = activity.getSharedPreferences("user_prefs", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("user_email", email);
                editor.apply();

                if (role == null || role.isEmpty()) {
                    // If role is empty, display a different view
                    Intent intent = new Intent(activity, ChooseRoleActivity.class); // Assuming ChooseRoleActivity is the activity you want to show
                    activity.startActivity(intent);
                }
                     else {
                        // If login is successful and role is not empty, go to MainActivity
                        Intent intent = new Intent(activity, MainActivity.class);
                        activity.startActivity(intent);
                    }
                // Ẩn LoginActivity
                activity.finish();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (cursor != null) {
                cursor.close(); // Ensure the cursor is closed
            }
        }
    }

    public boolean updateUserRole(String email, String newRole, String department) {
        try {
            // Tạo một đối tượng ContentValues để chứa dữ liệu cần cập nhật
            ContentValues values = new ContentValues();
            values.put("role", newRole);
            values.put("department_id", department);

            // Tạo điều kiện để xác định người dùng cần cập nhật vai trò
            String selection = "email=?";
            String[] selectionArgs = {email};

            // Thực hiện cập nhật dữ liệu trong cơ sở dữ liệu
            int rowsAffected = db.update("Users", values, selection, selectionArgs);

            // Kiểm tra xem có dòng nào được cập nhật không
            if (rowsAffected > 0) {
                // Trả về true nếu cập nhật thành công
                return true;
            } else {
                // Trả về false nếu không có dòng nào được cập nhật
                return false;
            }
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng (nếu cần)
            Log.e("Update Role and Department Error ", "Error updating role: " + e.getMessage());
            return false; // Trả về false nếu có lỗi xảy ra
        }
    }


    public long addProject(String name, String description, String deadline,String creationTime, String status, int views ,float percent_complete, String email, int department) {
        try {
            // Tạo một đối tượng ContentValues để chứa dữ liệu cần chèn vào cơ sở dữ liệu
            ContentValues values = new ContentValues();
            values.put("project_name", name);
            values.put("project_description", description);
            values.put("deadline", deadline); // Chèn chuỗi định dạng Deadline vào cột Deadline
            values.put("creation_time", creationTime);
            values.put("status", status);
            values.put("views", views);
            values.put("percent_complete",percent_complete);
            values.put("email", email);
            values.put("department_id", department);
            // Thực hiện chèn dữ liệu vào bảng "Projects" của cơ sở dữ liệu
            long id = db.insert("Projects", null, values);
            return id;
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng
            Log.e("Add Project Error", "Error adding project: " + e.getMessage());
            Toast.makeText(null, "Error adding project: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return -1; // Trả về giá trị -1 để biểu thị rằng có lỗi xảy ra
        }
    }
    public boolean updateProject(String name, String description, String deadline,String creationTime, String status, int views,int project_id ) {
        boolean success = false;
        try {
            // Tạo một đối tượng ContentValues để chứa dữ liệu cần chèn vào cơ sở dữ liệu
            ContentValues values = new ContentValues();
            values.put("project_name", name);
            values.put("project_description", description);
            values.put("deadline", deadline); // Chèn chuỗi định dạng Deadline vào cột Deadline
            values.put("creation_time", creationTime);
            values.put("status", status);
            values.put("views", views);
            // Thực hiện chèn dữ liệu vào bảng "Projects" của cơ sở dữ liệu
            int rowsAffeted  = db.update("Projects", values,"project_id = ?", new String[]{String.valueOf(project_id)});
            return  rowsAffeted > 0;
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng
            Log.e("Add Project Error", "Error adding project: " + e.getMessage());
            return success; // Trả về giá trị -1 để biểu thị rằng có lỗi xảy ra
        }
    }
    public boolean updateTimeCompleteTask(String timeComplete, int task_id) {
        SQLiteDatabase db = null;
        boolean success = false;

        try {
            db = dbhelper.getWritableDatabase();
            // Tạo một đối tượng ContentValues để chứa dữ liệu cần cập nhật vào cơ sở dữ liệu
            ContentValues values = new ContentValues();
            values.put("time_complete", timeComplete);

            // Thực hiện cập nhật dữ liệu vào bảng "Tasks" của cơ sở dữ liệu
            int rowsAffected = db.update("Tasks", values, "task_id = ?", new String[]{String.valueOf(task_id)});
            success = rowsAffected > 0;
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng
            Log.e("Update Task Error", "Error updating task: " + e.getMessage());
        } finally {
            if (db != null && db.isOpen()) {
                db.close();
            }
        }

        return success;
    }

    public boolean deleteProject(int id) {
        boolean success = false;
        try {
            db = dbhelper.getWritableDatabase();
            int rowsAffected = db.delete("Projects", "project_id = ?", new String[]{String.valueOf(id)});
            if (rowsAffected > 0) {
                success = true;
            } else {
                Log.d("Delete Project", "No project deleted. Project with ID " + id + " not found");

            }
        } catch (Exception e) {
            Log.e("Delete Project Error", "Error deleting project: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return success;
    }
    public boolean updateUserInfo(String email, String name, String phone, String address, String role, String department, String referralCode,byte[] avatarData) {
        try {
            db = this.dbhelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("username", name);
            values.put("phone_number", phone);
            values.put("address", address);
            values.put("role", role);
            values.put("department_id", department);
            values.put("referral_code", referralCode);
            values.put("avatar_url", avatarData);
            int rowsAffected = db.update("Users", values, "email = ?", new String[]{email});

            return rowsAffected > 0;
        } catch (Exception e) {
            Log.e("Update User Info Error", "Error updating user info: " + e.getMessage());
            return false;
        }
    }
    // chuyển đổi hình ảnh
    public byte[] getBytesFromImage(Uri imageUri) {
        try {
            InputStream inputStream = mContext.getContentResolver().openInputStream(imageUri);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getTotalOngoingProjects(String email, String status) {
        int totalProjects = 0;
        Cursor cursor = null;
        try {
            // Thực hiện truy vấn để đếm số lượng dự án có trạng thái "đang thực hiện" của email xác định
            String query = "SELECT COUNT(*) FROM Projects WHERE status = ? AND email = ?";
            cursor = db.rawQuery(query, new String[]{status, email});
            if (cursor != null && cursor.moveToFirst()) {
                totalProjects = cursor.getInt(0); // Lấy giá trị từ cột đầu tiên của kết quả truy vấn
            }
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng
            Log.e("Get Total Ongoing Projects Error", "Error getting total ongoing projects: " + e.getMessage());
            Toast.makeText(null, "Error getting total ongoing projects: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        } finally {
            if (cursor != null) {
                cursor.close(); // Đảm bảo đóng con trỏ để tránh rò rỉ bộ nhớ
            }
        }
        Log.d("TotalProjectsByStatus", "Status: " + status + ", Email: " + email + ", Count: " + totalProjects);
        return totalProjects;
    }

    public long addTask(String name, String description, String deadline, String status, String email, int projectId) {
        try {
            // Tạo một đối tượng ContentValues để chứa dữ liệu cần chèn vào cơ sở dữ liệu
            ContentValues values = new ContentValues();
            values.put("task_name", name);
            values.put("task_description", description);
            values.put("deadline", deadline); // Chèn chuỗi định dạng Deadline vào cột Deadline
            values.put("status", status);
            values.put("email", email);
            values.put("project_id", projectId);
            // Thực hiện chèn dữ liệu vào bảng "Projects" của cơ sở dữ liệu
            long id = db.insert("Tasks", null, values);
            return id;
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng
            Log.e("Add Task Error", "Error adding task: " + e.getMessage());
            Toast.makeText(null, "Error adding task: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return -1; // Trả về giá trị -1 để biểu thị rằng có lỗi xảy ra
        }
    }
    public boolean updateStatusTask(String status, int task_id) {
        SQLiteDatabase db = null;
        boolean success = false;

        try {
            db = this.dbhelper.getWritableDatabase();
            // Tạo một đối tượng ContentValues để chứa dữ liệu cần cập nhật vào cơ sở dữ liệu
            ContentValues values = new ContentValues();
            values.put("status", status);

            int rowsAffected = db.update("Tasks", values, "task_id = ?", new String[]{String.valueOf(task_id)});
            success = rowsAffected > 0;
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng
            Log.e("Update Task Error", "Error updating task: " + e.getMessage());
        } finally {
            if (db != null && db.isOpen()) {
                db.close();
            }
        }

        return success;
    }
    public boolean updateStatusProject(String status, int project_id) {
        SQLiteDatabase db = null;
        boolean success = false;

        try {
            db = this.dbhelper.getWritableDatabase();
            // Tạo một đối tượng ContentValues để chứa dữ liệu cần cập nhật vào cơ sở dữ liệu
            ContentValues values = new ContentValues();
            values.put("status", status);

            int rowsAffected = db.update("Projects", values, "project_id = ?", new String[]{String.valueOf(project_id)});
            success = rowsAffected > 0;
        } catch (Exception e) {
            // Xử lý lỗi và thông báo cho người dùng
            Log.e("Update Task Error", "Error updating task: " + e.getMessage());
        } finally {
            if (db != null && db.isOpen()) {
                db.close();
            }
        }

        return success;
    }

    @SuppressLint("Range")
    public List<Project> getAllProjects(String emailProject) {
        List<Project> projectList = new ArrayList<>();
        SQLiteDatabase db = null;
        Cursor cursor = null;
        try {
            db = this.dbhelper.getReadableDatabase();
            cursor = db.rawQuery("SELECT * FROM Projects WHERE email = ?", new String[]{emailProject});
            if (cursor.moveToFirst()) {
                do {
                    int id = cursor.getInt(cursor.getColumnIndex("project_id"));
                    String name = cursor.getString(cursor.getColumnIndex("project_name"));
                    String description = cursor.getString(cursor.getColumnIndex("project_description"));
                    String deadline = cursor.getString(cursor.getColumnIndex("deadline"));
                    String creationTime = cursor.getString(cursor.getColumnIndex("creation_time"));
                    String status = cursor.getString(cursor.getColumnIndex("status"));
                    int views = cursor.getInt(cursor.getColumnIndex("views"));
                    int percentCompleted = cursor.getInt(cursor.getColumnIndex("percent_complete"));
                    String email = cursor.getString(cursor.getColumnIndex("email"));
//                    int department = cursor.getInt(cursor.getColumnIndex("department_id"));
//                    if (cursor.isNull(department)) {
//                        department = 1; // hoặc bất kỳ giá trị mặc định nào bạn muốn
//                    }
                    Project project = new Project(id, name, description, deadline, creationTime, views, percentCompleted, email, status, 1);
                    projectList.add(project);

                } while (cursor.moveToNext());
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Log lỗi hoặc xử lý ngoại lệ tại đây
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return projectList;
    }
    @SuppressLint("Range")
    public List<Task> getAllTask(int idProject) {
        List<Task> taskList = new ArrayList<>();
        SQLiteDatabase db = null;
        Cursor cursor = null;
        try {
            db = this.dbhelper.getReadableDatabase();
            cursor = db.rawQuery("SELECT * FROM Tasks WHERE project_id = ?", new String[]{String.valueOf(idProject)});
            if (cursor.moveToFirst()) {
                do {
                    int id = cursor.getInt(cursor.getColumnIndex("task_id"));
                    String name = cursor.getString(cursor.getColumnIndex("task_name"));
                    String description = cursor.getString(cursor.getColumnIndex("task_description"));
                    String deadline = cursor.getString(cursor.getColumnIndex("deadline"));
                    String timeComplete = cursor.getString(cursor.getColumnIndex("time_complete"));
                    String status = cursor.getString(cursor.getColumnIndex("status"));
                    String email = cursor.getString(cursor.getColumnIndex("email"));
                    int project_id = cursor.getInt(cursor.getColumnIndex("project_id"));
//                    if (cursor.isNull(department)) {
//                        department = 1; // hoặc bất kỳ giá trị mặc định nào bạn muốn
//                    }
                    Task task = new Task(id, name, description, deadline, status, email, project_id, timeComplete);
                    taskList.add(task);
                } while (cursor.moveToNext());
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Log lỗi hoặc xử lý ngoại lệ tại đây
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return taskList;
    }
    @SuppressLint("Range")
    public Project getInfoProject(int idProject){
        Project project = new Project();
        SQLiteDatabase db = null;
        Cursor cursor = null;
        try {
            db = this.dbhelper.getReadableDatabase();
            cursor = db.rawQuery("SELECT * FROM Projects WHERE project_id = ?", new String[]{String.valueOf(idProject)});
            if (cursor.moveToFirst()) {
                do {
                    String name = cursor.getString(cursor.getColumnIndex("project_name"));
                    String description = cursor.getString(cursor.getColumnIndex("project_description"));
                    String deadline = cursor.getString(cursor.getColumnIndex("deadline"));
                    String creationTime = cursor.getString(cursor.getColumnIndex("creation_time"));
                    String status = cursor.getString(cursor.getColumnIndex("status"));
                    int views = cursor.getInt(cursor.getColumnIndex("views"));
                    int percentCompleted = cursor.getInt(cursor.getColumnIndex("percent_complete"));
//                    String email = cursor.getString(cursor.getColumnIndex("email"));
//                    int department = cursor.getInt(cursor.getColumnIndex("department_id"));
//                    if (cursor.isNull(department)) {
//                        department = 1; // hoặc bất kỳ giá trị mặc định nào bạn muốn
//                    }
                     project = new Project( name, description, deadline, creationTime, views, percentCompleted, status);

                } while (cursor.moveToNext());
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Log lỗi hoặc xử lý ngoại lệ tại đây
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            if (db != null) {
               // db.close();
            }
        }
        return project;
    }
    public void deleteTask(int taskId) {
         db = this.dbhelper.getWritableDatabase();
        db.delete("Tasks", "task_id = ?", new String[]{String.valueOf(taskId)});
        db.close();
    }
    @SuppressLint("Range")
    public Task getTaskById(int taskId) {
        db = this.dbhelper.getReadableDatabase();
        Cursor cursor = db.query(TABLE_TASKS, new String[]{COLUMN_ID, COLUMN_TASK_NAME, COLUMN_TASK_DESCRIPTION,COLUM_TASK_DEADLINE},
                COLUMN_ID + "=?", new String[]{String.valueOf(taskId)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Task task = new Task();
        task.setId(cursor.getInt(cursor.getColumnIndex(COLUMN_ID)));
        task.setTaskName(cursor.getString(cursor.getColumnIndex(COLUMN_TASK_NAME)));
        task.setTaskDescription(cursor.getString(cursor.getColumnIndex(COLUMN_TASK_DESCRIPTION)));
        task.setTaskDeadline(cursor.getString(cursor.getColumnIndex(COLUM_TASK_DEADLINE)));

        cursor.close();
        db.close();

        return task;
    }
    public boolean updateTask(int taskId, String taskName, String taskDescription, String deadline) {
        db = this.dbhelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("task_name", taskName);
        values.put("task_description", taskDescription);
        values.put("deadline", deadline);
        //values.put("status", status);

        // Cập nhật bản ghi
        int rowsAffected = db.update("Tasks", values, "task_id = ?", new String[]{String.valueOf(taskId)});

        db.close();

        // Trả về true nếu có ít nhất một dòng bị ảnh hưởng
        return rowsAffected > 0;
    }




}