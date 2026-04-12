package com.brewsociety.main;

public class Barista extends Pengguna {
    private String shiftKerja;

    public Barista(String id, String nama, String shiftKerja) {
        super(id, nama);
        this.shiftKerja = shiftKerja;
    }

    public String getShiftKerja() { return shiftKerja; }
    public void setShiftKerja(String shiftKerja) { this.shiftKerja = shiftKerja; }

    // OVERRIDE 2: Menimpa method tampilkan() dari Pengguna
    @Override
    public void tampilkan() {
        System.out.println("ID Barista: " + getId() + " | Nama: " + getNama() + " | Shift: " + shiftKerja);
    }
}