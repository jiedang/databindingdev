package com.tuacy.databindingdev.include;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.databinding.IncludeIncludeBinding;
import com.tuacy.databindingdev.entity.User;

public class IncludeBindingActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, IncludeBindingActivity.class));
	}

	private IncludeIncludeBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_include_binding);
		initData();
	}

	private void initData() {
		User user = new User("Test", "User");
		mBinding.setUser(user);
	}

}
