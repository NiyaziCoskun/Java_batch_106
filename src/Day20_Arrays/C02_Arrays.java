package Day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int sayilar[]=new int[3];

        System.out.println(sayilar);

        /*
        non prımıtıve data turundeki dataları
        her zaman direkt yazdiramayabiliriz
        Arryan yazdırmak ıstersek  Array clasından yardım ısteriz

         */
        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar));
        String siniflist[]={"ali" ,"ayse","ahmet"};
        System.out.println(Arrays.toString(siniflist));

        siniflist[1]="hasan";
        System.out.println(Arrays.toString(siniflist));

        System.out.println(siniflist[1]);//sadece hasan
        System.out.println(siniflist[0]);
    }
}
