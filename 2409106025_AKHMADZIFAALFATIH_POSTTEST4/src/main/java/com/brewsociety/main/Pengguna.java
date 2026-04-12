package com.brewsociety.main;

public class Pengguna {
    protected String id; // Menggunakan protected agar mudah diakses oleh child class
    protected String nama;

    public Pengguna(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    // Method dasar yang akan di-OVERRIDE oleh class turunannya
    public void tampilkan() {
        System.out.println("ID: " + id + " | Nama: " + nama);
    }

    // OVERLOADING 1: Method tampilkan() dengan parameter untuk variasi cetak
    public void tampilkan(boolean withBorder) {
        if (withBorder) System.out.println("=======================================");
        tampilkan(); // Memanggil method tampilkan() normal
        if (withBorder) System.out.println("=======================================");
    }
}