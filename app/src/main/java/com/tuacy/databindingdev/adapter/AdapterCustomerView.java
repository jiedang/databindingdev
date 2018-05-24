package com.tuacy.databindingdev.adapter;

import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;

@BindingMethods({
	@BindingMethod(
		type = com.tuacy.databindingdev.adapter.AdapterCustomerView.class,
		attribute = "android:text",
		method = "setName"
	),
})
public class AdapterCustomerView extends AppCompatTextView {

	public AdapterCustomerView(Context context) {
		super(context);
	}

	public AdapterCustomerView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public AdapterCustomerView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public void setName(String name) {
		Log.d("tuacy", "setName setName = " + name);
		setText(name);
	}
}
