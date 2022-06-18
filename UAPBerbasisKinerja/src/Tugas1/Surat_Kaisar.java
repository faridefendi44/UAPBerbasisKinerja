package Tugas1;

import java.util.Scanner;

public class Surat_Kaisar {
    public static void methodcaesar(String klmtAsli, int n){
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < klmtAsli.length();i++) {
            alphabet = klmtAsli.charAt(i);

            if(alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + n);

                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;

            } else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + n);

                if(alphabet > 'Z') {

                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }

            else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println(ciphertext);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String klmtAsli = sc.nextLine();
        int n = sc.nextInt();
        Surat_Kaisar.methodcaesar(klmtAsli,n);
    }
}


