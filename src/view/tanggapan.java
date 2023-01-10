package view;

import allObject.modelAll;
import entity.entity_pengaduan;
import entity.entity_tanggapan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class tanggapan {
    static Scanner input = new Scanner(System.in);

    public static void create(){
        System.out.println("=== MENU TANGGAPAN ===");

        String  id_tanggapan = "";
        Date tanggal;
        String tulis_tanggapan="";

        try{
            String id_pengaduan = modelAll.controllerPengaduan.entityPengaduan().getId_pengaduan();
            String isi_pengaduan = modelAll.controllerPengaduan.entityPengaduan().getIsi_pengaduan();
            Date tanggall=modelAll.tgl;
            String nama = modelAll.controllerMahasiswa.entityMahasiswa().getNama();
            String status = modelAll.controllerPengaduan.entityPengaduan().getStatus();
            System.out.print("masukkan id tanggapan : ");
            id_tanggapan = input.nextLine();
            input.nextLine();
            System.out.print("Tulis tanggapan : ");
            tulis_tanggapan = input.nextLine();
            System.out.println("Tanggal : "+ modelAll.tgl);
            tanggal=modelAll.tgl;
            boolean err = modelAll.controllerTanggapan.create(new entity_tanggapan(new entity_pengaduan(id_pengaduan,isi_pengaduan,tanggall,status),id_tanggapan,tulis_tanggapan,tanggal));
            System.out.println("data berhasil masuk");
        } catch (Exception e) {
            System.out.println(e);
            System.out.printf("data gagal dimasukkan");
        }
    }


    public static void view(){
        System.out.println("=== MENU CETAK TANGGAPAN ===");
        ArrayList<entity_tanggapan> tanggapans = modelAll.controllerTanggapan.read();
        if (tanggapans== null){
            System.out.println("data kosong");
        } else {
            for (int i=0 ; i<tanggapans.size() ; i++) {
                pengaduan.viewditail();
                System.out.println("Id tanggapan : "+tanggapans.get(i).getId_tanggapan());
                System.out.println("Id pengaduan : "+modelAll.controllerPengaduan.entityPengaduan().getId_pengaduan());
                System.out.println("Kode petugas : "+modelAll.controllerPetugas.entityPetugas().getKode_petugas());
                System.out.println("Tulis tanggapan : "+tanggapans.get(i).getTulis_tanggapan());
                System.out.println("Tanggal : "+tanggapans.get(i).getTanggal());
                System.out.println("");
            }
        }
    }

    public static void edit(){
        try {
            String data;
            System.out.print("No : ");
            int nomorr = input.nextInt();
            int pilih = 0;
            System.out.println("Menu Edit");
            System.out.println("1.Edit Id tanggapan");
            System.out.println("2.Edit Isi tanggapan");
            System.out.println("3.Exit");
            System.out.println("Masukkan pilihan : ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("id tanggapan baru : ");
                    data = input.nextLine();
                    modelAll.controllerTanggapan.editbuku(nomorr,1, data);
                    break;
                case 2:
                    System.out.print("isi tanggapan baru : ");
                    data = input.nextLine();
                    modelAll.controllerTanggapan.editbuku(nomorr,2, data);
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
            modelAll.controllerTanggapan.hapusbuku(nomor);
        } catch (Exception exception) {
            System.out.print("No tidak ditemukan ");
        }
    }

    public static void lihatdata(){
        try{
            System.out.print("No : ");
            int nomor = input.nextInt();
            System.out.println("Id_pengaduan : "+modelAll.controllerTanggapan.tanggapan(nomor).getPengaduan().getId_pengaduan());
            System.out.println("Isi_pengaduan : "+modelAll.controllerTanggapan.tanggapan(nomor).getPengaduan().getIsi_pengaduan());
            System.out.println("Tanggal pengaduan : "+modelAll.controllerTanggapan.tanggapan(nomor).getPengaduan().getTanggal());
            System.out.println("Status : "+modelAll.controllerTanggapan.tanggapan(nomor).getPengaduan().getStatus());
            System.out.println("Id tanggapan : "+modelAll.controllerTanggapan.tanggapan(nomor).getId_tanggapan());
            System.out.println("Kode Petugas : "+modelAll.controllerPetugas.entityPetugas().getKode_petugas());
            System.out.println("Isi tanggapan : "+modelAll.controllerTanggapan.tanggapan(nomor).getTulis_tanggapan());
            System.out.println("Tanggal : "+modelAll.controllerTanggapan.tanggapan(nomor).getTanggal());
        } catch (Exception exception) {
            System.out.println("Tanggapan masih kosong ");
        }


    }

}
