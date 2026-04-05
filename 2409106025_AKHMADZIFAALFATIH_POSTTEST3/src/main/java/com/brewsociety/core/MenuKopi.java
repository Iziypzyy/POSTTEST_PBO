package com.brewsociety.core;

public final class MenuKopi {
    private String idMenu;
    private String namaKopi;
    private int harga;

    public MenuKopi(String idMenu, String namaKopi, int harga) {
        this.idMenu = idMenu;
        this.namaKopi = namaKopi;
        setHarga(harga); // menggunakan setter untuk validasi saat objek dibuat
    }

    public String getIdMenu() { return idMenu; }
    public void setIdMenu(String idMenu) { this.idMenu = idMenu; }

    public String getNamaKopi() { return namaKopi; }
    public void setNamaKopi(String namaKopi) { this.namaKopi = namaKopi; }

    public int getHarga() { return harga; }

    // Setter dengan validasi nilai negatif (Penerapan Encapsulation)
    public void setHarga(int harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif. Harga di-set ke 0.");
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }

    public void tampilkan() {
        System.out.println("ID Menu: " + idMenu + " | Nama Kopi: " + namaKopi + " | Harga: Rp" + harga);
    }
}