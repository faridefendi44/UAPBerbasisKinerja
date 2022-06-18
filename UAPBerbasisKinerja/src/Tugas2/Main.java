package Tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do{System.out.println("Menu\n" +
                "1. Luas Persegi\n" +
                "2. Luas Segitigas\n" +
                "3. Luas Lingkaran");
            System.out.print("Masukkan Pilihan Anda = ");
            pilihan = sc.nextInt();
            switch (pilihan){
                case 1 :
                    System.out.print("Masukkan sisi persegi = ");
                    Persegi persegi = new Persegi(sc.nextInt());
                    persegi.tampilluas();
                    break;
                case 2 :
                    Segitiga segitiga = new Segitiga();
                    System.out.print("Masukkan alas segitiga = ");
                    segitiga.alas = sc.nextInt();
                    System.out.print("Masukkan tingi segitiga = ");
                    segitiga.tinggi = sc.nextInt();
                    segitiga.tampilluas();
                    break;
                case 3 :
                    System.out.print("Masukkan ari - jari lingkaran = ");
                    Lingkaran lingkaran = new Lingkaran(sc.nextInt());
                    lingkaran.tampilluas();
                    break;
                default:
                    System.out.println("Pilihan anda tidak sesuai!!!");

            }

        } while (pilihan != 3);
    }
}
