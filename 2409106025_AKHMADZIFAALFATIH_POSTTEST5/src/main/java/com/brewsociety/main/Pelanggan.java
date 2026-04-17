package com.brewsociety.main;

public class Pelanggan extends Pengguna {
    private String statusMember;

    public Pelanggan(String id, String nama, String statusMember) {
        super(id, nama); 
        this.statusMember = statusMember;
    }

    public String getStatusMember() { return statusMember; }
    public void setStatusMember(String statusMember) { this.statusMember = statusMember; }

    @Override
    public void tampilkan() {
        System.out.println("ID Pelanggan: " + getId() + " | Nama: " + getNama() + " | Status Member: " + statusMember);
    }
}