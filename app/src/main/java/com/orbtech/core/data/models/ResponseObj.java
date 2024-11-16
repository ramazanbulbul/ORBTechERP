package com.orbtech.core.data.models;

import com.orbtech.core.data.enums.ResponseType;

import retrofit2.Call;
import retrofit2.Response;

public class ResponseObj<T> {
    private int ResponseCode;
    private String ResponseMessage;
    private T ResponseData;
    private boolean IsSuccess;

    public ResponseObj(){
        this.ResponseCode = ResponseType.SUCCESS.getValue();
        this.ResponseMessage = getDefaultResponseMessage(ResponseType.SUCCESS);
        this.IsSuccess = true;
    }
    public ResponseObj(Exception ex) {
        ResponseType responseType = ResponseType.EXCEPTION_ERROR;
        this.IsSuccess = responseType.isSuccess();
        this.ResponseMessage = ex.getMessage();
        this.ResponseCode = ResponseType.ERROR.getValue();
    }
    public ResponseObj(ResponseType responseType) {
        this.IsSuccess = responseType == ResponseType.SUCCESS;
        this.ResponseMessage = getDefaultResponseMessage(responseType);
        this.ResponseCode = responseType.getValue();
    }
    public ResponseObj(ResponseType responseType, String responseMessage) {
        this.IsSuccess = responseType == ResponseType.SUCCESS;
        this.ResponseMessage = responseMessage;
        this.ResponseCode = responseType.getValue();
    }
    public ResponseObj(ResponseType responseType, T responseData) {
        this.IsSuccess = responseType == ResponseType.SUCCESS;
        this.ResponseData = responseData;
        this.ResponseCode = responseType.getValue();
    }
    public ResponseObj(ResponseType responseType, T responseData, String responseMessage) {
        this.IsSuccess = responseType == ResponseType.SUCCESS;
        this.ResponseData = responseData;
        this.ResponseMessage = responseMessage;
        this.ResponseCode = responseType.getValue();
    }
    public ResponseObj(Call<ResponseObj<T>> call, Response<ResponseObj<T>> resp){
        if ( resp.isSuccessful() && resp.body() != null){
            this.setResponseCode(resp.body().ResponseCode);
            this.setResponseData(resp.body().ResponseData);
            this.setResponseMessage(resp.body().getResponseMessage());
        }else {
            this.setResponseCode(resp.code());
            this.setResponseMessage(resp.code() + " " + resp.message());
        }
    }
    public ResponseObj(Call<ResponseObj<T>> call, Throwable t){
        this(ResponseType.API_ERROR, t.getMessage());
    }


    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int responseCode) {
        ResponseCode = responseCode;
    }

    public String getResponseMessage() {
        return ResponseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        ResponseMessage = responseMessage;
    }

    public T getResponseData() {
        return ResponseData;
    }

    public void setResponseData(T responseData) {
        ResponseData = responseData;
    }

    public boolean isSuccess() {
        return IsSuccess;
    }

    public void setSuccess(boolean success) {
        IsSuccess = success;
    }

    private String getDefaultResponseMessage(ResponseType responseType){
        switch (responseType){
            case SUCCESS:
                return "İşlem Başarılı";
            case ERROR:
                return "Hata";
            default:
                return "TEKNİK EKİP İLE GÖRÜŞÜNÜZ!!";
        }
    }
}
