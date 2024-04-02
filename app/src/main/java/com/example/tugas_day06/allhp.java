package com.example.tugas_day06;

public class allhp {
    private String namahp;
    private int logohp;
    private String deskripsi;
    private String harga;

    public allhp(String namahp, int logohp, String deskripsi, String harga) {
        this.namahp = namahp;
        this.logohp = logohp;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public String getNamahp() {
        return namahp;
    }

    public void setNamahp(String namahp) {
        this.namahp = namahp;
    }

    public int getLogohp() {
        return logohp;
    }

    public void setLogohp(int logohp) {
        this.logohp = logohp;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
