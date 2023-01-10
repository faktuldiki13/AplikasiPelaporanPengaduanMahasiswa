package view;

import allObject.modelAll;
import entity.entity_mahasiswa;
import entity.entity_pengaduan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class pengaduan {

    static Scanner input = new Scanner(System.in);

    public static void create(){
        System.out.println("=== MENU PENGADUAN ===");

        String  id_pengaduan = "";
        Date tanggal;
        String isi_pengaduan="",status = "";
        try{
            System.out.print("masukkan id pengaduan : ");
            id_pengaduan = input.nextLine();
            input.nextLine();
            System.out.print("Tulis pengaduan : ");
            isi_pengaduan = input.nextLine();
            System.out.println("Tanggal : "+modelAll.tgl);
            tanggal=modelAll.tgl;
            System.out.println("Status  : ");
            status = null;

            boolean err = modelAll.controllerPengaduan.create(new entity_pengaduan(id_pengaduan,isi_pengaduan,tanggal,status));
            System.out.println("data berhasil masuk");
        } catch (Exception e) {
            System.out.println(e);
            System.out.printf("data gagal dimasukkan");
        }
    }

    public static void view(){

        System.out.println("=== MENU CETAK DATA ===");
        ArrayList<entity_pengaduan> pengaduans = modelAll.controllerPengaduan.read();
        if (pengaduans== null){
            System.out.println("data kosong");
        } else {
            for (int i=0 ; i<pengaduans.size() ; i++) {
                int no = i+1;
                System.out.println("No : "+no);
                System.out.println("Id pengaduan : "+pengaduans.get(i).getId_pengaduan());
                System.out.println("nama : "+modelAll.controllerMahasiswa.entityMahasiswa().getNama());
                System.out.println("Isi pengaduan : "+pengaduans.get(i).getIsi_pengaduan());
                System.out.println("Tanggal : "+pengaduans.get(i).getTanggal());
                System.out.println("Status : "+pengaduans.get(i).getStatus());
                System.out.println("");
            }
        }
    }

    public static void viewditail(){
        try {
        System.out.print("No : ");
        int nomor = input.nextInt();
        System.out.println("Id pengaduan : "+modelAll.controllerPengaduan.pengaduan(nomor).getId_pengaduan());
        System.out.println("nama : "+modelAll.controllerMahasiswa.entityMahasiswa().getNama());
        System.out.println("Isi pengaduan : "+modelAll.controllerPengaduan.pengaduan(nomor).getIsi_pengaduan());
        System.out.println("Tanggal : "+modelAll.controllerPengaduan.pengaduan(nomor).getTanggal());
        System.out.println("Status : "+modelAll.controllerPengaduan.pengaduan(nomor).getStatus());
        System.out.println("Id tanggapan : "+modelAll.controllerTanggapan.tanggapan(nomor).getId_tanggapan());
        System.out.println("Kode Petugas : "+modelAll.controllerPetugas.entityPetugas().getKode_petugas());
        System.out.println("Isi tanggapan : "+modelAll.controllerTanggapan.tanggapan(nomor).getTulis_tanggapan());
        System.out.println("Tanggal : "+modelAll.controllerTanggapan.tanggapan(nomor).getTanggal());
        } catch (Exception exception) {
            System.out.println("Tanggapan masih kosong ");
        }

    }

    public static void edit(){
        try {
            String data;
            System.out.print("No : ");
            int nomorr = input.nextInt();
            int pilih = 0;
            System.out.println("Menu Edit");
            System.out.println("1.Edit Id pengaduan");
            System.out.println("2.Edit Isi pengaduan");
            System.out.println("3.Exit");
            System.out.println("Masukkan pilihan : ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("id pengaduan baru : ");
                    data = input.nextLine();
                    modelAll.controllerPengaduan.editbuku(nomorr,1, data);
                    break;
                case 2:
                    System.out.print("isi pengaduan baru : ");
                    data = input.nextLine();
                    modelAll.controllerPengaduan.editbuku(nomorr,2, data);
                    break;
                case 3:
                    //Allobjcontrl.buku.editbuku(nomorr,3, data);
                    break;
                default:
            }

        } catch (Exception exception) {
            System.out.print("No tidak ditemukan ");
        }
    }

    public static void hapus(){
        try {
            System.out.print("No : ");
            int nomor = input.nextInt();
            modelAll.controllerPengaduan.hapusbuku(nomor);
        } catch (Exception exception) {
            System.out.print("No tidak ditemukan ");
        }
    }


}
