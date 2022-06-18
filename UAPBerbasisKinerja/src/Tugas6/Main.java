package Tugas6;
import java.util.Scanner;

/*Nama = Akhmad Farid Nur Efendi
  NIM  = 215150700111005*/

public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================================");
        System.out.println("                       Informasi Manusia                       ");
        System.out.println("===============================================================");
        Manusia m1 = new Manusia("Mario Aji","351506010001", true, false);
        Manusia m2 = new Manusia("Fabio Quartararo","351506010002", true, true);
        Manusia m3 = new Manusia("Fransesco Bagnaia", "351506010003", true, true);
        System.out.println(m1.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(m2.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(m3.toString());
        System.out.println("---------------------------------------------------------------");


        System.out.println("===============================================================");
        System.out.println("                      Informasi Mahasiswa                      ");
        System.out.println("===============================================================");
        Mahasiswa mhs1 = new Mahasiswa("Cintya Orty Arnindisari","351507010001",false,false,"215150400111001",3.80);
        Mahasiswa mhs2 = new Mahasiswa("Akhmad Farid Nur Efendi","351507110002",true,false,"215150700111005", 3.92);
        Mahasiswa mhs3 = new Mahasiswa("Divya Dwi Martiani","352805210003",false,false,"215150200111001", 3.80);
        System.out.println(mhs1.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(mhs2.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(mhs3.toString());
        System.out.println("---------------------------------------------------------------");

        System.out.println("===============================================================");
        System.out.println("                       Informasi Pekerja                       ");
        System.out.println("===============================================================");
        Pekerja pkj1 = new Pekerja("Emi Sholihah Meidyawati","351708020001", false, true, 7,25, "195102439283");
        Pekerja pkj2 = new Pekerja("Agus Reza Qoharianto","352708220001",true,false,9,22,"207102939283");
        Pekerja pkj3 = new Pekerja("Hendri Nurhadi Sismianto","351805210005",true,false,7,26,"723102339283");
        System.out.println(pkj1.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(pkj2.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(pkj3.toString());
        System.out.println("---------------------------------------------------------------");

        System.out.println("===============================================================");
        System.out.println("                       Informasi Manajer                       ");
        System.out.println("===============================================================");
        Manajer mnj1 = new Manajer("Novi Kurniawati","351704050001", false, true, 7,20, "321102139283",1500);
        Manajer mnj2 = new Manajer("Haris Perdana","352708240001",true,true,9,22,"412102239283",2000);
        Manajer mnj3 = new Manajer("Endang Wahyuningsih","351205210005",false,true,7,20,"533102839283", 3000);
        System.out.println(mnj1.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(mnj2.toString());
        System.out.println("---------------------------------------------------------------");
        System.out.println(mnj3.toString());
        System.out.println("---------------------------------------------------------------");

    }
}