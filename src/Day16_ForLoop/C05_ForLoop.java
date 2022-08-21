package Day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
      //  Soru 10 ) Kullanicidan iki sayi isteyin.
        //  Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //  sonucu yazdiran bir method yaziniz


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini girin pozitif tam sayi olarak");

        int bas=scan.nextInt();
        int bitis=scan.nextInt();

        aralaritopla(bas,bitis);
    }

    public static void aralaritopla(int bas, int bitis) {
        int toplam=0;
        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
                toplam +=i;

            }
        }else {
            for (int i = bitis; i <=bas ; i++) {
                toplam +=i;
            }

        }
        System.out.println("aradaki sayilarin toplami :" + toplam);
    }
}
