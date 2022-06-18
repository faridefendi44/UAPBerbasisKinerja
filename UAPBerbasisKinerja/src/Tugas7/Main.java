package Tugas7;

public class Main {
    public static void main(String[] args) {

       Pegawai pt1 = new PegawaiTetap("Bayu","3518052506010001",2000000);
       Pegawai pt2 = new PegawaiTetap("Farid","3518052506010002",4500000);
       Pegawai pt3 = new PegawaiTetap("Budi","3518052506010003",3000000);
       Pegawai ph1 = new PegawaiHarian("Aji","3518056407020004", 8500,40);
       Pegawai ph2 = new PegawaiHarian("Danang","3518056407020005", 12000,45);
       Pegawai ph3 = new PegawaiHarian("Sukma","3518056407020006",10000,50);
       Pegawai sl1 = new Sales("Bima","3528071506730007",50,5000);
       Pegawai sl2 = new Sales("Sakti","3528071506730008",60,6500);
       Pegawai sl3 = new Sales("Aris","3528071506730007",55,7000);
        System.out.println("=============Informasi Pegawai Tetap=========");
        System.out.println(pt1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(pt2.toString());
        System.out.println("---------------------------------------------");
        System.out.println(pt3.toString());
        System.out.println("");
        System.out.println("=============Informasi Pegawai Harian=========");
        System.out.println(ph1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(ph2.toString());
        System.out.println("---------------------------------------------");
        System.out.println(ph3.toString());
        System.out.println("");
        System.out.println("=============Informasi Pegawai Sales=========");
        System.out.println(sl1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(sl2.toString());
        System.out.println("---------------------------------------------");
        System.out.println(sl3.toString());
    }
}
