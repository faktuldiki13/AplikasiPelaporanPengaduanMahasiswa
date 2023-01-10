package allObject;

import controller.controller_mahasiswa;
import controller.controller_pengaduan;
import controller.controller_petugas;
import controller.controller_tanggapan;
import model.model_mahasiswa;
import model.model_pengaduan;
import model.model_petugas;
import model.model_tanggapan;

import java.util.Date;

public class modelAll {
    public static model_mahasiswa Databasemahasiswa = new model_mahasiswa();
    public static model_petugas Databasepetugas = new model_petugas();
    public static model_pengaduan Databasepengaduan = new model_pengaduan();
    public static model_tanggapan Databasetanggapan = new model_tanggapan();
    public static controller_mahasiswa controllerMahasiswa = new controller_mahasiswa();
    public static controller_petugas controllerPetugas = new controller_petugas();
    public static controller_pengaduan controllerPengaduan = new controller_pengaduan();
    public static controller_tanggapan controllerTanggapan = new controller_tanggapan();

    public static Date tgl = new Date();

}
