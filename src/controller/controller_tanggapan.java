package controller;

import allObject.modelAll;
import entity.entity_tanggapan;

import java.util.ArrayList;

public class controller_tanggapan {

    public boolean create(entity_tanggapan tanggapan) {
        try {
            modelAll.Databasetanggapan.create(tanggapan);
            return true;
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public ArrayList<entity_tanggapan> read() {
        return modelAll.Databasetanggapan.read();
    }


    public entity_tanggapan tanggapan(int nomor) {
        return modelAll.Databasetanggapan.lihattanggapan(nomor-1);
    }

    public void editbuku(int index, int pilih ,String data){
        modelAll.Databasetanggapan.update(index-1,pilih,data);
    }

    public void hapusbuku(int index){
        modelAll.Databasetanggapan.delete(index-1);
    }
}
