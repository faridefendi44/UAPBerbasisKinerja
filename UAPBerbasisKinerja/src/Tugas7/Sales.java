package Tugas7;

public class Sales extends Pegawai {
    int penjualan;
    double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        double gaji = 0;
        return gaji = getKomisi() * getPenjualan();
    }

    @Override
    public String toString() {
        return "Sales          = " + getNama() + "\n" +
                "No. KTP        = " + getNoKTP() + "\n" +
                "Total Penjualan= " + getPenjualan() + "\n" +
                "Besaran Komisi = " + getKomisi() + "\n" +
                "Pendapatan     = Rp " + (int) gaji();
    }
}

