package com.tuacy.databindingdev.adapter;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.databinding.BindingAdapterBinding;

public class BindingAdapterActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, BindingAdapterActivity.class));
	}

	private BindingAdapterBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter);
		initData();
	}

	private void initData() {
		mBinding.setName("Binding adapter");
		mBinding.setImageUrl("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1960816299,803825902&fm=27&gp=0.jpg");
	}

}
