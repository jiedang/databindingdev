package com.tuacy.databindingdev.twowaybinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.databinding.CustomerTwoWayBinding;
import com.tuacy.databindingdev.entity.UserObservable;

public class CustomerTwoWayBindingActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, CustomerTwoWayBindingActivity.class));
	}

	private CustomerTwoWayBinding mBinding;
	private UserObservable        mUser;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_customer_two_way_binding);
		initData();
	}

	private void initData() {
		mBinding.setUser(mUser = new UserObservable("tuacyAAAA"));

		mBinding.buttonChange.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mBinding.customerView.setValue("改变数据");
			}
		});
	}


}
