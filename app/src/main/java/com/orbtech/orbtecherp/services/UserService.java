package com.orbtech.orbtecherp.services;

import android.app.Activity;

import com.orbtech.core.data.models.ResponseObj;
import com.orbtech.orbtecherp.data.entities.User;
import com.orbtech.orbtecherp.data.models.user.LoginRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserService extends BaseService<User> {
    public UserService(Activity activity) {
        super(activity);

    }

    public void login(LoginRequest request) {
        Call<ResponseObj<User>> call = userRepository.Login(request);
        call.enqueue(new Callback<ResponseObj<User>>() {
            @Override
            public void onResponse(Call<ResponseObj<User>> call, Response<ResponseObj<User>> resp) {
                setResponse(new ResponseObj<User>(call, resp));
            }

            @Override
            public void onFailure(Call<ResponseObj<User>> call, Throwable t) {
                setResponse(new ResponseObj<User>(call, t));
            }
        });
    }
}
