package Tugas2;

public class Lingkaran {
    int jari;

    public Lingkaran(int jari){
        this.jari = jari;
    }
    public void tampilluas(){
        if (jari % 7 == 0) {
            int luas = (int) (22 / 7 * jari * jari);
            System.out.println((double) luas);
        } else {
            int luas2 = (int) (3.14 * jari * jari);
            System.out.println((double) luas2);
        }
    }
}
