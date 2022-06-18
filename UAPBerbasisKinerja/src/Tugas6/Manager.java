package Tugas6;

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean statusMenikah, int jamKerja, int hariKerja, String NIP, int lamaKerja){
        super(nama, NIK, jenisKelamin, statusMenikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
    @Override
    public double getTunjangan() {
        return super.getTunjangan()+15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (super.getBonus()*0.3);
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
                "Status        = "+getStatus()+"\n"+
                "Lama Kerja    = "+getLamaKerja();
    }
}