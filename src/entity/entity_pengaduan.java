package entity;

import java.util.Date;

public class entity_pengaduan {
    private String id_pengaduan;
    private String isi_pengaduan;
    private Date tanggal;
    private String status;

    public entity_pengaduan(String id_pengaduan, String isi_pengaduan, Date tanggal, String status) {
        this.id_pengaduan = id_pengaduan;
        this.isi_pengaduan = isi_pengaduan;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getId_pengaduan() {
        return id_pengaduan;
    }

    public void setId_pengaduan(String id_pengaduan) {
        this.id_pengaduan = id_pengaduan;
    }

    public String getIsi_pengaduan() {
        return isi_pengaduan;
    }

    public void setIsi_pengaduan(String isi_pengaduan) {
        this.isi_pengaduan = isi_pengaduan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
