package model;

import entity.entity_pengaduan;
import entity.entity_tanggapan;

import java.util.ArrayList;

public class model_pengaduan {
    private ArrayList<entity_pengaduan> pengaduanArrayList;

    public model_pengaduan(){
        pengaduanArrayList = new ArrayList<entity_pengaduan>();
    }

    public void create(entity_pengaduan pengaduan){
        this.pengaduanArrayList.add(pengaduan);
    }

    public entity_pengaduan showDataPengaduan(int index) {
        return pengaduanArrayList.get(index);
    }
    public ArrayList<entity_pengaduan> read(){
        return pengaduanArrayList;
    }
    public entity_pengaduan lihatdetail(int nomor) {
        return pengaduanArrayList.get(nomor);
    }

    public int search (int index)
    {
        if (index < this.pengaduanArrayList.size())
            return index;
        else
            return -1;
    }


    public void update(int index, int pilih,String data)
    {

        if (search(index)==-1)
        {

            System.out.println("data tidak ditemukan");
        }
        else
        {
            switch (pilih) {
                case 1:
                    pengaduanArrayList.get(index).setId_pengaduan(data);
                    break;
                case 2:
                    pengaduanArrayList.get(index).setIsi_pengaduan(data);
                    break;
                case 3:
                    pengaduanArrayList.get(index).setStatus(data);
                    break;
                default:
            }
        }
    }

    public void delete(int index)
    {
        if (search(index)==-1)
        {
//            System.out.println("data tidak ditemukan");
        }
        if (index == -1)
        {
//            System.out.println("data tidak ditemukan");
        }
        else
        {
            pengaduanArrayList.remove(index);
        }
    }
}
