package com.tuacy.databindingdev.simple;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.tuacy.databindingdev.databinding.DataRefreshBinding;

import com.tuacy.databindingdev.R;

public class DataRefreshActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, DataRefreshActivity.class));
	}

	private DataRefreshBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_refresh);
		initData();
	}

	private void initData() {
		mBinding.setUser(new UserObservable("Test"));
	}

}
