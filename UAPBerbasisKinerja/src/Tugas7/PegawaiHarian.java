package Tugas7;

public class PegawaiHarian extends Pegawai{
    private double upahHarian;
    private int totalJam;
    public PegawaiHarian(String nama, String noKTP, double upahHarian, int totalJam){
        super(nama, noKTP);
        this.upahHarian=upahHarian;
        this.totalJam=totalJam;
    }

    public double getUpahHarian() {
        return upahHarian;
    }
    public void setUpahHarian(double upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    @Override
    public double gaji(){
        double gaji=0;
        if(getTotalJam()<=40){
            gaji = getUpahHarian()*getTotalJam();
        }else if(getTotalJam()>40){
            gaji = (getUpahHarian()*40)+((getTotalJam()-40)*getUpahHarian()*1.5);
        }return gaji;
    }
    @Override
    public String toString() {
        return "Pegawai Harian = " + getNama() + "\n" +
                "No. KTP        = " + getNoKTP() + "\n" +
                "Upah/jam       = " + getUpahHarian() + "\n" +
                "Total Jam Kerja= "+getTotalJam()+"\n"+
                "Pendapatan     = Rp "+(int)gaji();
    }
}
