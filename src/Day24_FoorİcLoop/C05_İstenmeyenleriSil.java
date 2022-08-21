package Day24_FoorİcLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_İstenmeyenleriSil {
    public static void main(String[] args) {

        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin


        String [] sehirler={"istanbul", "ankara", "mersin","konya","kastamonu"};
        String istenmeyenharf="r";
        List<String>kalanlar=new ArrayList<>();


        for (int i = 0; i < sehirler.length ; i++) {
              if (!sehirler[i].contains(istenmeyenharf)){
                  kalanlar.add(sehirler[i]);

              }
        }
        //loop bittiğinde istenmeyen harf içermeyen sehirler listeye eklenmıs olacak
        System.out.println(kalanlar);

        //yeni bir array olusturup lısteyı ona aktaralım
        String [] kalanlararray=new String[kalanlar.size()];
        for (int i = 0; i < kalanlararray.length ; i++) {
            kalanlararray[i]=kalanlar.get(i);

        }
        //sehırler arrayın yeni degerini atayalım
        sehirler=kalanlararray;
        System.out.println("sehirler arrayin son hali:"+ Arrays.toString(sehirler));
    }
}
