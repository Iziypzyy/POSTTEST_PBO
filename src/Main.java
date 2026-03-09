import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<MenuKopi> dataMenu = new ArrayList<>();
        ArrayList<Pelanggan> dataPelanggan = new ArrayList<>();
        ArrayList<Barista> dataBarista = new ArrayList<>();

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== BREWSOCIETY COFFEE SHOP SYSTEM ===");
            System.out.println("1. Kelola Data Menu Kopi");
            System.out.println("2. Kelola Data Pelanggan");
            System.out.println("3. Kelola Data Barista");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih menu pengelolan: ");
            String menu = input.nextLine();

            switch (menu) {
                case "1" -> kelolaMenuKopi(input, dataMenu);
                case "2" -> kelolaPelanggan(input, dataPelanggan);
                case "3" -> kelolaBarista(input, dataBarista);
                case "0" -> {
                    berjalan = false;
                    System.out.println("Sistem BrewSociety dihentikan. Have a good brew!");
                }
                default -> System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    static void kelolaMenuKopi(Scanner input, ArrayList<MenuKopi> listMenu) {
        boolean kembali = false;
        while (!kembali) {
            System.out.println("\n--- KELOLA MENU KOPI ---");
            System.out.println("1. Tambah Menu Baru (Create)");
            System.out.println("2. Lihat Daftar Menu (Read)");
            System.out.println("3. Ubah Menu Kopi (Update)");
            System.out.println("4. Hapus Menu Kopi (Delete)");
            System.out.println("5. Kembali");
            System.out.print("Pilih aksi: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1" -> {
                    // CREATE
                    System.out.print("Masukkan ID Menu: ");
                    String id = input.nextLine();
                    System.out.print("Masukkan Nama Kopi: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Harga: ");
                    int harga = Integer.parseInt(input.nextLine());
                    
                    listMenu.add(new MenuKopi(id, nama, harga));
                    System.out.println("Menu kopi berhasil ditambahkan ke sistem BrewSociety!");
                }
                    
                case "2" -> {
                    // READ
                    System.out.println("\n--- Daftar Menu Kopi BrewSociety ---");
                    if (listMenu.isEmpty()) {
                        System.out.println("Belum ada menu yang terdaftar.");
                    } else {
                        for (int i = 0; i < listMenu.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            listMenu.get(i).tampilkan();
                        }
                    }
                }
                    
                case "3" -> {
                    // UPDATE
                    if (listMenu.isEmpty()) {
                        System.out.println("Data kosong, tidak ada menu yang bisa diubah.");
                    } else {
                        System.out.print("Masukkan nomor urut menu yang ingin diubah: ");
                        int index = Integer.parseInt(input.nextLine()) - 1;
                        
                        if (index >= 0 && index < listMenu.size()) {
                            System.out.print("Masukkan Nama Kopi Baru: ");
                            listMenu.get(index).namaKopi = input.nextLine();
                            System.out.print("Masukkan Harga Baru: ");
                            listMenu.get(index).harga = Integer.parseInt(input.nextLine());
                            System.out.println("Data menu berhasil diupdate!");
                        } else {
                            System.out.println("Nomor urut tidak ditemukan!");
                        }
                    }
                }
                    
                case "4" -> {
                    // DELETE
                    if (listMenu.isEmpty()) {
                        System.out.println("Data kosong, tidak ada yang bisa dihapus.");
                    } else {
                        System.out.print("Masukkan nomor urut menu yang ingin dihapus: ");
                        int indexDel = Integer.parseInt(input.nextLine()) - 1;
                        
                        if (indexDel >= 0 && indexDel < listMenu.size()) {
                            listMenu.remove(indexDel);
                            System.out.println("Menu berhasil dihapus dari daftar!");
                        } else {
                            System.out.println("Nomor urut tidak ditemukan!");
                        }
                    }
                }
                    
                case "5" -> kembali = true;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void kelolaPelanggan(Scanner input, ArrayList<Pelanggan> listPelanggan) {
        boolean kembali = false;
        while (!kembali) {
            System.out.println("\n--- KELOLA DATA PELANGGAN ---");
            System.out.println("1. Tambah Data Pelanggan");
            System.out.println("2. Lihat Data Pelanggan");
            System.out.println("3. Ubah Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Kembali");
            System.out.print("Pilih aksi: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1" -> {
                    System.out.print("Masukkan ID Pelanggan: ");
                    String id = input.nextLine();
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Status Member (Gold/Silver/Bronze/Non-Member): ");
                    String status = input.nextLine();
                    
                    listPelanggan.add(new Pelanggan(id, nama, status));
                    System.out.println("Pelanggan berhasil didaftarkan!");
                }
                case "2" -> {
                    System.out.println("\n--- Daftar Pelanggan BrewSociety ---");
                    if (listPelanggan.isEmpty()) {
                        System.out.println("Belum ada data pelanggan.");
                    } else {
                        for (int i = 0; i < listPelanggan.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            listPelanggan.get(i).tampilkan();
                        }
                    }
                }
                case "3" -> {
                    if (!listPelanggan.isEmpty()) {
                        System.out.print("Masukkan nomor urut pelanggan yang diubah: ");
                        int index = Integer.parseInt(input.nextLine()) - 1;
                        if (index >= 0 && index < listPelanggan.size()) {
                            System.out.print("Nama Baru: ");
                            listPelanggan.get(index).nama = input.nextLine();
                            System.out.print("Status Member Baru: ");
                            listPelanggan.get(index).statusMember = input.nextLine();
                            System.out.println("Data pelanggan berhasil diubah!");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Data pelanggan kosong.");
                    }
                }
                case "4" -> {
                    if (!listPelanggan.isEmpty()) {
                        System.out.print("Masukkan nomor urut pelanggan yang dihapus: ");
                        int indexDel = Integer.parseInt(input.nextLine()) - 1;
                        if (indexDel >= 0 && indexDel < listPelanggan.size()) {
                            listPelanggan.remove(indexDel);
                            System.out.println("Data pelanggan berhasil dihapus!");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Data kosong.");
                    }
                }
                case "5" -> kembali = true;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void kelolaBarista(Scanner input, ArrayList<Barista> listBarista) {
        boolean kembali = false;
        while (!kembali) {
            System.out.println("\n--- KELOLA DATA BARISTA ---");
            System.out.println("1. Tambah Barista");
            System.out.println("2. Lihat Data Barista");
            System.out.println("3. Ubah Jadwal/Data Barista");
            System.out.println("4. Hapus Barista");
            System.out.println("5. Kembali");
            System.out.print("Pilih aksi: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1" -> {
                    System.out.print("Masukkan ID Barista: ");
                    String id = input.nextLine();
                    System.out.print("Masukkan Nama Barista: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Shift Kerja (Pagi/Siang/Malam): ");
                    String shift = input.nextLine();
                    
                    listBarista.add(new Barista(id, nama, shift));
                    System.out.println("Barista berhasil ditambahkan ke tim BrewSociety!");
                }
                case "2" -> {
                    System.out.println("\n--- Tim Barista BrewSociety ---");
                    if (listBarista.isEmpty()) {
                        System.out.println("Belum ada data barista.");
                    } else {
                        for (int i = 0; i < listBarista.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            listBarista.get(i).tampilkan();
                        }
                    }
                }
                case "3" -> {
                    if (!listBarista.isEmpty()) {
                        System.out.print("Masukkan nomor urut barista yang diubah: ");
                        int index = Integer.parseInt(input.nextLine()) - 1;
                        if (index >= 0 && index < listBarista.size()) {
                            System.out.print("Nama Baru: ");
                            listBarista.get(index).nama = input.nextLine();
                            System.out.print("Shift Kerja Baru: ");
                            listBarista.get(index).shiftKerja = input.nextLine();
                            System.out.println("Data barista berhasil diubah!");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Data kosong.");
                    }
                }
                case "4" -> {
                    if (!listBarista.isEmpty()) {
                        System.out.print("Masukkan nomor urut barista yang dihapus: ");
                        int indexDel = Integer.parseInt(input.nextLine()) - 1;
                        if (indexDel >= 0 && indexDel < listBarista.size()) {
                            listBarista.remove(indexDel);
                            System.out.println("Barista berhasil dihapus dari sistem!");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Data kosong.");
                    }
                }
                case "5" -> kembali = true;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
}