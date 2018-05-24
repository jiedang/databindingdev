package com.tuacy.databindingdev.eventbinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tuacy.databindingdev.R;
import com.tuacy.databindingdev.entity.User;
import com.tuacy.databindingdev.databinding.EventBinding;

public class EventBindingActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, EventBindingActivity.class));
	}

	private EventBinding mBinding;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_event_binding);
		initData();
	}

	private void initData() {
		mBinding.setButtonClick(new ButtonClickHandler());
		mBinding.setUser(new User("tuacy", "tuacy"));
	}

	public class ButtonClickHandler {

		/**
		 * Method References(方法调用)
		 */
		public void onMethodButtonClick(View view) {
			mBinding.buttonMethodReferences.setText("点击了");
		}

		/**
		 * Listener Bindings(监听绑定)
		 *
		 * @param user 可以带参数
		 */
		public void onBindingsButtonClick(User user) {
			mBinding.buttonListenerBindings.setText("点击了 " + user.getFirstName());
		}
	}


}
