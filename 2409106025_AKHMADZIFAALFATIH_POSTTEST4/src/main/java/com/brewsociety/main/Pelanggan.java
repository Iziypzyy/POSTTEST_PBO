package com.brewsociety.main;

public class Pelanggan extends Pengguna {
    private String statusMember;

    public Pelanggan(String id, String nama, String statusMember) {
        super(id, nama); // Memanggil constructor superclass
        this.statusMember = statusMember;
    }

    public String getStatusMember() { return statusMember; }
    public void setStatusMember(String statusMember) { this.statusMember = statusMember; }

    // OVERRIDE 1: Menimpa method tampilkan() dari Pengguna
    @Override
    public void tampilkan() {
        System.out.println("ID Pelanggan: " + getId() + " | Nama: " + getNama() + " | Status Member: " + statusMember);
    }
}