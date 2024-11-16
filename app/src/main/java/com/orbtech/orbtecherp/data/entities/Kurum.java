package com.orbtech.orbtecherp.data.entities;

public class Kurum {
    private int KURUM_ID;
    private int KURUM_TIPI; // 0-Belirsiz 1-Tedarikçi 2-Müşteri 3-Tedarikçi/Müşteri
    private String KURUM_ADI;
    private String KURUM_ACIKLAMA;
    private String KURUM_ADRESI;
    private String KURUM_HESAP_NO;
    private String KURUM_IBAN;
    private String KURUM_TC_NO;
    private String KURUM_VERGI_NO;
    private String KURUM_VERGI_DAIRESI;
    private String KURUM_YETKILI_UNVAN;
    private String KURUM_YETKILI_ADSOYAD;
    private String KURUM_YETKILI_TEL;
    private User USER;
    private String USER_DATE;
    private User UPD_USER;
    private String UPD_USER_DATE;

    // Getters and Setters
    public int getKURUM_ID() {
        return KURUM_ID;
    }

    public void setKURUM_ID(int KURUM_ID) {
        this.KURUM_ID = KURUM_ID;
    }

    public int getKURUM_TIPI() {
        return KURUM_TIPI;
    }

    public void setKURUM_TIPI(int KURUM_TIPI) {
        this.KURUM_TIPI = KURUM_TIPI;
    }

    public String getKURUM_ADI() {
        return KURUM_ADI;
    }

    public void setKURUM_ADI(String KURUM_ADI) {
        this.KURUM_ADI = KURUM_ADI;
    }

    public String getKURUM_ACIKLAMA() {
        return KURUM_ACIKLAMA;
    }

    public void setKURUM_ACIKLAMA(String KURUM_ACIKLAMA) {
        this.KURUM_ACIKLAMA = KURUM_ACIKLAMA;
    }

    public String getKURUM_ADRESI() {
        return KURUM_ADRESI;
    }

    public void setKURUM_ADRESI(String KURUM_ADRESI) {
        this.KURUM_ADRESI = KURUM_ADRESI;
    }

    public String getKURUM_HESAP_NO() {
        return KURUM_HESAP_NO;
    }

    public void setKURUM_HESAP_NO(String KURUM_HESAP_NO) {
        this.KURUM_HESAP_NO = KURUM_HESAP_NO;
    }

    public String getKURUM_IBAN() {
        return KURUM_IBAN;
    }

    public void setKURUM_IBAN(String KURUM_IBAN) {
        this.KURUM_IBAN = KURUM_IBAN;
    }

    public String getKURUM_TC_NO() {
        return KURUM_TC_NO;
    }

    public void setKURUM_TC_NO(String KURUM_TC_NO) {
        this.KURUM_TC_NO = KURUM_TC_NO;
    }

    public String getKURUM_VERGI_NO() {
        return KURUM_VERGI_NO;
    }

    public void setKURUM_VERGI_NO(String KURUM_VERGI_NO) {
        this.KURUM_VERGI_NO = KURUM_VERGI_NO;
    }

    public String getKURUM_VERGI_DAIRESI() {
        return KURUM_VERGI_DAIRESI;
    }

    public void setKURUM_VERGI_DAIRESI(String KURUM_VERGI_DAIRESI) {
        this.KURUM_VERGI_DAIRESI = KURUM_VERGI_DAIRESI;
    }

    public String getKURUM_YETKILI_UNVAN() {
        return KURUM_YETKILI_UNVAN;
    }

    public void setKURUM_YETKILI_UNVAN(String KURUM_YETKILI_UNVAN) {
        this.KURUM_YETKILI_UNVAN = KURUM_YETKILI_UNVAN;
    }

    public String getKURUM_YETKILI_ADSOYAD() {
        return KURUM_YETKILI_ADSOYAD;
    }

    public void setKURUM_YETKILI_ADSOYAD(String KURUM_YETKILI_ADSOYAD) {
        this.KURUM_YETKILI_ADSOYAD = KURUM_YETKILI_ADSOYAD;
    }

    public String getKURUM_YETKILI_TEL() {
        return KURUM_YETKILI_TEL;
    }

    public void setKURUM_YETKILI_TEL(String KURUM_YETKILI_TEL) {
        this.KURUM_YETKILI_TEL = KURUM_YETKILI_TEL;
    }

    public User getUSER() {
        return USER;
    }

    public void setUSER(User USER) {
        this.USER = USER;
    }

    public String getUSER_DATE() {
        return USER_DATE;
    }

    public void setUSER_DATE(String USER_DATE) {
        this.USER_DATE = USER_DATE;
    }

    public User getUPD_USER() {
        return UPD_USER;
    }

    public void setUPD_USER(User UPD_USER) {
        this.UPD_USER = UPD_USER;
    }

    public String getUPD_USER_DATE() {
        return UPD_USER_DATE;
    }

    public void setUPD_USER_DATE(String UPD_USER_DATE) {
        this.UPD_USER_DATE = UPD_USER_DATE;
    }
}

