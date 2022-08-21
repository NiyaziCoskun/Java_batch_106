package Day24_FoorİcLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtakElemanlarıBulma {
    public static void main(String[] args) {

        /*
        Soru 3:
iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
each loop
kullanarak bulunuz. Sonucu ekrana yazdiriniz.
Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

         */


        String [] arr1={"ali","veli","can","ayse"};
        String [] arr2={"ali","hasan","ayse","enes"};

        List<String> ortakisimler=new ArrayList<>();

        for (String each1: arr1

             ) {
            for (String each2: arr2

                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakisimler.add(each1);
                }

            }

        }
        if (ortakisimler.isEmpty()){
            System.out.println("hic ortak eleman yok");

        }else{
            System.out.println("her iki array de ortak isimler:" +ortakisimler);
        }
        System.out.println(Arrays.toString(arr1));

    }
}
