package com.brewsociety.main;

import com.brewsociety.core.Pengguna;

public class Manajer extends Pengguna {
    private String cabangToko;

    public Manajer(String id, String nama, String cabangToko) {
        super(id, nama);
        this.cabangToko = cabangToko;
    }

    public String getCabangToko() { return cabangToko; }
    public void setCabangToko(String cabangToko) { this.cabangToko = cabangToko; }

    public void tampilkan() {
        System.out.println("ID Manajer: " + getId() + " | Nama: " + nama + " | Kepala Cabang: " + cabangToko);
    }
}