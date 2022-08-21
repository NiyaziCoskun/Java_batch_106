package Day17_nestedforloop;

import java.util.Scanner;

public class C08_WhıleLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak üzere sayılar alın sayıların toplamı
        500 ü gecince
        sayıların toplamını ve  kacsayı toplandıgı 13 sayi girdiniz
        ve toplmaları 567
         */
        int toplam=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);
        while (toplam<500){
            System.out.println("lutfen toplamak icin sayi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println(sayac  + "sayi girdiniz ve toplamlari:" + toplam);
    }
}
