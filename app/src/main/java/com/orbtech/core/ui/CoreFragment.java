package com.orbtech.core.ui;

import android.app.Activity;
import android.content.Context;

import androidx.fragment.app.Fragment;

import com.orbtech.core.Core;
import com.orbtech.core.helpers.AlertHelper;
import com.orbtech.core.helpers.ToastHelper;
import com.orbtech.core.services.BluetoothService;

public class CoreFragment extends Fragment {
    public Activity _activity;
    public Context _context;
    public ToastHelper toast;
    public AlertHelper alert;
    public BluetoothService bt;
    public CoreFragment(Activity activity){
        _activity = activity;
        _context = activity.getApplicationContext();
        Core initialize = new Core(activity);
        this.toast = initialize.toast;
        this.alert = initialize.alert;
        this.bt = initialize.bt;
    }
}
