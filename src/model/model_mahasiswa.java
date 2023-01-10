package model;

import entity.entity_mahasiswa;
import entity.entity_petugas;

import java.util.ArrayList;

public class model_mahasiswa {
    private ArrayList<entity_mahasiswa>mahasiswaArrayList;

    public model_mahasiswa(){
        mahasiswaArrayList = new ArrayList<entity_mahasiswa>();
    }
    public void create(entity_mahasiswa mahasiswa){
        this.mahasiswaArrayList.add(mahasiswa);
    }

    public int cekData(String username, String password) {
        int loop = 0;
        for (entity_mahasiswa entityMahasiswa : mahasiswaArrayList) {
            if (entityMahasiswa.getUsername().equals(username) && entityMahasiswa.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public entity_mahasiswa showDataMahasiswa(int index) {
        return mahasiswaArrayList.get(index);
    }
    public ArrayList<entity_mahasiswa> read(){
        return mahasiswaArrayList;
    }

}
