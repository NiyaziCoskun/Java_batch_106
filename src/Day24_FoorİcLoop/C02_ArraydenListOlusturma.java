package Day24_FoorİcLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000 den kucuk pozitif tamsayı olan bir list
        olusturun kullanıcıdan bir sayi isteyıp listede
        var olup olmadıgını kullancıya yazalım
         */
        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayilistesi=new ArrayList<>();

        while (sayilistesi.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayilistesi.contains(sayi)){
                sayilistesi.add(sayi);

            }
        }
        System.out.println(sayilistesi);

        boolean bildimi=false;
        int tahminsayisi=1;
        Scanner scan=new Scanner(System.in);

        while (!bildimi){//bildimi false
            System.out.println("lutfen bir tahmininde bulunun");
            sayi=scan.nextInt();

            if (sayilistesi.contains(sayi)){
                System.out.println("tebrikler:" +tahminsayisi+ " ader tahminde listeden bir sayi buldunuz");
                bildimi=true;

            }else {
                System.out.println(tahminsayisi+ "adet sayisöylediniz ama hicbiri listede yok");
                tahminsayisi++;

            }

        }
    }
}
