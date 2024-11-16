package com.orbtech.orbtecherp.ui;

import android.os.Bundle;

import com.orbtech.core.ui.CoreActivity;
import com.orbtech.orbtecherp.services.FaturaService;
import com.orbtech.orbtecherp.services.UserService;

public class BaseActivity extends CoreActivity {
    public UserService userService;
    public FaturaService faturaService;
    public BaseActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize userService with 'this' context
        userService = new UserService(this);
        faturaService = new FaturaService(this);
    }
}
