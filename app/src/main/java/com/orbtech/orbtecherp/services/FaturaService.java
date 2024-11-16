package com.orbtech.orbtecherp.services;

import android.app.Activity;

import com.orbtech.core.data.models.ResponseObj;
import com.orbtech.orbtecherp.data.entities.Fatura;
import com.orbtech.orbtecherp.data.models.fatura.FaturaRequest;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FaturaService extends BaseService<Fatura> {
    public FaturaService(Activity activity) {
        super(activity);
    }

    public void getFatura(FaturaRequest request) {
        Call<ResponseObj<Fatura>> call = faturaRepository.getFatura(request);
        call.enqueue(new Callback<ResponseObj<Fatura>>() {
            @Override
            public void onResponse(Call<ResponseObj<Fatura>> call, Response<ResponseObj<Fatura>> resp) {
                setResponse(new ResponseObj<Fatura>(call, resp));
            }

            @Override
            public void onFailure(Call<ResponseObj<Fatura>> call, Throwable t) {
                setResponse(new ResponseObj<Fatura>(call, t));
            }
        });
    }
}