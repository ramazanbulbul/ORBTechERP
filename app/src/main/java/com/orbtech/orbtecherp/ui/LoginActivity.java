package com.orbtech.orbtecherp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.LifecycleOwner;

import com.orbtech.orbtecherp.R;
import com.orbtech.orbtecherp.data.entities.Fatura;
import com.orbtech.orbtecherp.data.entities.User;
import com.orbtech.orbtecherp.data.models.fatura.FaturaRequest;

public class LoginActivity extends BaseActivity {
    Button btnLogin;
    TextView txtUsername;
    TextView txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);

        userService.getResponse().observe((LifecycleOwner) _activity, response -> {
            if (response != null) {
                if (response.isSuccess()){
                    User user = (User) response.getResponseData();
                }
                toast.Show(response.getResponseMessage());
            }
        });

        faturaService.getResponse().observe((LifecycleOwner) _activity, response->{
            if (response != null) {
                if (response.isSuccess()){
                    Fatura fatura = (Fatura) response.getResponseData();
                }
                toast.Show(response.getResponseMessage());
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                LoginRequest request = new LoginRequest();
//                request.setUSERNAME(txtUsername.getText().toString());
//                request.setPASSWORD(txtPassword.getText().toString());
//                userService.login(request);

                FaturaRequest request = new FaturaRequest();
                request.setFATURA_ID(1);

                faturaService.getFatura(request);
            }
        });

    }
}
