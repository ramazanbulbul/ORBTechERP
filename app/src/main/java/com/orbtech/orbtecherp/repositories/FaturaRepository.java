package com.orbtech.orbtecherp.repositories;

import com.orbtech.core.data.models.ResponseObj;
import com.orbtech.orbtecherp.data.entities.Fatura;
import com.orbtech.orbtecherp.data.models.fatura.FaturaRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface FaturaRepository {
    @POST("api/FTR/GetFatura")
    Call<ResponseObj<Fatura>> getFatura(@Body FaturaRequest request);
}
