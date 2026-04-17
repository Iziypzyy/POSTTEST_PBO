package com.brewsociety.main;

public abstract class Pengguna {
    protected String id;
    protected String nama;

    public Pengguna(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public abstract void tampilkan();

    public void tampilkan(boolean withBorder) {
        if (withBorder) System.out.println("=======================================");
        tampilkan();
        if (withBorder) System.out.println("=======================================");
    }
}