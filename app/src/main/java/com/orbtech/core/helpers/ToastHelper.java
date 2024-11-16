package com.orbtech.core.helpers;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ToastHelper {
    public Activity _activity;
    public Context _context;
    public ToastHelper(Activity activity){
        _activity = activity;
        _context = activity.getApplicationContext();
    }
    public void Show(String message){
        Toast.makeText(_context, message, Toast.LENGTH_SHORT).show();
    }
    public void Show(String message, int duration){
        Toast.makeText(_context, message, duration).show();
    }
}
