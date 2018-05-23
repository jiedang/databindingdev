package com.tuacy.databindingdev.recycler;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageViewModel {

	private String imageUrl;

	public ImageViewModel(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	@BindingAdapter({"app:imageUrl"})
	public static void loadImage(ImageView view, String imageUrl) {
		Picasso.with(view.getContext()).load(imageUrl).into(view);
	}
}
