package com.brewsociety.main;

public class Barista extends Pengguna implements Operasional {
    private String shiftKerja;

    public Barista(String id, String nama, String shiftKerja) {
        super(id, nama);
        this.shiftKerja = shiftKerja;
    }

    public String getShiftKerja() { return shiftKerja; }
    public void setShiftKerja(String shiftKerja) { this.shiftKerja = shiftKerja; }

    @Override
    public void tampilkan() {
        System.out.println("ID Barista: " + getId() + " | Nama: " + getNama() + " | Shift: " + shiftKerja);
    }

    @Override
    public void mulaiTugas() {
        System.out.println("[SISTEM] Barista " + getNama() + " telah absen masuk untuk shift " + shiftKerja + ".");
    }

    @Override
    public void selesaiTugas() {
        System.out.println("[SISTEM] Barista " + getNama() + " telah mengakhiri shift " + shiftKerja + ".");
    }
}