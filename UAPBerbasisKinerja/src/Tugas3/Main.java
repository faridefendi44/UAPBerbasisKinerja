package Tugas3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        Baju [] baju = new Baju[3];
        for (int i = 0; i < baju.length; i++) {
            baju [i] = new Baju();
        }
        for (Baju x: baju) {

            System.out.println("Baju yang tersedia : \n" + "Baju A dengan harga " + x.bajua);
            System.out.println("Baju B dengan harga " + x.bajub);
            System.out.println("Baju c dengan harga " + x.bajuc);
            System.out.print("Baju yang akan anda beli bertipe    : ");
            x.jenis = sc.nextLine();
            System.out.print("Jumlah baju yang akan anda beli adalah  : ");
            x.jumlah = sc.nextInt();
            sc.nextLine();
            x.display();
            System.out.println();
        }
    }
}
