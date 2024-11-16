package com.orbtech.orbtecherp.services;

import android.app.Activity;

import com.orbtech.core.services.CoreService;
import com.orbtech.core.services.RetrofitService;
import com.orbtech.orbtecherp.repositories.FaturaRepository;
import com.orbtech.orbtecherp.repositories.UserRepository;

import retrofit2.Retrofit;

public class BaseService<T> extends CoreService<T> {
    public UserRepository userRepository;
    public FaturaRepository faturaRepository;
    public BaseService(Activity activity) {
        super(activity);
        RetrofitService retroService = new RetrofitService("http://www.orbteknoloji.com/");
        Retrofit retrofit = retroService.getInstance();
        userRepository = retrofit.create(UserRepository.class);
        faturaRepository = retrofit.create(FaturaRepository.class);
    }
}
