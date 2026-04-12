# BrewSociety Coffee Shop System - Posttest 2

Proyek ini adalah sistem manajemen sederhana untuk kedai kopi "BrewSociety". Program ini merupakan lanjutan dari Posttest sebelumnya dengan mengimplementasikan konsep **Encapsulation** dalam Pemrograman Berorientasi Objek (OOP) menggunakan bahasa Java. Proyek ini dibangun menggunakan *build tool* Maven.

## 📌 Penerapan Encapsulation & Access Modifier
Proyek ini memenuhi kriteria Posttest 2 dengan menerapkan lebih dari 2 jenis *Access Modifier*:

1. **Private**: Diterapkan pada properti seperti `private String idMenu` (`MenuKopi.java`) dan `private String id` (`Pengguna.java`) untuk menyembunyikan data dari akses luar.
2. **Protected**: Diterapkan pada properti `protected String nama` di kelas induk (`Pengguna.java`), sehingga dapat diakses langsung oleh kelas turunannya, misalnya di dalam metode `tampilkan()` pada `Barista.java`.
3. **Default**: Diterapkan pada `String kategoriSistem` di `Pengguna.java`, membatasi akses hanya di dalam *package* `com.brewsociety.core`.
4. **Public**: Diterapkan pada semua *Class* dan metode *Getter/Setter* agar dapat dipanggil dari *package* main.

## 📌 Penerapan Getter dan Setter
Setiap properti `private` telah dibungkus (encapsulated) menggunakan metode *Getter* dan *Setter*. 
Salah satu implementasi utama berada pada **`MenuKopi.java`**, di mana metode `setHarga(int harga)` dilengkapi dengan validasi logika:
```java
public void setHarga(int harga) {
    if (harga < 0) {
        System.out.println("Harga tidak boleh negatif. Harga di-set ke 0.");
        this.harga = 0;
    } else {
        this.harga = harga;
    }
}