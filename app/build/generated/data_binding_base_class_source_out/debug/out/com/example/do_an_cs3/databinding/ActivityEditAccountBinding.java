// Generated by view binder compiler. Do not edit!
package com.example.do_an_cs3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.do_an_cs3.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditAccountBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonHome;

  @NonNull
  public final Button buttonUpdate;

  @NonNull
  public final Button buttondatejob;

  @NonNull
  public final CircleImageView circleImageView;

  @NonNull
  public final Button comeback;

  @NonNull
  public final EditText editTextAddress;

  @NonNull
  public final EditText editTextDepartment;

  @NonNull
  public final EditText editTextName;

  @NonNull
  public final EditText editTextPhone;

  @NonNull
  public final EditText editTextPosition;

  @NonNull
  public final EditText editTextReferral;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView logo;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView tvDepartment;

  @NonNull
  public final TextView tvMGT;

  private ActivityEditAccountBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonHome,
      @NonNull Button buttonUpdate, @NonNull Button buttondatejob,
      @NonNull CircleImageView circleImageView, @NonNull Button comeback,
      @NonNull EditText editTextAddress, @NonNull EditText editTextDepartment,
      @NonNull EditText editTextName, @NonNull EditText editTextPhone,
      @NonNull EditText editTextPosition, @NonNull EditText editTextReferral,
      @NonNull LinearLayout linearLayout, @NonNull TextView logo, @NonNull TextView textView11,
      @NonNull TextView textView12, @NonNull TextView textView5, @NonNull TextView textView8,
      @NonNull TextView tvDepartment, @NonNull TextView tvMGT) {
    this.rootView = rootView;
    this.buttonHome = buttonHome;
    this.buttonUpdate = buttonUpdate;
    this.buttondatejob = buttondatejob;
    this.circleImageView = circleImageView;
    this.comeback = comeback;
    this.editTextAddress = editTextAddress;
    this.editTextDepartment = editTextDepartment;
    this.editTextName = editTextName;
    this.editTextPhone = editTextPhone;
    this.editTextPosition = editTextPosition;
    this.editTextReferral = editTextReferral;
    this.linearLayout = linearLayout;
    this.logo = logo;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView5 = textView5;
    this.textView8 = textView8;
    this.tvDepartment = tvDepartment;
    this.tvMGT = tvMGT;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonHome;
      Button buttonHome = ViewBindings.findChildViewById(rootView, id);
      if (buttonHome == null) {
        break missingId;
      }

      id = R.id.buttonUpdate;
      Button buttonUpdate = ViewBindings.findChildViewById(rootView, id);
      if (buttonUpdate == null) {
        break missingId;
      }

      id = R.id.buttondatejob;
      Button buttondatejob = ViewBindings.findChildViewById(rootView, id);
      if (buttondatejob == null) {
        break missingId;
      }

      id = R.id.circleImageView;
      CircleImageView circleImageView = ViewBindings.findChildViewById(rootView, id);
      if (circleImageView == null) {
        break missingId;
      }

      id = R.id.comeback;
      Button comeback = ViewBindings.findChildViewById(rootView, id);
      if (comeback == null) {
        break missingId;
      }

      id = R.id.editTextAddress;
      EditText editTextAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextAddress == null) {
        break missingId;
      }

      id = R.id.editTextDepartment;
      EditText editTextDepartment = ViewBindings.findChildViewById(rootView, id);
      if (editTextDepartment == null) {
        break missingId;
      }

      id = R.id.editTextName;
      EditText editTextName = ViewBindings.findChildViewById(rootView, id);
      if (editTextName == null) {
        break missingId;
      }

      id = R.id.editTextPhone;
      EditText editTextPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextPhone == null) {
        break missingId;
      }

      id = R.id.editTextPosition;
      EditText editTextPosition = ViewBindings.findChildViewById(rootView, id);
      if (editTextPosition == null) {
        break missingId;
      }

      id = R.id.editTextReferral;
      EditText editTextReferral = ViewBindings.findChildViewById(rootView, id);
      if (editTextReferral == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.logo;
      TextView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.tvDepartment;
      TextView tvDepartment = ViewBindings.findChildViewById(rootView, id);
      if (tvDepartment == null) {
        break missingId;
      }

      id = R.id.tvMGT;
      TextView tvMGT = ViewBindings.findChildViewById(rootView, id);
      if (tvMGT == null) {
        break missingId;
      }

      return new ActivityEditAccountBinding((ConstraintLayout) rootView, buttonHome, buttonUpdate,
          buttondatejob, circleImageView, comeback, editTextAddress, editTextDepartment,
          editTextName, editTextPhone, editTextPosition, editTextReferral, linearLayout, logo,
          textView11, textView12, textView5, textView8, tvDepartment, tvMGT);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
