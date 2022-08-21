package Day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethod {
    public static void main(String[] args) {

       Map<Integer,String> ogrencinomap= ReusableMethods.mapOlustur();
        System.out.println(ogrencinomap);

        //value'ları sıra numaraları yazdir
        ReusableMethods.tumValueSiraliYazdir(ogrencinomap);

        /*
        isim ve soyisimlerin birlikte olacagı bir liste oluştrun
         */
       List<String> sinifisimsoyisimlist= ReusableMethods.isimSoyisimListesiOlustur(ogrencinomap);
        System.out.println("isim soyisim listesi :" +sinifisimsoyisimlist);


    }


}
