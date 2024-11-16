package com.orbtech.orbtecherp.data.entities;

public class Fatura {
    private int FATURA_ID;
    private int FATURA_TIPI; // 0-Belirsiz 1-Alış 2-Satış
    private Kurum KURUM;
    private String KDVSIZ_FATURA_TUTARI;
    private String KDV_ORANI;
    private String FATURA_URL;
    private String FATURA_KESIM_TARIHI;
    private User USER;
    private String USER_DATE;
    private User UPD_USER;
    private String UPD_USER_DATE;
    private int IPT_KODU;
    private User IPT_USER;
    private String IPT_USER_DATE;

    // Getters and Setters
    public int getFATURA_ID() {
        return FATURA_ID;
    }

    public void setFATURA_ID(int FATURA_ID) {
        this.FATURA_ID = FATURA_ID;
    }

    public int getFATURA_TIPI() {
        return FATURA_TIPI;
    }

    public void setFATURA_TIPI(int FATURA_TIPI) {
        this.FATURA_TIPI = FATURA_TIPI;
    }

    public Kurum getKURUM() {
        return KURUM;
    }

    public void setKURUM(Kurum KURUM) {
        this.KURUM = KURUM;
    }

    public String getKDVSIZ_FATURA_TUTARI() {
        return KDVSIZ_FATURA_TUTARI;
    }

    public void setKDVSIZ_FATURA_TUTARI(String KDVSIZ_FATURA_TUTARI) {
        this.KDVSIZ_FATURA_TUTARI = KDVSIZ_FATURA_TUTARI;
    }

    public String getKDV_ORANI() {
        return KDV_ORANI;
    }

    public void setKDV_ORANI(String KDV_ORANI) {
        this.KDV_ORANI = KDV_ORANI;
    }

    public String getFATURA_URL() {
        return FATURA_URL;
    }

    public void setFATURA_URL(String FATURA_URL) {
        this.FATURA_URL = FATURA_URL;
    }

    public String getFATURA_KESIM_TARIHI() {
        return FATURA_KESIM_TARIHI;
    }

    public void setFATURA_KESIM_TARIHI(String FATURA_KESIM_TARIHI) {
        this.FATURA_KESIM_TARIHI = FATURA_KESIM_TARIHI;
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

    public int getIPT_KODU() {
        return IPT_KODU;
    }

    public void setIPT_KODU(int IPT_KODU) {
        this.IPT_KODU = IPT_KODU;
    }

    public User getIPT_USER() {
        return IPT_USER;
    }

    public void setIPT_USER(User IPT_USER) {
        this.IPT_USER = IPT_USER;
    }

    public String getIPT_USER_DATE() {
        return IPT_USER_DATE;
    }

    public void setIPT_USER_DATE(String IPT_USER_DATE) {
        this.IPT_USER_DATE = IPT_USER_DATE;
    }
}
