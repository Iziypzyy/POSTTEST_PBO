class Barista {
    String idBarista;
    String nama;
    String shiftKerja; // Misal: Pagi, Siang, Malam

    Barista(String idBarista, String nama, String shiftKerja) {
        this.idBarista = idBarista;
        this.nama = nama;
        this.shiftKerja = shiftKerja;
    }

    void tampilkan() {
        System.out.println("ID Barista: " + idBarista + " | Nama: " + nama + " | Shift: " + shiftKerja);
    }
}