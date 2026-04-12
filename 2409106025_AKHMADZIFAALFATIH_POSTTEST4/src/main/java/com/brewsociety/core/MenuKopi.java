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

    // OVERLOADING 2 (Metode ke-1): Set harga normal
    public void setHarga(int harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif. Harga di-set ke 0.");
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }

    // OVERLOADING 3 (Metode ke-2): Set harga dengan tambahan potongan diskon khusus
    public void setHarga(int harga, int diskon) {
        int hargaSetelahDiskon = harga - diskon;
        if (hargaSetelahDiskon < 0) {
            System.out.println("Diskon terlalu besar. Harga di-set ke 0.");
            this.harga = 0;
        } else {
            this.harga = hargaSetelahDiskon;
        }
    }

    // OVERLOADING 4 (Metode ke-1): Tampilkan data normal
    public void tampilkan() {
        System.out.println("ID Menu: " + idMenu + " | Nama Kopi: " + namaKopi + " | Harga: Rp" + harga);
    }
    
    // OVERLOADING 5 (Metode ke-2): Tampilkan data dengan label "Menu Baru/Promo"
    public void tampilkan(String labelKhusus) {
        System.out.print("[" + labelKhusus + "] ");
        tampilkan(); 
    }
}