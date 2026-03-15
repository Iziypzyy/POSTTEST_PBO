package com.brewsociety.main;

public class Pelanggan {
    // 1. Ubah menjadi private
    private String idPelanggan;
    private String nama;
    private String statusMember; // Misal: Gold, Silver, Non-Member

    public Pelanggan(String idPelanggan, String nama, String statusMember) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.statusMember = statusMember;
    }

    // 2. Tambahkan Getter dan Setter
    public String getIdPelanggan() { return idPelanggan; }
    public void setIdPelanggan(String idPelanggan) { this.idPelanggan = idPelanggan; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getStatusMember() { return statusMember; }
    public void setStatusMember(String statusMember) { this.statusMember = statusMember; }

    public void tampilkan() {
        System.out.println("ID Pelanggan: " + idPelanggan + " | Nama: " + nama + " | Status Member: " + statusMember);
    }
}