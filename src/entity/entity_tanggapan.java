package entity;

import java.util.Date;

public class entity_tanggapan {
    private entity_pengaduan pengaduan;
    private String id_tanggapan = null;
    private String tulis_tanggapan = null;

    public entity_tanggapan(entity_pengaduan pengaduan, String id_tanggapan, String tulis_tanggapan, Date tanggal) {
        this.pengaduan = pengaduan;
        this.id_tanggapan = id_tanggapan;
        this.tulis_tanggapan = tulis_tanggapan;
        this.tanggal = tanggal;
    }

    private Date tanggal;

    public entity_pengaduan getPengaduan() {
        return pengaduan;
    }

    public void setPengaduan(entity_pengaduan pengaduan) {
        this.pengaduan = pengaduan;
    }

    public String getId_tanggapan() {
        return id_tanggapan;
    }

    public void setId_tanggapan(String id_tanggapan) {
        this.id_tanggapan = id_tanggapan;
    }

    public String getTulis_tanggapan() {
        return tulis_tanggapan;
    }

    public void setTulis_tanggapan(String tulis_tanggapan) {
        this.tulis_tanggapan = tulis_tanggapan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}
