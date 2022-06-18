package Tugas6;

public class Mahasiswa extends Manusia{
    private String NIM;
    private double IPK;

    public Mahasiswa (String nama, String NIK, boolean jenisKelamin, boolean statusMenikah, String NIM, double IPK){
        super(nama, NIK, jenisKelamin, statusMenikah);
        this.NIM=NIM;
        this.IPK=IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String status=null;
        if(getNIM().charAt(6)== '2'){
            return "Teknik Meniup Gelembung";
        }else if(getNIM().charAt(6)== '3'){
            return  "Teknik Berburu Ubur Ubur";
        }else if(getNIM().charAt(6)== '4'){
            return  "Sistem Perhamburgeran";
        }else if(getNIM().charAt(6)== '6'){
            return  "Pendidikan Chum Bucket";
        }else if(getNIM().charAt(6)== '7'){
            return  "Teknologi Telepon Kerang";
        }return status;
    }
    public double getBeasiswa(){
        double beasiswa = 0;
        if (getIPK() >= 3.0 && getIPK() <= 3.5){
            beasiswa=50;
        }if(getIPK() > 3.5 && getIPK()<=4.0){
            beasiswa=75;
        }return beasiswa;
    }
    @Override
    public String toString(){
        return  "Nama          = "+getNama()+"\n"+
                "NIK           = "+getNIK()+"\n"+
                "Jenis Kelamin = "+getjenisKelamin()+"\n"+
                "Status Menikah= "+getstatusMenikah()+"\n"+
                "Pendapatan    = $"+(int)(getPendapatan()+getBeasiswa())+"\n"+
                "NIM           = "+getNIM()+ "\n"+
                "IPK           = "+getIPK()+ "\n"+
                "Status        = Mahasiswa "+getStatus()+" Angkatan 20"+getNIM().substring(0,2);
    }
}
