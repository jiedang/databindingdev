package com.tuacy.databindingdev.simple;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.entity.User;
import com.tuacy.databindingdev.databinding.NoFindViewByIdBinding;

public class NoFindViewByIdActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, NoFindViewByIdActivity.class));
	}

	private NoFindViewByIdBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_no_find_view_by_id);
		initData();
	}

	private void initData() {
		mBinding.setUser(new User("Test", "User"));

		/**
		 * 通过mBinding就直接拿到了Button对象(布局文件里面已经写了id，android:id="@+id/button_name" 所以对象的名字是buttonName)，
		 * 不需要findViewById()了
		 */
		mBinding.buttonName.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mBinding.buttonName.setText("abc");
			}
		});
	}

}
