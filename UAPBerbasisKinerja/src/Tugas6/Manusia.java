package Tugas6;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean statusMenikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean statusMenikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.statusMenikah = statusMenikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isStatusMenikah() {
        return statusMenikah;
    }

    public void setStatusMenikah(boolean statusMenikah) {
        this.statusMenikah = statusMenikah;
    }
    public String getjenisKelamin(){
        if (jenisKelamin==true){
            return "Laki-laki";
        }else{
            return "Perempuan";
        }
    }
    public String getstatusMenikah(){
        if (statusMenikah==true){
            return "Sudah Menikah";
        }else {
            return "Belum Menikah";
        }
    }

    public double getTunjangan() {
        double tunjangan = 0;
        if (isStatusMenikah()==true){
            if (isJenisKelamin()==true){
                tunjangan=25;
            }else {
                tunjangan = 20;
            }
        }else{
            tunjangan = 15;
        } return tunjangan;
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public String toString(){
        return  "Nama          = "+getNama()+"\n"+
                "NIK           = "+getNIK() +"\n"+
                "Jenis Kelamin = "+getjenisKelamin() +"\n"+
                "Status Menikah= "+getstatusMenikah()+"\n"+
                "Pendapatan    = $"+(int)getPendapatan();
    }
}