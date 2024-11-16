package com.orbtech.core.data.enums;

public enum ResponseType {
    SUCCESS(0, true),
    ERROR(-1, false),
    BLUETOOTH_ERROR(-1, false),
    API_ERROR(-1, false),
    EXCEPTION_ERROR(-9999, false);
    private final int value;
    private final boolean isSuccess;
    ResponseType(int value, boolean isSuccess){
        this.value = value;
        this.isSuccess = isSuccess;
    }
    public int getValue(){
        return value;
    }
    public boolean isSuccess(){
        return isSuccess;
    }
}
