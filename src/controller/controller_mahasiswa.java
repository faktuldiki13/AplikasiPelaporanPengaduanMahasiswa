package controller;

import entity.entity_mahasiswa;
import allObject.modelAll;
import entity.entity_pengaduan;

import java.util.ArrayList;

public class controller_mahasiswa {

    int indexLogin=0;
    public ArrayList<entity_mahasiswa> read() {
        return modelAll.Databasemahasiswa.read();
    }

    public void login(String username, String password) {
        indexLogin = modelAll.Databasemahasiswa.cekData(username, password);
    }

    public entity_mahasiswa entityMahasiswa() {
        return modelAll.Databasemahasiswa.showDataMahasiswa(indexLogin);
    }

    public boolean create(entity_mahasiswa mahasiswa) {
        try {
            modelAll.Databasemahasiswa.create(mahasiswa);
            return true;
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
