package com.tuacy.databindingdev.simple;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;


public class UserField {

	private ObservableField<String> userName;
	private ObservableInt           age;

	public UserField(ObservableField<String> userName, ObservableInt age) {
		this.userName = userName;
		this.age = age;
	}

	public ObservableField<String> getUserName() {
		return userName;
	}

	public void setUserName(ObservableField<String> userName) {
		this.userName = userName;
	}

	public ObservableInt getAge() {
		return age;
	}

	public void setAge(ObservableInt age) {
		this.age = age;
	}
}
