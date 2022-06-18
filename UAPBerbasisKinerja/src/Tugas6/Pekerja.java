package Tugas6;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean statusMenikah, int jamKerja, int hariKerja, String NIP){
        super(nama, NIK, jenisKelamin, statusMenikah);
        this.jamKerja=jamKerja;
        this.hariKerja=hariKerja;
        this.NIP=NIP;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public double getGaji(){
        return gaji= getHariKerja()*getJamKerja()*15;
    }
    public double getBonus(){
        int normal = 7;
        int libur=0;
        int hK=0;
        int i =1;
        do {
            if (i%7==0) {
                libur = (hK / normal)*2;
            }
            if (i%6==0){
                libur++;
            }
            i++;
        }while (i<=hK);
        double jamLembur=0;
        if (getJamKerja()-7<0){
            jamLembur = 0;
        }else{
            jamLembur = getJamKerja()-7;
        }
        double bonusLembur = (getHariKerja()-libur)*jamLembur*7;
        double bonusLibur = libur*getJamKerja()*20;
        return bonus = bonusLembur+bonusLibur;
    }
    public String getStatus(){
        String departemen = null;
        String cabang = null;
        String kantorCabang = Character.toString(getNIP().charAt(2));
            if (getNIP().charAt(0) == '1'){
                cabang = "Mondstadt";
            } else if (getNIP().charAt(0) == '2'){
                cabang = "Liyue";
            } else if(getNIP().charAt(0) == '3'){
                cabang = "Inazuma";
            } else if (getNIP().charAt(0) == '4'){
                cabang = "Sumeru";
            }else if (getNIP().charAt(0) == '5'){
                cabang = "Fontaine";
            }else if (getNIP().charAt(0) == '6'){
                cabang = "Natlan";
            }else if(getNIP().charAt(0) == '7'){
                cabang = "Snezhnaya";
            }
            if (getNIP().charAt(6) == '1') {
                departemen = "Pemasaran";
            } else if (getNIP().charAt(6) == '2') {
                departemen = "Humas";
            } else if (getNIP().charAt(6) == '3') {
                departemen = "Riset";
            } else if (getNIP().charAt(6) == '4') {
                departemen = "Teknologi";
            } else if (getNIP().charAt(6) == '5') {
                departemen = "Personalia";
            } else if (getNIP().charAt(6) == '6') {
                departemen = "Akademik";
            } else if (getNIP().charAt(6) == '7') {
                departemen = "Administrasi";
            } else if (getNIP().charAt(6) == '8') {
                departemen = "Operasional";
            } else if (getNIP().charAt(6) == '9') {
                departemen = "Pembangunan";
            }return "Departemen "+departemen+", Kantor "+cabang+" Cabang ke- "+kantorCabang;
    }
    @Override
    public String toString(){
        return  "Nama          = "+getNama()+"\n"+
                "NIK           = "+getNIK()+"\n"+
                "Jenis Kelamin = "+getjenisKelamin()+"\n"+
                "Status Menikah= "+getstatusMenikah()+"\n"+
                "Pendapatan    = $"+(int)(getPendapatan()+getGaji()+getBonus())+"\n"+
                "Bonus         = $"+(int)getBonus()+"\n"+
                "Gaji          = $"+(int)getGaji()+"\n"+
                "Status        = "+getStatus();
    }
}
