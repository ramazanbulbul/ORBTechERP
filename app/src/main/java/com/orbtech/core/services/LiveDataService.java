package com.orbtech.core.services;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.orbtech.core.data.models.ResponseObj;

public class LiveDataService<T> {
    private final MutableLiveData<ResponseObj<T>> response = new MutableLiveData<>();
    public LiveData<ResponseObj<T>> getResponse() {
        return response;
    }
    public void setResponse(ResponseObj<T> responseObj) {
        response.setValue(responseObj);
    }
}
