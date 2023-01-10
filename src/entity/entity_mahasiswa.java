package entity;

public class entity_mahasiswa {
    private int npm;
    private String nama;
    private String username;
    private String password;

    public entity_mahasiswa(int npm, String nama, String username, String password) {
        this.npm = npm;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
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
