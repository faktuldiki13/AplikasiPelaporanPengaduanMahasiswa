package controller;

import allObject.modelAll;
import entity.entity_mahasiswa;
import entity.entity_pengaduan;
import entity.entity_petugas;
import entity.entity_tanggapan;

import java.util.ArrayList;

public class controller_pengaduan {
    int indexLogin = 0;

    public boolean create(entity_pengaduan pengaduan) {
        try {
            modelAll.Databasepengaduan.create(pengaduan);
            return true;
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }


    public entity_pengaduan pengaduan(int nomor) {
        return modelAll.Databasepengaduan.lihatdetail(nomor-1);
    }

    public entity_pengaduan entityPengaduan() {
        return modelAll.Databasepengaduan.showDataPengaduan(indexLogin);
    }
    public ArrayList<entity_pengaduan> read() {
        return modelAll.Databasepengaduan.read();
    }

    public void editbuku(int index, int pilih ,String data){
        modelAll.Databasepengaduan.update(index-1,pilih,data);
    }

    public void hapusbuku(int index){
        modelAll.Databasepengaduan.delete(index-1);
    }
}
