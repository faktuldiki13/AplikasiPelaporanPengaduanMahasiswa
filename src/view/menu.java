package view;

import java.util.Scanner;

public class menu {
    private static Scanner input = new Scanner(System.in);
    public static void menuLogin(){
        int pilih;
        do{
            System.out.println("=== MENU LOGIN ===");
            System.out.println("1. Login Petugas");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Regristasi Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    petugas.login();
                    break;
                case 2:
                    mahasiswa.login();
                    break;
                case 3:
                    mahasiswa.create();
                    break;
                default:
            }
        } while (pilih != 4);
    }

    public static void menupengaduan(){
        int pilih;
        do{
            System.out.println("=== MENU PENGADUAN ===");
            System.out.println("1. Tulis Pengaduan");
            System.out.println("2. Lihat Pengaduan");
            System.out.println("3. Edit Pengaduan");
            System.out.println("4. Hapus Pengaduan");
            System.out.println("5. lihat Detail");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    pengaduan.create();
                    break;
                case 2:
                    pengaduan.view();
                    break;
                case 3:
                    pengaduan.edit();
                    break;
                case 4:
                    pengaduan.hapus();
                    break;
                case 5:
                    pengaduan.viewditail();
                    break;
                default:
            }
        } while (pilih != 6);
    }

    public static void menutanggapan(){
        int pilih;
        do{
            System.out.println("=== MENU PENGADUAN ===");
            System.out.println("1. Lihat Pengaduan");
            System.out.println("2. Verifikasi Pengaduan");
            System.out.println("3. Tanggapi Pengaduan");
            System.out.println("4. lihat Tanggapan");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    pengaduan.view();
                    break;
                case 2:
                    petugas.verifikasi();
                    break;
                case 3:
                    tanggapan.create();
                    break;
                case 4:
                    tanggapan.lihatdata();
                    break;
                default:
            }
        } while (pilih != 5);
    }

}
