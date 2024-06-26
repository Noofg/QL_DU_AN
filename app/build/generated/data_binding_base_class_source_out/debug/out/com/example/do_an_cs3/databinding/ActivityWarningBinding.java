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
import androidx.viewpager.widget.ViewPager;
import com.example.do_an_cs3.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWarningBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonHome;

  @NonNull
  public final Button buttondatejob;

  @NonNull
  public final Button comeback;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView logo;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final ViewPager viewpager;

  private ActivityWarningBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonHome,
      @NonNull Button buttondatejob, @NonNull Button comeback, @NonNull LinearLayout linearLayout,
      @NonNull TextView logo, @NonNull TabLayout tabLayout, @NonNull ViewPager viewpager) {
    this.rootView = rootView;
    this.buttonHome = buttonHome;
    this.buttondatejob = buttondatejob;
    this.comeback = comeback;
    this.linearLayout = linearLayout;
    this.logo = logo;
    this.tabLayout = tabLayout;
    this.viewpager = viewpager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWarningBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWarningBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_warning, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWarningBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonHome;
      Button buttonHome = ViewBindings.findChildViewById(rootView, id);
      if (buttonHome == null) {
        break missingId;
      }

      id = R.id.buttondatejob;
      Button buttondatejob = ViewBindings.findChildViewById(rootView, id);
      if (buttondatejob == null) {
        break missingId;
      }

      id = R.id.comeback;
      Button comeback = ViewBindings.findChildViewById(rootView, id);
      if (comeback == null) {
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

      id = R.id.tabLayout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.viewpager;
      ViewPager viewpager = ViewBindings.findChildViewById(rootView, id);
      if (viewpager == null) {
        break missingId;
      }

      return new ActivityWarningBinding((ConstraintLayout) rootView, buttonHome, buttondatejob,
          comeback, linearLayout, logo, tabLayout, viewpager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
