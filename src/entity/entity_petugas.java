package entity;

public class entity_petugas {
    private int kode_petugas;
    private String nama;
    private String username;
    private String password;

    public entity_petugas() {
    }

    public entity_petugas(int kode_petugas, String nama, String username, String password) {
        this.kode_petugas = kode_petugas;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public int getKode_petugas() {
        return kode_petugas;
    }

    public void setKode_petugas(int kode_petugas) {
        this.kode_petugas = kode_petugas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
