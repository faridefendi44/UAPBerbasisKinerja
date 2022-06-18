package Tugas8;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        Character titan = new Titan(0, 45, 200);
        Character magician = new Magician(10, 60, 100);
        Character healer = new Healer(10, 10, 70);
        Character warrior = new Warrior(30, 25, 80);

        Scanner scan = new Scanner(System.in);


        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.println("Silahkan masukkan nama player : ");
        String nama = scan.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan : \n1. Magician \n2. Healer \n3. Warrior");
        boolean kondisi = true;
        boolean looping = true;
        do {

            do{
                boolean kondisi2 = true;
                int pilih = 0;

                do {
                    try{
                        pilih = scan.nextInt();
                        kondisi2 = false;
                    }catch (InputMismatchException e) {
                        System.out.println("Tolong Masukkan Angka !");
                        System.out.println("Silahkan pilih karakter yang anda inginkan = " +
                                "\n1. Magician" +
                                "\n2. Healer" +
                                "\n3. Warrior");
                    }
                    scan.nextLine();
                }while (kondisi2);

                switch (pilih){
                    case 1 ->{
                        System.out.println("Selamat datang " + nama);
                        System.out.println("------------ STATUS ------------");
                        info(magician);

                        int i = 1;
                        if (kondisi){
                            do{
                                System.out.println("============ TURN"+(i++)+ "============");
                                Attack(magician, titan, nama);

                                if (titan.getHP() == 0 || magician.getHP() == 0) {
                                    kondisi = false;
                                }
                            }while (kondisi);
                        }
                        System.out.println();
                        System.out.println("==============================");

                        ketAkhir(magician, titan, nama);
                        looping = false;
                        break;
                    }
                    case 2 ->{
                        System.out.println("Selamat Datang "+ nama);
                        System.out.println("------------ STATUS ------------");
                        info(healer);

                        int i = 0;
                        if (kondisi){
                            do{
                                System.out.println("============ TURN " + (i++)+"============");
//                                i++;
                                if (i % 2 == 0) {
                                    System.out.println("Menggunakan skill Heal");
                                    ((Healer) healer).heal();
                                }

                                Attack(healer, titan, nama);

                                if (titan.getHP() == 0 || healer.getHP() == 0) {
                                    kondisi = false;
                                }
                            }while (kondisi);
                        }
                        System.out.println();
                        System.out.println("==============================");

                        ketAkhir(healer, titan, nama);
                        looping = false;
                        break;
                    }
                    case 3 ->{
                        System.out.println("Selamat Datang, "+nama);
                        System.out.println("------------ STATUS ------------");
                        info(warrior);

                        int i = 0;
                        if (kondisi){
                            do{
                                System.out.println("============ TURN "+(i++)+"============");
                                Attack(warrior, titan, nama);

                                if (titan.getHP() == 0 || warrior.getHP() == 0) {
                                    kondisi = false;
                                }
                            }while (kondisi);
                        }
                        System.out.println();
                        System.out.println("==============================");

                        ketAkhir(warrior, titan, nama);
                        looping = false;
                        break;
                    }
                    default -> System.out.println("Input anda tidak sesuai !" +
                            "\nSilahkan inputkan nomor sesuai karakter =  \n1. Magician \n2. Healer \n3. Warrior");
                }

            }while (looping);

        }while (looping);
    }

    public static void info(Character character){
        Class className = character.getClass();
        System.out.println("Role        = "+className.getSimpleName());
        character.info();
    }
    public static void Attack(Character player, Character enemy, String nama){
        if (player.attact() == true){
            enemy.receivedDamage(player.getAttact());
        }
        if (enemy.attact() == true){
            player.receivedDamage(enemy.getAttact());
        }

        System.out.println("Enemy's HP = "+enemy.getHP());
        System.out.println(nama+"'s HP = "+player.getHP());
    }
    public static void ketAkhir(Character player, Character enemy, String nama){

        if (enemy.getHP() == 0) {
            System.out.println(nama+" menang");
        }else {
            System.out.println("Titan menang");
        }
        System.out.println();

        System.out.println("============= PLAYER =============");
        System.out.println("------------- STATUS -------------");
        info(player);
        System.out.println("============= MUSUH =============");
        System.out.println("------------- STATUS -------------");
        info(enemy);
    }
}