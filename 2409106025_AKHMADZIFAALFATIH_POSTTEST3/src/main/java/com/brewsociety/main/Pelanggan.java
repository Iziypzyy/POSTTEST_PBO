package com.brewsociety.main;

import com.brewsociety.core.Pengguna; // Import Superclass

public class Pelanggan extends Pengguna {
    private String statusMember; // Misal: Gold, Silver, Non-Member

    public Pelanggan(String id, String nama, String statusMember) {
        super(id, nama); // Mewarisi id dan nama dari Pengguna
        this.statusMember = statusMember;
    }

    public String getStatusMember() { return statusMember; }
    public void setStatusMember(String statusMember) { this.statusMember = statusMember; }

    public void tampilkan() {
        System.out.println("ID Pelanggan: " + getId() + " | Nama: " + nama + " | Status Member: " + statusMember);
    }
}