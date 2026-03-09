# Laporan Posttest 1 Praktikum PBO
## ☕ Sistem Manajemen Coffee Shop (BrewSociety)

### 👤 Biodata
- **Nama:** Akhmad Zifa Al Fatih
- **NIM:** 2409106025
- **Praktikum:** Pemrograman Berorientasi Objek (PBO)
- **Tema Program:** Sistem Manajemen Coffee Shop

---

### 📌 Deskripsi Program
Program **BrewSociety** adalah aplikasi berbasis *Console* (CLI) menggunakan bahasa Java yang dirancang untuk memenuhi penugasan Posttest 1. Program ini menerapkan konsep dasar Pemrograman Berorientasi Objek (OOP) serta struktur data `ArrayList` untuk menyimpan data secara dinamis. 

Program ini memiliki fitur **CRUD (Create, Read, Update, Delete)** yang berjalan terus-menerus di dalam sebuah *looping* (perulangan) menu utama hingga pengguna memilih opsi *exit*. Sesuai kriteria **NILAI TAMBAH**, program ini mengelola 3 (tiga) *Class* (entitas) yang berbeda, yaitu:

1. **`MenuKopi`**: Mengelola data minuman kopi (ID Menu, Nama Kopi, Harga).
2. **`Pelanggan`**: Mengelola data pelanggan setia (ID Pelanggan, Nama, Status Member).
3. **`Barista`**: Mengelola data pegawai kedai (ID Barista, Nama, Shift Kerja).

---

### 🛠️ Konsep OOP yang Diterapkan (Modul 1 & 2)
Berdasarkan modul praktikum yang telah dipelajari, program ini mengimplementasikan:
1. **Class & Object**: Membuat rancangan dasar/blueprint (`MenuKopi`, `Pelanggan`, `Barista`) dan menginstansiasinya menjadi objek nyata ke dalam `ArrayList`.
2. **Property / Atribut**: Deklarasi variabel di dalam *class* yang mendefinisikan karakteristik objek (contoh: `String namaKopi`, `int harga`).
3. **Method**: Penggunaan *method* `tampilkan()` pada tiap *class* untuk mencetak detail data ke terminal.
4. **Constructor**: Menggunakan *constructor* untuk menginisialisasi nilai awal objek secara langsung saat pemanggilan keyword `new`.

## 📸 Dokumentasi & Laporan Eksekusi Program
Berikut adalah hasil jalannya program (Screenshot):

### 1. Tampilan Menu Utama
*(Penjelasan: Menampilkan menu navigasi awal saat program baru dijalankan)*
![Tampilan Menu Utama](assets/assets/menu_utama.png)

### 2. Fitur Kelola Menu Kopi (CRUD)
*(Penjelasan: Proses saat menambahkan menu kopi baru dan menampilkan daftarnya, mengubah menu dan menghapus menu)*
![Fitur Tambah dan Lihat Kopi](assets/assets/MenuKopi/)

### 3. Fitur Kelola Pelanggan (CRUD)
*(Penjelasan: Proses menambahkan menampilkan mengubah dan menghapus status keanggotaan pelanggan, nama)*
![Fitur Ubah Pelanggan](assets/assets/Pelanggan/)

### 4. Fitur Kelola Barista (CRUD)
*(Penjelasan: Proses menambahkan menampilkan mengubah dan menghapus data barista dari sistem)*
![Fitur Hapus Barista](assets/assets/Barista/)

---
Dibuat untuk memenuhi tugas praktikum Pemrograman Berorientasi Objek.