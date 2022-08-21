package Day18_WhıleDowhıle;

import java.util.Scanner;

public class C06_DoWhıleLoop {
    public static void main(String[] args) {
/*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
         islemi bitirmek icin 0’a basmasini soyleyin.
                Kullanici yanlislikla negative sayi girerse o sayiyi
                 dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla
         kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

 */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifsayiadedi=0;
        int negsayiadedi=0;
        int pozitifsayiartoplami=0;

        do {
            System.out.println("lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                pozitifsayiartoplami+=sayi;
                pozitifsayiadedi++;

            } else if (sayi<0) {
                negsayiadedi++;
                System.out.println("negatif sayi giremezsiniz");


            }


        }while (sayi!=0);

        System.out.println(pozitifsayiadedi + " adet pozitif say girdiniz :" + pozitifsayiartoplami);
        System.out.println(negsayiadedi + " adet negatif sayi girdiniz ancak onlar toplama dahil degil");


    }
}
