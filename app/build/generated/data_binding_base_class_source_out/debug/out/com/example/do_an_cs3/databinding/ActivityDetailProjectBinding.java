// Generated by view binder compiler. Do not edit!
package com.example.do_an_cs3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.do_an_cs3.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailProjectBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView NameProrjectDetail;

  @NonNull
  public final TextView PossitonAndEmail;

  @NonNull
  public final TextView TimeCreationProjectDetail;

  @NonNull
  public final Button addTag;

  @NonNull
  public final Button addTask;

  @NonNull
  public final Button btnAddDiscussion;

  @NonNull
  public final Button btnBack;

  @NonNull
  public final Button btnDelete;

  @NonNull
  public final Button btnImportant;

  @NonNull
  public final Button btnReply;

  @NonNull
  public final Button btnViewMore;

  @NonNull
  public final Button buttonDate;

  @NonNull
  public final Button buttonSeacrh;

  @NonNull
  public final Button buttonWarning;

  @NonNull
  public final CircleImageView circleImageView;

  @NonNull
  public final CircleImageView circleImageViewComment;

  @NonNull
  public final CircleImageView circleImageViewWork;

  @NonNull
  public final LinearLayout discussionContainer;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout lnRCVTask;

  @NonNull
  public final TextView logo;

  @NonNull
  public final RecyclerView rcvTask;

  @NonNull
  public final RecyclerView rcvUserFollow;

  @NonNull
  public final TextView tvDeadlineDetail;

  @NonNull
  public final TextView tvEmailDetail;

  @NonNull
  public final TextView tvStatusDetail;

  @NonNull
  public final TextView tvStatusFile;

  @NonNull
  public final TextView tvUserNameDetail;

  @NonNull
  public final TextView tvViews;

  @NonNull
  public final TextView tvprojectContext;

  @NonNull
  public final TextView userNameNguoiThucHien;

  private ActivityDetailProjectBinding(@NonNull FrameLayout rootView,
      @NonNull TextView NameProrjectDetail, @NonNull TextView PossitonAndEmail,
      @NonNull TextView TimeCreationProjectDetail, @NonNull Button addTag, @NonNull Button addTask,
      @NonNull Button btnAddDiscussion, @NonNull Button btnBack, @NonNull Button btnDelete,
      @NonNull Button btnImportant, @NonNull Button btnReply, @NonNull Button btnViewMore,
      @NonNull Button buttonDate, @NonNull Button buttonSeacrh, @NonNull Button buttonWarning,
      @NonNull CircleImageView circleImageView, @NonNull CircleImageView circleImageViewComment,
      @NonNull CircleImageView circleImageViewWork, @NonNull LinearLayout discussionContainer,
      @NonNull LinearLayout linearLayout, @NonNull LinearLayout lnRCVTask, @NonNull TextView logo,
      @NonNull RecyclerView rcvTask, @NonNull RecyclerView rcvUserFollow,
      @NonNull TextView tvDeadlineDetail, @NonNull TextView tvEmailDetail,
      @NonNull TextView tvStatusDetail, @NonNull TextView tvStatusFile,
      @NonNull TextView tvUserNameDetail, @NonNull TextView tvViews,
      @NonNull TextView tvprojectContext, @NonNull TextView userNameNguoiThucHien) {
    this.rootView = rootView;
    this.NameProrjectDetail = NameProrjectDetail;
    this.PossitonAndEmail = PossitonAndEmail;
    this.TimeCreationProjectDetail = TimeCreationProjectDetail;
    this.addTag = addTag;
    this.addTask = addTask;
    this.btnAddDiscussion = btnAddDiscussion;
    this.btnBack = btnBack;
    this.btnDelete = btnDelete;
    this.btnImportant = btnImportant;
    this.btnReply = btnReply;
    this.btnViewMore = btnViewMore;
    this.buttonDate = buttonDate;
    this.buttonSeacrh = buttonSeacrh;
    this.buttonWarning = buttonWarning;
    this.circleImageView = circleImageView;
    this.circleImageViewComment = circleImageViewComment;
    this.circleImageViewWork = circleImageViewWork;
    this.discussionContainer = discussionContainer;
    this.linearLayout = linearLayout;
    this.lnRCVTask = lnRCVTask;
    this.logo = logo;
    this.rcvTask = rcvTask;
    this.rcvUserFollow = rcvUserFollow;
    this.tvDeadlineDetail = tvDeadlineDetail;
    this.tvEmailDetail = tvEmailDetail;
    this.tvStatusDetail = tvStatusDetail;
    this.tvStatusFile = tvStatusFile;
    this.tvUserNameDetail = tvUserNameDetail;
    this.tvViews = tvViews;
    this.tvprojectContext = tvprojectContext;
    this.userNameNguoiThucHien = userNameNguoiThucHien;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailProjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_project, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailProjectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.NameProrjectDetail;
      TextView NameProrjectDetail = ViewBindings.findChildViewById(rootView, id);
      if (NameProrjectDetail == null) {
        break missingId;
      }

      id = R.id.PossitonAndEmail;
      TextView PossitonAndEmail = ViewBindings.findChildViewById(rootView, id);
      if (PossitonAndEmail == null) {
        break missingId;
      }

      id = R.id.TimeCreationProjectDetail;
      TextView TimeCreationProjectDetail = ViewBindings.findChildViewById(rootView, id);
      if (TimeCreationProjectDetail == null) {
        break missingId;
      }

      id = R.id.addTag;
      Button addTag = ViewBindings.findChildViewById(rootView, id);
      if (addTag == null) {
        break missingId;
      }

      id = R.id.addTask;
      Button addTask = ViewBindings.findChildViewById(rootView, id);
      if (addTask == null) {
        break missingId;
      }

      id = R.id.btnAddDiscussion;
      Button btnAddDiscussion = ViewBindings.findChildViewById(rootView, id);
      if (btnAddDiscussion == null) {
        break missingId;
      }

      id = R.id.btnBack;
      Button btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnDelete;
      Button btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btnImportant;
      Button btnImportant = ViewBindings.findChildViewById(rootView, id);
      if (btnImportant == null) {
        break missingId;
      }

      id = R.id.btnReply;
      Button btnReply = ViewBindings.findChildViewById(rootView, id);
      if (btnReply == null) {
        break missingId;
      }

      id = R.id.btnViewMore;
      Button btnViewMore = ViewBindings.findChildViewById(rootView, id);
      if (btnViewMore == null) {
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

      id = R.id.circleImageView;
      CircleImageView circleImageView = ViewBindings.findChildViewById(rootView, id);
      if (circleImageView == null) {
        break missingId;
      }

      id = R.id.circleImageViewComment;
      CircleImageView circleImageViewComment = ViewBindings.findChildViewById(rootView, id);
      if (circleImageViewComment == null) {
        break missingId;
      }

      id = R.id.circleImageViewWork;
      CircleImageView circleImageViewWork = ViewBindings.findChildViewById(rootView, id);
      if (circleImageViewWork == null) {
        break missingId;
      }

      id = R.id.discussionContainer;
      LinearLayout discussionContainer = ViewBindings.findChildViewById(rootView, id);
      if (discussionContainer == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.lnRCVTask;
      LinearLayout lnRCVTask = ViewBindings.findChildViewById(rootView, id);
      if (lnRCVTask == null) {
        break missingId;
      }

      id = R.id.logo;
      TextView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.rcv_task;
      RecyclerView rcvTask = ViewBindings.findChildViewById(rootView, id);
      if (rcvTask == null) {
        break missingId;
      }

      id = R.id.rcv_userFollow;
      RecyclerView rcvUserFollow = ViewBindings.findChildViewById(rootView, id);
      if (rcvUserFollow == null) {
        break missingId;
      }

      id = R.id.tvDeadlineDetail;
      TextView tvDeadlineDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvDeadlineDetail == null) {
        break missingId;
      }

      id = R.id.tvEmailDetail;
      TextView tvEmailDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvEmailDetail == null) {
        break missingId;
      }

      id = R.id.tvStatusDetail;
      TextView tvStatusDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvStatusDetail == null) {
        break missingId;
      }

      id = R.id.tvStatusFile;
      TextView tvStatusFile = ViewBindings.findChildViewById(rootView, id);
      if (tvStatusFile == null) {
        break missingId;
      }

      id = R.id.tvUserNameDetail;
      TextView tvUserNameDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvUserNameDetail == null) {
        break missingId;
      }

      id = R.id.tvViews;
      TextView tvViews = ViewBindings.findChildViewById(rootView, id);
      if (tvViews == null) {
        break missingId;
      }

      id = R.id.tvprojectContext;
      TextView tvprojectContext = ViewBindings.findChildViewById(rootView, id);
      if (tvprojectContext == null) {
        break missingId;
      }

      id = R.id.userNameNguoiThucHien;
      TextView userNameNguoiThucHien = ViewBindings.findChildViewById(rootView, id);
      if (userNameNguoiThucHien == null) {
        break missingId;
      }

      return new ActivityDetailProjectBinding((FrameLayout) rootView, NameProrjectDetail,
          PossitonAndEmail, TimeCreationProjectDetail, addTag, addTask, btnAddDiscussion, btnBack,
          btnDelete, btnImportant, btnReply, btnViewMore, buttonDate, buttonSeacrh, buttonWarning,
          circleImageView, circleImageViewComment, circleImageViewWork, discussionContainer,
          linearLayout, lnRCVTask, logo, rcvTask, rcvUserFollow, tvDeadlineDetail, tvEmailDetail,
          tvStatusDetail, tvStatusFile, tvUserNameDetail, tvViews, tvprojectContext,
          userNameNguoiThucHien);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
