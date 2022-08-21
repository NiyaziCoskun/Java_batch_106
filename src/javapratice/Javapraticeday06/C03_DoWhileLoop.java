package javapratice.Javapraticeday06;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
ve x girildiğinde ise "Program bitti" yazan programı yazınız.
*/

        Scanner scan=new Scanner(System.in);
        String ınput ="";




        do {
            System.out.println("harf giriniz :");
            ınput=scan.next();
            System.out.println("program calisiyor");

        } while(!ınput.equalsIgnoreCase("x"));
        System.out.println("program bitti");

    }
}
