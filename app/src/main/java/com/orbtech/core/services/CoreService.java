package com.orbtech.core.services;

import android.app.Activity;
import android.content.Context;

public class CoreService<T> extends LiveDataService<T>{
    public Activity activity;
    public Context context;
    public CoreService(Activity activity){
        this.activity = activity;
        this.context = activity.getApplicationContext();
    }
}
