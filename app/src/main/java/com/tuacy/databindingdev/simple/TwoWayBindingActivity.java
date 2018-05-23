package com.tuacy.databindingdev.simple;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.tuacy.databindingdev.BR;
import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.databinding.DataRefreshBinding;
import com.tuacy.databindingdev.databinding.TwoWayBinding;

public class TwoWayBindingActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, TwoWayBindingActivity.class));
	}

	private TwoWayBinding  mBinding;
	private UserObservable mUser;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding);
		initData();
	}

	private void initData() {
		mBinding.setUser(mUser = new UserObservable("tuacy"));
		mUser.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
			@Override
			public void onPropertyChanged(Observable sender, int propertyId) {
				switch (propertyId) {
					case BR.userName:
						//数据变化了
						break;
				}
			}
		});
	}


}
