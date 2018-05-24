package com.tuacy.databindingdev;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BindingAdapterModel {

	@BindingAdapter({"imageUrl"})
	public static void loadImage(ImageView view, String imageUrl) {
		Picasso.with(view.getContext()).load(imageUrl).into(view);
	}
}
