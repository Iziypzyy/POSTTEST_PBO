package com.brewsociety.core;

public class MenuKopi {
    private String idMenu;
    private String namaKopi;
    private int harga;

    public MenuKopi(String idMenu, String namaKopi, int harga) {
        this.idMenu = idMenu;
        this.namaKopi = namaKopi;
        setHarga(harga);
    }

    public String getIdMenu() { return idMenu; }
    public void setIdMenu(String idMenu) { this.idMenu = idMenu; }
    public String getNamaKopi() { return namaKopi; }
    public void setNamaKopi(String namaKopi) { this.namaKopi = namaKopi; }
    public int getHarga() { return harga; }
    public void setHarga(int harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif. Harga di-set ke 0.");
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }
    public void setHarga(int harga, int diskon) {
        int hargaSetelahDiskon = harga - diskon;
        if (hargaSetelahDiskon < 0) {
            System.out.println("Diskon terlalu besar. Harga di-set ke 0.");
            this.harga = 0;
        } else {
            this.harga = hargaSetelahDiskon;
        }
    }
    public void tampilkan() {
        System.out.println("ID Menu: " + idMenu + " | Nama Kopi: " + namaKopi + " | Harga: Rp" + harga);
    }
    public void tampilkan(String labelKhusus) {
        System.out.print("[" + labelKhusus + "] ");
        tampilkan(); 
    }
}