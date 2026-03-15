package com.brewsociety.main;

// Import class dari package core
import org.apache.commons.lang3.StringUtils;

import com.brewsociety.core.Pengguna; 

public class Barista extends Pengguna {
    private String shiftKerja;

    public Barista(String id, String nama, String shiftKerja) {
        super(id, nama);
        this.shiftKerja = shiftKerja;
    }

    public String getShiftKerja() { return shiftKerja; }
    public void setShiftKerja(String shiftKerja) { this.shiftKerja = shiftKerja; }

    public void tampilkan() {
        // Menerapkan method capitalize dari package eksternal commons-lang3
        String namaKapital = StringUtils.capitalize(this.nama); // Mengakses 'nama' secara langsung karena modifier PROTECTED
        
        System.out.println("ID Barista: " + getId() + " | Nama: " + namaKapital + " | Shift: " + shiftKerja);
        
        // Error jika mencoba mengakses properti DEFAULT (kategoriSistem) di sini:
        // System.out.println(this.kategoriSistem); 
    }
}