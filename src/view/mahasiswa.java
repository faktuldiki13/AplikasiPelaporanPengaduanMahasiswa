package view;

import java.util.ArrayList;
import java.util.Scanner;
import entity.entity_mahasiswa;
import allObject.modelAll;

public class mahasiswa {

    private static Scanner input = new Scanner(System.in);

        public static void view(){
            System.out.println("=== MENU CETAK DATA ===");
            ArrayList<entity_mahasiswa> Enmahasiswa = modelAll.controllerMahasiswa.read();
            if (Enmahasiswa== null){
                System.out.println("data kosong");
            } else {
                for (int i=0 ; i<Enmahasiswa.size() ; i++) {
                    System.out.println("Npm : "+Enmahasiswa.get(i).getNpm());
                    System.out.println("Nama Mahasiswa : "+Enmahasiswa.get(i).getNama());
                    System.out.println("Username : "+Enmahasiswa.get(i).getUsername());
                    System.out.println("Password : "+Enmahasiswa.get(i).getPassword());
                    System.out.println("");
                }
            }
        }
        public static void create(){
            System.out.println("=== MENU REGRISTRASI ===");
            Scanner scan = new Scanner(System.in);
            int npm=0;
            String nama="",username = "",password = "";
            try{
                System.out.print("masukkan npm : ");
                npm = scan.nextInt();
                System.out.print("masukkan nama  : ");
                nama = scan.next();
                System.out.print("masukkan username : ");
                username = scan.next();
                System.out.print("masukkan password : ");
                password = scan.next();
                boolean err = modelAll.controllerMahasiswa.create(new entity_mahasiswa(npm, nama, username, password));
                System.out.println("data berhasil masuk");
            } catch (Exception e) {
                System.out.println(e);
                System.out.printf("data gagal dimasukkan");
            }
        }

    public static void login() {
        System.out.println("=== MENU LOGIN ===");
        System.out.print("Username : ");
        String username = input.next();
        System.out.print("Password : ");
        String password = input.next();
        try {
            modelAll.controllerMahasiswa.login(username, password);
            System.out.println("Selamat Datang " + modelAll.controllerMahasiswa.entityMahasiswa().getNama());
            menu.menupengaduan();
        } catch (Exception e) {
            System.out.println("Username atau Password Anda Salah !!!");
        }
    }
}
