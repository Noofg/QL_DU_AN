// Generated by view binder compiler. Do not edit!
package com.example.do_an_cs3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.do_an_cs3.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView SharForFF;

  @NonNull
  public final CircleImageView accountAvt;

  @NonNull
  public final BottomNavigationView bottomnavigation;

  @NonNull
  public final Button buttonComback;

  @NonNull
  public final Button buttonDate;

  @NonNull
  public final Button buttonSeacrh;

  @NonNull
  public final Button buttonWarning;

  @NonNull
  public final TextView chanepass;

  @NonNull
  public final TextView chucvu;

  @NonNull
  public final TextView editaccount;

  @NonNull
  public final TextView emailaccount;

  @NonNull
  public final TextView intru;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout liner1;

  @NonNull
  public final LinearLayout liner2;

  @NonNull
  public final TextView logo;

  @NonNull
  public final TextView logout;

  @NonNull
  public final TextView nameaccount;

  @NonNull
  public final TextView recentActivity;

  @NonNull
  public final TextView servicePrice;

  @NonNull
  public final TextView statistic;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView typeJob;

  @NonNull
  public final TextView unitInformation;

  private ActivitySettingBinding(@NonNull ConstraintLayout rootView, @NonNull TextView SharForFF,
      @NonNull CircleImageView accountAvt, @NonNull BottomNavigationView bottomnavigation,
      @NonNull Button buttonComback, @NonNull Button buttonDate, @NonNull Button buttonSeacrh,
      @NonNull Button buttonWarning, @NonNull TextView chanepass, @NonNull TextView chucvu,
      @NonNull TextView editaccount, @NonNull TextView emailaccount, @NonNull TextView intru,
      @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2,
      @NonNull LinearLayout liner1, @NonNull LinearLayout liner2, @NonNull TextView logo,
      @NonNull TextView logout, @NonNull TextView nameaccount, @NonNull TextView recentActivity,
      @NonNull TextView servicePrice, @NonNull TextView statistic, @NonNull TextView textView10,
      @NonNull TextView textView16, @NonNull TextView textView18, @NonNull TextView textView20,
      @NonNull TextView textView21, @NonNull TextView textView22, @NonNull TextView textView7,
      @NonNull TextView typeJob, @NonNull TextView unitInformation) {
    this.rootView = rootView;
    this.SharForFF = SharForFF;
    this.accountAvt = accountAvt;
    this.bottomnavigation = bottomnavigation;
    this.buttonComback = buttonComback;
    this.buttonDate = buttonDate;
    this.buttonSeacrh = buttonSeacrh;
    this.buttonWarning = buttonWarning;
    this.chanepass = chanepass;
    this.chucvu = chucvu;
    this.editaccount = editaccount;
    this.emailaccount = emailaccount;
    this.intru = intru;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.liner1 = liner1;
    this.liner2 = liner2;
    this.logo = logo;
    this.logout = logout;
    this.nameaccount = nameaccount;
    this.recentActivity = recentActivity;
    this.servicePrice = servicePrice;
    this.statistic = statistic;
    this.textView10 = textView10;
    this.textView16 = textView16;
    this.textView18 = textView18;
    this.textView20 = textView20;
    this.textView21 = textView21;
    this.textView22 = textView22;
    this.textView7 = textView7;
    this.typeJob = typeJob;
    this.unitInformation = unitInformation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setting, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SharForFF;
      TextView SharForFF = ViewBindings.findChildViewById(rootView, id);
      if (SharForFF == null) {
        break missingId;
      }

      id = R.id.accountAvt;
      CircleImageView accountAvt = ViewBindings.findChildViewById(rootView, id);
      if (accountAvt == null) {
        break missingId;
      }

      id = R.id.bottomnavigation;
      BottomNavigationView bottomnavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomnavigation == null) {
        break missingId;
      }

      id = R.id.buttonComback;
      Button buttonComback = ViewBindings.findChildViewById(rootView, id);
      if (buttonComback == null) {
        break missingId;
      }

      id = R.id.buttonDate;
      Button buttonDate = ViewBindings.findChildViewById(rootView, id);
      if (buttonDate == null) {
        break missingId;
      }

      id = R.id.buttonSeacrh;
      Button buttonSeacrh = ViewBindings.findChildViewById(rootView, id);
      if (buttonSeacrh == null) {
        break missingId;
      }

      id = R.id.buttonWarning;
      Button buttonWarning = ViewBindings.findChildViewById(rootView, id);
      if (buttonWarning == null) {
        break missingId;
      }

      id = R.id.chanepass;
      TextView chanepass = ViewBindings.findChildViewById(rootView, id);
      if (chanepass == null) {
        break missingId;
      }

      id = R.id.chucvu;
      TextView chucvu = ViewBindings.findChildViewById(rootView, id);
      if (chucvu == null) {
        break missingId;
      }

      id = R.id.editaccount;
      TextView editaccount = ViewBindings.findChildViewById(rootView, id);
      if (editaccount == null) {
        break missingId;
      }

      id = R.id.emailaccount;
      TextView emailaccount = ViewBindings.findChildViewById(rootView, id);
      if (emailaccount == null) {
        break missingId;
      }

      id = R.id.intru;
      TextView intru = ViewBindings.findChildViewById(rootView, id);
      if (intru == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.liner1;
      LinearLayout liner1 = ViewBindings.findChildViewById(rootView, id);
      if (liner1 == null) {
        break missingId;
      }

      id = R.id.liner2;
      LinearLayout liner2 = ViewBindings.findChildViewById(rootView, id);
      if (liner2 == null) {
        break missingId;
      }

      id = R.id.logo;
      TextView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.logout;
      TextView logout = ViewBindings.findChildViewById(rootView, id);
      if (logout == null) {
        break missingId;
      }

      id = R.id.nameaccount;
      TextView nameaccount = ViewBindings.findChildViewById(rootView, id);
      if (nameaccount == null) {
        break missingId;
      }

      id = R.id.recent_activity;
      TextView recentActivity = ViewBindings.findChildViewById(rootView, id);
      if (recentActivity == null) {
        break missingId;
      }

      id = R.id.service_price;
      TextView servicePrice = ViewBindings.findChildViewById(rootView, id);
      if (servicePrice == null) {
        break missingId;
      }

      id = R.id.statistic;
      TextView statistic = ViewBindings.findChildViewById(rootView, id);
      if (statistic == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.typeJob;
      TextView typeJob = ViewBindings.findChildViewById(rootView, id);
      if (typeJob == null) {
        break missingId;
      }

      id = R.id.unitInformation;
      TextView unitInformation = ViewBindings.findChildViewById(rootView, id);
      if (unitInformation == null) {
        break missingId;
      }

      return new ActivitySettingBinding((ConstraintLayout) rootView, SharForFF, accountAvt,
          bottomnavigation, buttonComback, buttonDate, buttonSeacrh, buttonWarning, chanepass,
          chucvu, editaccount, emailaccount, intru, linearLayout, linearLayout2, liner1, liner2,
          logo, logout, nameaccount, recentActivity, servicePrice, statistic, textView10,
          textView16, textView18, textView20, textView21, textView22, textView7, typeJob,
          unitInformation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
