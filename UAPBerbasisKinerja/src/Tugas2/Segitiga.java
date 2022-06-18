package Tugas2;

public class Segitiga {
    int alas, tinggi;

    public Segitiga(){

    }
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void tampilluas(){
        double luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga Adalah = "+luas);
    }
}
