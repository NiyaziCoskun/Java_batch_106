package Day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        /*
        list prımıtıve data turlerını kabul etmez

         */
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);//5 3 7
        //sadece add kullanırsak  java sona ekler

        sayilar.add(2,10);//indexi 2 olan yere  10 elememti ekleyelim
        System.out.println(sayilar);
        //add index,element istediğimiz indexe istediğimiz elementi yerleştırır


    }
}
