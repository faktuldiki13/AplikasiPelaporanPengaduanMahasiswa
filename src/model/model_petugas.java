package model;

import entity.entity_petugas;

import java.util.ArrayList;

public class model_petugas {
    private ArrayList<entity_petugas> petugasArrayList;

    public model_petugas(){
        petugasArrayList = new ArrayList<entity_petugas>();
    }


    public void create(entity_petugas petugas){
        this.petugasArrayList.add(petugas);
    }

    public int cekData(String username, String password) {
        int loop = 0;
        for (entity_petugas entityPetugas : petugasArrayList) {
            if (entityPetugas.getUsername().equals(username) && entityPetugas.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    public ArrayList<entity_petugas> read(){
        return petugasArrayList;
    }

    public entity_petugas showDataAdmin(int index) {
        return petugasArrayList.get(index);
    }
}
