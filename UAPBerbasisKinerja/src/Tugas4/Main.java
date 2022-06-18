package Tugas4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Selamat Datang di Aplikasi UBFOOD ===");


        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 1000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.display();



        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(sc.nextLine(), sc.nextLine(), sc.nextDouble()));sc.nextLine();
        DataMerchant.display();
        System.out.println("\n");
        System.out.println("Masukkan Merchant yang anda cari");
        DataMerchant.cariMerchant(sc.nextLine());
        System.out.println("\n");
        DataMerchant.updateMerchant();
    }
}

