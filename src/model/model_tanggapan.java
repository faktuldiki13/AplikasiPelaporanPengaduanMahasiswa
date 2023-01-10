package model;

import entity.entity_tanggapan;

import java.util.ArrayList;

public class model_tanggapan {
    private ArrayList<entity_tanggapan> tanggapanArrayList;

    public model_tanggapan(){
        tanggapanArrayList = new ArrayList<entity_tanggapan>();
    }

    public void create(entity_tanggapan tanggapan){
        this.tanggapanArrayList.add(tanggapan);
    }

    public entity_tanggapan showDataTanggapan(int index) {
        return tanggapanArrayList.get(index);
    }
    public ArrayList<entity_tanggapan> read(){
        return tanggapanArrayList;
    }

    public int search (int index)
    {
        if (index < this.tanggapanArrayList.size())
            return index;
        else
            return -1;
    }

    public entity_tanggapan lihattanggapan(int nomor) {
        return tanggapanArrayList.get(nomor);
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
                    tanggapanArrayList.get(index).setId_tanggapan(data);
                    break;
                case 2:
                    tanggapanArrayList.get(index).setTulis_tanggapan(data);
                    break;
                case 3:
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
            tanggapanArrayList.remove(index);
        }
    }
}
