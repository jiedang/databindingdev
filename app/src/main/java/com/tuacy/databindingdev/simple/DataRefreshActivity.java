package com.tuacy.databindingdev.simple;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tuacy.databindingdev.databinding.DataRefreshBinding;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.entity.UserField;
import com.tuacy.databindingdev.entity.UserObservable;

public class DataRefreshActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, DataRefreshActivity.class));
	}

	private DataRefreshBinding                 mBinding;
	private UserObservable                     mUser;
	private UserField                          mUserField;
	private ObservableArrayMap<String, Object> mUserCollections;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_refresh);
		initData();
	}

	private void initData() {
		mBinding.setChangeEvent(new ChangeClickEvent());
		// Observable Object
		mBinding.setUser(mUser = new UserObservable("原始数据"));
		// Observable Field
		mBinding.setUserField(mUserField = new UserField(new ObservableField<>("原始数据"), new ObservableInt(27)));
		// Observable Collections
		mUserCollections = new ObservableArrayMap<>();
		mUserCollections.put("name", "tuacy");
		mUserCollections.put("age", 27);
		mBinding.setUserCollections(mUserCollections);
	}

	public class ChangeClickEvent {

		public void changeOnClick(View view) {
			mUser.setUserName("数据变化了");
			mUserField.getUserName().set("数据变化了");
			mUserField.getAge().set(28);
			mUserCollections.put("name", "名字变了");
			mUserCollections.put("age", 28);
		}
	}

}
