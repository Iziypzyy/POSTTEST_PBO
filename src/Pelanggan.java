class Pelanggan {
    String idPelanggan;
    String nama;
    String statusMember; // Misal: Gold, Silver, Non-Member

    Pelanggan(String idPelanggan, String nama, String statusMember) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.statusMember = statusMember;
    }

    void tampilkan() {
        System.out.println("ID Pelanggan: " + idPelanggan + " | Nama: " + nama + " | Status Member: " + statusMember);
    }
}