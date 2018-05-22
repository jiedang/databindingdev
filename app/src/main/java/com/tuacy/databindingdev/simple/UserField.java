package com.tuacy.databindingdev.simple;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;


public class UserField extends BaseObservable {

    private ObservableField<String> userName;

    public UserField(ObservableField<String> userName) {
        this.userName = userName;
    }

    public ObservableField<String> getUserName() {
        return userName;
    }

    public void setUserName(ObservableField<String> userName) {
        this.userName = userName;
    }
}
