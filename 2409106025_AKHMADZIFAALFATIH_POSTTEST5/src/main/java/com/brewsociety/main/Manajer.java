package com.brewsociety.main;

public class Manajer extends Pengguna implements Operasional {
    private String cabangToko;

    public Manajer(String id, String nama, String cabangToko) {
        super(id, nama);
        this.cabangToko = cabangToko;
    }

    public String getCabangToko() { return cabangToko; }
    public void setCabangToko(String cabangToko) { this.cabangToko = cabangToko; }

    @Override
    public void tampilkan() {
        System.out.println("ID Manajer: " + getId() + " | Nama: " + nama + " | Kepala Cabang: " + cabangToko);
    }

    @Override
    public void mulaiTugas() {
        System.out.println("[SISTEM] Manajer " + getNama() + " membuka operasional toko cabang " + cabangToko + ".");
    }

    @Override
    public void selesaiTugas() {
        System.out.println("[SISTEM] Manajer " + getNama() + " menutup laporan harian cabang " + cabangToko + ".");
    }
}