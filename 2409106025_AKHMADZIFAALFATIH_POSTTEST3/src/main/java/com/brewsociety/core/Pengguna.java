package com.brewsociety.core;

public class Pengguna {
    // 1. PRIVATE: Hanya bisa diakses di dalam class ini. Kunci utama Encapsulation.
    private String id;

    // 2. PROTECTED: Bisa diakses oleh subclass di package yang berbeda.
    protected String nama;

    public Pengguna(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter untuk property private
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    // Getter dan Setter untuk property protected
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
}