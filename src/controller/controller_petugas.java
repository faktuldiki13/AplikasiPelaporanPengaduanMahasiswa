package controller;

import allObject.modelAll;
import entity.entity_petugas;
import org.junit.Test;

import java.util.ArrayList;

public class controller_petugas {
    int indexLogin = 0;

    @Test
    public void dataAdmin() {
        int kode_petugas[] = {1, 2};
        String nama[] = {"Jecky", "Sincan"};
        String username[] = {"01", "02"};
        String password[] = {"01", "02"};

        for(int i = 0; i < kode_petugas.length; i++) {
            modelAll.Databasepetugas.create(new entity_petugas(kode_petugas[i], nama[i], username[i], password[i]));
        }
    }

    public void login(String username, String password) {
        indexLogin = modelAll.Databasepetugas.cekData(username, password);
    }

    public ArrayList<entity_petugas> read() {
        return modelAll.Databasepetugas.read();
    }

    public boolean create(entity_petugas petugas) {
        try {
            modelAll.Databasepetugas.create(petugas);
            return true;
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public entity_petugas entityPetugas() {
        return modelAll.Databasepetugas.showDataAdmin(indexLogin);
    }
}
