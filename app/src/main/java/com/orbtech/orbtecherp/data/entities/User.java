package com.orbtech.orbtecherp.data.entities;

public class User {
    private int USER_KODU;
    private String USER_ADI;
    private String USER_KULLANICI_ADI;
    private String USER_PASSWORD;
    private String USER_DATE;
    private String USER_EPOSTA;
    private int PASIF;

    // Getters and Setters
    public int getUSER_KODU() {
        return USER_KODU;
    }

    public void setUSER_KODU(int USER_KODU) {
        this.USER_KODU = USER_KODU;
    }

    public String getUSER_ADI() {
        return USER_ADI;
    }

    public void setUSER_ADI(String USER_ADI) {
        this.USER_ADI = USER_ADI;
    }

    public String getUSER_KULLANICI_ADI() {
        return USER_KULLANICI_ADI;
    }

    public void setUSER_KULLANICI_ADI(String USER_KULLANICI_ADI) {
        this.USER_KULLANICI_ADI = USER_KULLANICI_ADI;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public void setUSER_PASSWORD(String USER_PASSWORD) {
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public String getUSER_DATE() {
        return USER_DATE;
    }

    public void setUSER_DATE(String USER_DATE) {
        this.USER_DATE = USER_DATE;
    }

    public String getUSER_EPOSTA() {
        return USER_EPOSTA;
    }

    public void setUSER_EPOSTA(String USER_EPOSTA) {
        this.USER_EPOSTA = USER_EPOSTA;
    }

    public int getPASIF() {
        return PASIF;
    }

    public void setPASIF(int PASIF) {
        this.PASIF = PASIF;
    }
}
