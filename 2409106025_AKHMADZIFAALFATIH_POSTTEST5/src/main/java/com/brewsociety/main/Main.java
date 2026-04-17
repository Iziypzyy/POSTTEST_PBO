package com.brewsociety.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.brewsociety.core.MenuKopi;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<MenuKopi> daftarMenu = new ArrayList<>();
        ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
        ArrayList<Barista> daftarBarista = new ArrayList<>();

        System.out.println("=== TEST ABSTRACTION & POLYMORPHISM BREWSOCIETY ===");
        
        Manajer manajer = new Manajer("M01", "Pak Budi", "Cabang Samarinda");
        Barista baristaTest = new Barista("B01", "Andi", "Pagi");
        Pelanggan pelangganTest = new Pelanggan("P01", "Siti", "Gold");
        
        manajer.tampilkan(); 
        baristaTest.tampilkan(); 
        pelangganTest.tampilkan(true); 
        System.out.println("\n--- UJI COBA INTERFACE OPERASIONAL ---");
        manajer.mulaiTugas();
        baristaTest.mulaiTugas();
        baristaTest.selesaiTugas();

        System.out.println("\n--- UJI COBA KELAS MENU KOPI ---");
        MenuKopi kopiPromo = new MenuKopi("K01", "Kopi Susu Gula Aren", 25000);
        kopiPromo.setHarga(25000, 5000);
        kopiPromo.tampilkan("PROMO DISKON 5K"); 
        
        System.out.println("===================================================\n");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== BREWSOCIETY COFFEE SHOP SYSTEM ===");
            System.out.println("1. Kelola Data Menu Kopi");
            System.out.println("2. Kelola Data Pelanggan");
            System.out.println("3. Kelola Data Barista");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih menu pengelolaan: ");
            
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    kelolaMenuKopi(input, daftarMenu);
                    break;
                case "2":
                    kelolaPelanggan(input, daftarPelanggan);
                    break;
                case "3":
                    kelolaBarista(input, daftarBarista);
                    break;
                case "0":
                    System.out.println("Sistem BrewSociety dihentikan. Have a good brew!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
        input.close();
    }

    private static void kelolaMenuKopi(Scanner input, ArrayList<MenuKopi> daftarMenu) {
        System.out.println("\n--- KELOLA MENU KOPI ---");
        System.out.println("1. Tambah Menu Baru");
        System.out.println("2. Lihat Daftar Menu");
        System.out.print("Pilih aksi: ");
        String aksi = input.nextLine();

        if (aksi.equals("1")) {
            System.out.print("Masukkan ID Menu: ");
            String id = input.nextLine();
            System.out.print("Masukkan Nama Kopi: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Harga: ");
            int harga = Integer.parseInt(input.nextLine());
            daftarMenu.add(new MenuKopi(id, nama, harga));
            System.out.println("Menu kopi berhasil ditambahkan!");
        } else if (aksi.equals("2")) {
            if (daftarMenu.isEmpty()) {
                System.out.println("Belum ada menu.");
            } else {
                for (MenuKopi m : daftarMenu) {
                    m.tampilkan();
                }
            }
        }
    }

    private static void kelolaPelanggan(Scanner input, ArrayList<Pelanggan> daftarPelanggan) {
        System.out.println("\n--- KELOLA DATA PELANGGAN ---");
        System.out.println("1. Tambah Pelanggan");
        System.out.println("2. Lihat Daftar Pelanggan");
        System.out.print("Pilih aksi: ");
        String aksi = input.nextLine();

        if (aksi.equals("1")) {
            System.out.print("Masukkan ID Pelanggan: ");
            String id = input.nextLine();
            System.out.print("Masukkan Nama Pelanggan: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Status Member: ");
            String status = input.nextLine();
            daftarPelanggan.add(new Pelanggan(id, nama, status));
            System.out.println("Pelanggan berhasil didaftarkan!");
        } else if (aksi.equals("2")) {
            if (daftarPelanggan.isEmpty()) {
                System.out.println("Belum ada data pelanggan.");
            } else {
                for (Pelanggan p : daftarPelanggan) {
                    p.tampilkan(); 
                }
            }
        }
    }

    private static void kelolaBarista(Scanner input, ArrayList<Barista> daftarBarista) {
        System.out.println("\n--- KELOLA DATA BARISTA ---");
        System.out.println("1. Tambah Barista");
        System.out.println("2. Lihat Daftar Barista");
        System.out.print("Pilih aksi: ");
        String aksi = input.nextLine();

        if (aksi.equals("1")) {
            System.out.print("Masukkan ID Barista: ");
            String id = input.nextLine();
            System.out.print("Masukkan Nama Barista: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Shift Kerja: ");
            String shift = input.nextLine();
            daftarBarista.add(new Barista(id, nama, shift));
            System.out.println("Barista berhasil ditambahkan!");
        } else if (aksi.equals("2")) {
            if (daftarBarista.isEmpty()) {
                System.out.println("Belum ada data barista.");
            } else {
                for (Barista b : daftarBarista) {
                    b.tampilkan();
                }
            }
        }
    }
}