package com.tuacy.databindingdev.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.tuacy.databindingdev.BR;

public class UserObservable extends BaseObservable {

	private String userName;

	public UserObservable(String userName) {
		this.userName = userName;
	}

	@Bindable
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		notifyPropertyChanged(BR.userName);//通知变化
	}
}
