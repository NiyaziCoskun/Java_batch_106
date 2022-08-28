package Javapratice.Javapraticeday06;

import java.util.Scanner;

public class C04_DoWhıleLoop {
    public static void main(String[] args) {
     /*Kullanıcıdan bir kelime girmesini isteyin. Kelimenin tek sayıda karakteri varsa
ve 3 veya daha fazla karaktere sahip,
karakteri kelimenin ortasına yazdırın.
kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz.
"*/

        Scanner scan = new Scanner(System.in);
        String word ="";
        do {
            System.out.println("lutfen bir kelime giriniz :");
            word = scan.nextLine();
            if(word.length()<3){
                System.out.println("girilen word 3 karakterden az");
            }if(word.length()%2==1  && word.length()>=3){
                System.out.println("ortadaki karakter :" +word.charAt(word.length()/2));
            }else{
                System.out.println("You entered wrong word.");
            }
        }while(!(word.length()%2==1  && word.length()>=3));
    }
}
