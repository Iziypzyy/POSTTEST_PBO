class MenuKopi {
    String idMenu;
    String namaKopi;
    int harga;

    // Constructor
    MenuKopi(String idMenu, String namaKopi, int harga) {
        this.idMenu = idMenu;
        this.namaKopi = namaKopi;
        this.harga = harga;
    }

    // Method untuk menampilkan data
    void tampilkan() {
        System.out.println("ID Menu: " + idMenu + " | Nama Kopi: " + namaKopi + " | Harga: Rp" + harga);
    }
}