package Tugas2;

public class Persegi {
    int sisi;
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    public void tampilluas(){
        int luas = sisi*sisi;
        System.out.println("Luas Persegi Adalah = "+luas);
    }
}
