package Javapratice.Javapraticeday06;

import java.util.Scanner;

public class C11_Soru {
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin="mehmet.1234";
        int girishakkı=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("******hosgeldiniz***");

        while (true){
            System.out.println("pin kodunuzu giriniz:");
            String girilenpin=scan.nextLine();

            if (pin.equals(girilenpin)){
                System.out.println("basarili giris yaptiniz");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz");
                girishakkı--;
                System.out.println("kalan giris hakkiniz:" +girishakkı);
            }
            if (girishakkı==0){
                System.out.println("giris hakkiniz kalmadi blolklandiniz..");

                break;
            }
        }

    }
}
