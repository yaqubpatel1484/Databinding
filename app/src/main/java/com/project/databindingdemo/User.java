package com.project.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


public class User extends BaseObservable {

     String strName;

    public User() {

    }

    public User(String strName) {
        this.strName = strName;
    }

    @Bindable
    public String getStrName() {
        return strName;
    }

@Bindable
    public void setStrName(String strName) {
        this.strName = strName;
        notifyPropertyChanged(BR.strName);
    }
}
