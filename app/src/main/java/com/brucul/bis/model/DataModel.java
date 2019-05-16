package com.brucul.bis.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class DataModel {
    @SerializedName("kode")
    private String mKode;

    @SerializedName("nama")
    private String mNama;

    @SerializedName("trayek")
    private String mTrayek;

    public String getmKode() {
        return mKode;
    }

    public void setmKode(String mKode) {
        this.mKode = mKode;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmTrayek() {
        return mTrayek;
    }

    public void setmTrayek(String mTrayek) {
        this.mTrayek = mTrayek;
    }
}
