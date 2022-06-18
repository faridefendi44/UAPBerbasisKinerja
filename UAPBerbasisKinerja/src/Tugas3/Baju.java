package Tugas3;

public class Baju {
    public String jenis;
    public int harga,jumlah;
    public Baju (String jenis, int harga, int jumlah){
        this.jenis = jenis;
        this.harga = harga;
        this.jumlah = harga;
    }
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    public Baju() {

    }

    void hargaa () {
        if (jumlah > 100) {
            this.harga = 95000;
        }else {
            this.harga = bajua;
        }
    }
    void hargab (){
        if (jumlah>100) {
            this.harga = 120000;
        }else {
            this.harga = bajub;
        }
    }
    void hargac (){
        if (jumlah>100){
            this.harga = 160000;
        }else{
            this.harga = bajuc;
        }
    }
    void display(){
        if(jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang anda beli    : "+jenis);
        System.out.println("Harga per buah          : "+harga);
        System.out.println("Total harga             : "+harga*jumlah);
    }
}
