package view;

import allObject.modelAll;

import java.util.Scanner;

public class petugas {
    private static Scanner input = new Scanner(System.in);

    public static void login() {
        System.out.println("=== MENU LOGIN ===");
        System.out.print("Username : ");
        String username = input.next();
        System.out.print("Password : ");
        String password = input.next();
        try {
            modelAll.controllerPetugas.login(username, password);
            System.out.println("Selamat Datang " + modelAll.controllerPetugas.entityPetugas().getNama());
            menu.menutanggapan();
        } catch (Exception e) {
            System.out.println("Username atau Password Anda Salah !!!");
        }
    }

    public static void verifikasi() {
        try {
            String data;
            System.out.print("No : ");
            int nomorr = input.nextInt();
            input.nextLine();
            System.out.print("Verifikasi : ");
            data = input.nextLine();
            modelAll.controllerPengaduan.editbuku(nomorr,3, data);
        } catch (Exception exception) {
            System.out.print("No tidak ditemukan ");
        }
    }
}
