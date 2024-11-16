package com.orbtech.core;

import android.app.Activity;

import com.orbtech.core.helpers.AlertHelper;
import com.orbtech.core.helpers.ToastHelper;
import com.orbtech.core.services.BluetoothService;

public class Core {
    public ToastHelper toast;
    public AlertHelper alert;
    public BluetoothService bt;

    public Core(Activity activity){
        toast = new ToastHelper(activity);
        alert = new AlertHelper(activity);
        bt = new BluetoothService(activity);
    }
}
