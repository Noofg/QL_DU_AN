// Generated by view binder compiler. Do not edit!
package com.example.do_an_cs3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.do_an_cs3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChooseRoleBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayout lnIdOrg;

  @NonNull
  public final LinearLayout lnLeader;

  @NonNull
  public final LinearLayout lnPersonally;

  @NonNull
  public final LinearLayout lnQRcode;

  @NonNull
  public final TextView tvAccountInfo;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvInstructions;

  private ActivityChooseRoleBinding(@NonNull ScrollView rootView, @NonNull LinearLayout lnIdOrg,
      @NonNull LinearLayout lnLeader, @NonNull LinearLayout lnPersonally,
      @NonNull LinearLayout lnQRcode, @NonNull TextView tvAccountInfo, @NonNull TextView tvHeader,
      @NonNull TextView tvInstructions) {
    this.rootView = rootView;
    this.lnIdOrg = lnIdOrg;
    this.lnLeader = lnLeader;
    this.lnPersonally = lnPersonally;
    this.lnQRcode = lnQRcode;
    this.tvAccountInfo = tvAccountInfo;
    this.tvHeader = tvHeader;
    this.tvInstructions = tvInstructions;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChooseRoleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChooseRoleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_choose_role, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChooseRoleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lnIdOrg;
      LinearLayout lnIdOrg = ViewBindings.findChildViewById(rootView, id);
      if (lnIdOrg == null) {
        break missingId;
      }

      id = R.id.lnLeader;
      LinearLayout lnLeader = ViewBindings.findChildViewById(rootView, id);
      if (lnLeader == null) {
        break missingId;
      }

      id = R.id.lnPersonally;
      LinearLayout lnPersonally = ViewBindings.findChildViewById(rootView, id);
      if (lnPersonally == null) {
        break missingId;
      }

      id = R.id.lnQRcode;
      LinearLayout lnQRcode = ViewBindings.findChildViewById(rootView, id);
      if (lnQRcode == null) {
        break missingId;
      }

      id = R.id.tvAccountInfo;
      TextView tvAccountInfo = ViewBindings.findChildViewById(rootView, id);
      if (tvAccountInfo == null) {
        break missingId;
      }

      id = R.id.tvHeader;
      TextView tvHeader = ViewBindings.findChildViewById(rootView, id);
      if (tvHeader == null) {
        break missingId;
      }

      id = R.id.tvInstructions;
      TextView tvInstructions = ViewBindings.findChildViewById(rootView, id);
      if (tvInstructions == null) {
        break missingId;
      }

      return new ActivityChooseRoleBinding((ScrollView) rootView, lnIdOrg, lnLeader, lnPersonally,
          lnQRcode, tvAccountInfo, tvHeader, tvInstructions);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
