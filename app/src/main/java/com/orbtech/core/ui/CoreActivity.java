package com.orbtech.core.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.orbtech.core.Core;
import com.orbtech.core.helpers.AlertHelper;
import com.orbtech.core.helpers.ToastHelper;
import com.orbtech.core.services.BluetoothService;

public class CoreActivity extends AppCompatActivity {
    public Activity _activity;
    public Context _context;
    public ToastHelper toast;
    public AlertHelper alert;
    public BluetoothService bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        _activity = this;
        _context = this.getApplicationContext();
        Core initialize = new Core(this._activity);
        this.toast = initialize.toast;
        this.alert = initialize.alert;
        this.bt = initialize.bt;
    }
}
