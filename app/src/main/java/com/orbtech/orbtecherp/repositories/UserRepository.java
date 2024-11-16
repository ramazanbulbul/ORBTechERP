package com.orbtech.orbtecherp.repositories;

import com.orbtech.core.data.models.ResponseObj;
import com.orbtech.orbtecherp.data.entities.User;
import com.orbtech.orbtecherp.data.models.user.LoginRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserRepository {
    @POST("api/User/Login")
    Call<ResponseObj<User>> Login(@Body LoginRequest request);
}
