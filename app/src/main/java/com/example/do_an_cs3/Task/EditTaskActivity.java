package com.example.do_an_cs3.Task;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.do_an_cs3.Database.DatabaseManager;
import com.example.do_an_cs3.Model.Task;
import com.example.do_an_cs3.R;
import com.google.android.material.textfield.TextInputEditText;

public class EditTaskActivity extends AppCompatActivity {

    private DatabaseManager dbManager;
    private Task task;
    private EditText editName;
    private TextInputEditText editcontent;
    private TextView textDate;
    private Button buttonUpdate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);

        dbManager = new DatabaseManager(this);

        int taskId = getIntent().getIntExtra("task_id", -1);
        task = dbManager.getTaskById(taskId);

        // Cập nhật giao diện với thông tin task
        editName = findViewById(R.id.editNameJob);
        editcontent = findViewById(R.id.textInputEditTextDescription);
        textDate = findViewById(R.id.textViewDate);
        buttonUpdate = findViewById(R.id.buttonUpdate); // Khởi tạo button sau setContentView()

        if (task != null) {
            editName.setText(task.getTaskName());
            editcontent.setText(task.getTaskDescription());
            textDate.setText(task.getTaskDeadline());
        } else {
            Toast.makeText(this, "Không tìm thấy công việc", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTask();
            }
        });
    }

    private void updateTask() {
        String newName = editName.getText().toString();
        String newDescription = editcontent.getText().toString();
        String newDeadline = textDate.getText().toString();

        boolean isUpdated = dbManager.updateTask(task.getId(), newName, newDescription, newDeadline);

        if (isUpdated) {
            Toast.makeText(this, "Đã cập nhật", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Lỗi cập nhật", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}
