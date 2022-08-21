package Day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'ın array yapan  sembol {} idi
        arraylist ise <> diomand(elmas) kullanırız
         */
        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);
        //bir list eleman eklemek istersek
        isimler.add("basak");
        System.out.println(isimler.add("ayse"));
        System.out.println(isimler);
        /*
        string de bir method calıstırdıgımız zaman assıgn yapmazsak
        string degismiyordu
        list'ın tek kotu rarafı array alt yapısını kullandıgı ıcın elamanları birer birer
        eklemek zorundadır


        string isim="suleyman
        isim.touppercase()//suleyman
        sout (isim)  suleyman


         */
    }
}
