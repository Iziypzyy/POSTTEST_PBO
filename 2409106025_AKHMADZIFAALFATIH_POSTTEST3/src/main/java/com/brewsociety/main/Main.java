package com.brewsociety.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.brewsociety.core.MenuKopi;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<MenuKopi> listMenu = new ArrayList<>();
            
            // --- INISIALISASI OBJEK INHERITANCE (PENGGUNA) ---
            Barista barista = new Barista("BAR-1", "Akhmad Zifa Al Fatih", "Pagi Pulang Pagi");
            Pelanggan pelanggan = new Pelanggan("PEL-1", "Rasyid Muhammad", "Gold Member");
            Manajer manajer = new Manajer("MAN-1", "Ahnaf Aliyyu", "Cabang Mulawarman");
            
            boolean isRunning = true;
            
            while (isRunning) {
                System.out.println("\n===== BREWSOCIETY COFFEE SHOP SYSTEM =====");
                System.out.println("1. Tambah Menu Kopi (Create)");
                System.out.println("2. Lihat Daftar Menu (Read)");
                System.out.println("3. Ubah Menu Kopi (Update)");
                System.out.println("4. Lihat Data Pengguna (Test Inheritance)"); // uji coba konsep pewarisan
                System.out.println("0. Keluar");
                System.out.println("==========================================");                
                System.out.print("Pilih Menu: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan ID Menu: ");
                        String id = scanner.nextLine();
                        System.out.print("Masukkan Nama Kopi: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan Harga: ");
                        int harga = scanner.nextInt();
                        scanner.nextLine();
                        
                        listMenu.add(new MenuKopi(id, nama, harga));
                        System.out.println("Menu berhasil ditambahkan!");
                    }
                        
                    case 2 -> {
                        System.out.println("\n--- Daftar Menu Kopi ---");
                        if (listMenu.isEmpty()) {
                            System.out.println("Data kosong.");
                        } else {
                            for (int i = 0; i < listMenu.size(); i++) {
                                System.out.print((i + 1) + ". ");
                                // Menggunakan Getter untuk Read Data
                                System.out.println(listMenu.get(i).getNamaKopi() + " - Rp" + listMenu.get(i).getHarga());
                            }
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Masukkan nomor urut menu yang ingin diubah: ");
                        int index = scanner.nextInt() - 1;
                        scanner.nextLine();
                        
                        if (index >= 0 && index < listMenu.size()) {
                            System.out.print("Masukkan Nama Kopi Baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan Harga Baru: ");
                            int hargaBaru = scanner.nextInt();
                            
                            // Menggunakan Setter untuk Update Data
                            listMenu.get(index).setNamaKopi(namaBaru);
                            listMenu.get(index).setHarga(hargaBaru); // Validasi nilai negatif akan berjalan di sini
                            System.out.println("Data berhasil diupdate!");
                        } else {
                            System.out.println("Nomor tidak valid!");
                        }
                    }
                        
                    case 4 -> {
                        // Menampilkan data untuk membuktikan konsep pewarisan (Inheritance)
                        System.out.println("\n--- Data Pengguna Sistem ---");
                        barista.tampilkan();
                        pelanggan.tampilkan();
                        manajer.tampilkan();
                    }
                        
                    case 0 -> {
                        isRunning = false;
                        System.out.println("Sistem BrewSociety dihentikan. Have a good brew!");
                    }
                        
                    default -> System.out.println("Pilihan tidak valid!");
                }
            }
        }
    }
}