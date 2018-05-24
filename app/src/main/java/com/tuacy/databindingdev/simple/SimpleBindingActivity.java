package com.tuacy.databindingdev.simple;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.entity.User;

public class SimpleBindingActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, SimpleBindingActivity.class));
	}

	private SimpleBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_simple_binding);
		initData();
	}

	private void initData() {
		mBinding.setUser(new User("展示用户名", "展示用户密码"));
	}

}
