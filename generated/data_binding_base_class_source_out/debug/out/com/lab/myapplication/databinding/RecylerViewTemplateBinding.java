// Generated by view binder compiler. Do not edit!
package com.lab.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lab.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecylerViewTemplateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgView;

  @NonNull
  public final TextView kalori;

  @NonNull
  public final TextView kelas;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView waktu;

  private RecylerViewTemplateBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgView,
      @NonNull TextView kalori, @NonNull TextView kelas, @NonNull TextView title,
      @NonNull TextView waktu) {
    this.rootView = rootView;
    this.imgView = imgView;
    this.kalori = kalori;
    this.kelas = kelas;
    this.title = title;
    this.waktu = waktu;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecylerViewTemplateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecylerViewTemplateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recyler_view_template, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecylerViewTemplateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_view;
      ImageView imgView = ViewBindings.findChildViewById(rootView, id);
      if (imgView == null) {
        break missingId;
      }

      id = R.id.kalori;
      TextView kalori = ViewBindings.findChildViewById(rootView, id);
      if (kalori == null) {
        break missingId;
      }

      id = R.id.kelas;
      TextView kelas = ViewBindings.findChildViewById(rootView, id);
      if (kelas == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.waktu;
      TextView waktu = ViewBindings.findChildViewById(rootView, id);
      if (waktu == null) {
        break missingId;
      }

      return new RecylerViewTemplateBinding((LinearLayout) rootView, imgView, kalori, kelas, title,
          waktu);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
