package com.orbtech.orbtecherp.data.entities;

public class PTB {
    private int PTB_ID;
    private String  MAC_ADDR;
    private Fatura FATURA;

    public int getPTB_ID() {
        return PTB_ID;
    }

    public void setPTB_ID(int PTB_ID) {
        this.PTB_ID = PTB_ID;
    }

    public String getMAC_ADDR() {
        return MAC_ADDR;
    }

    public void setMAC_ADDR(String MAC_ADDR) {
        this.MAC_ADDR = MAC_ADDR;
    }

    public Fatura getFATURA() {
        return FATURA;
    }

    public void setFATURA(Fatura FATURA) {
        this.FATURA = FATURA;
    }
}
