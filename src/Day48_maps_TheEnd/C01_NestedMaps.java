package Day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {

        /*
        eger bir elementle ile ilgili tutacagınız bilgiler coksa veya kompleks
        ise bu defa iç içe map  kullanmayı tervih  ederiz
        iç içe map kullandıgımzda daha fazla datayı daha duzenlı
        olarak tutma imkanımız olur.
        ancak  bilgiye ulaşmak ve manıpule etmek zorlasaktır.

        örnek olarak dünki map'ımızı map'lerden oluşan
        bir map oluşturalım
         sinifmap.put(no=101, isim="Ali, soyisim=Can, brans=JDev");
        sinifmap.put(102, "enes, Cem, Tester");
        sinifmap.put(103, "taha, emre, Javaci");
         */

        Map<String,String> ogr1=new HashMap<>();
        ogr1.put("isim","enes");
        ogr1.put("soyisim","can");
        ogr1.put("brans","tester");

        Map<String,String> ogr2=new HashMap<>();
        ogr2.put("isim","taha");
        ogr2.put("soyisim","emre");
        ogr2.put("brans","dev");

        Map<String,String> ogr3=new HashMap<>();
        ogr3.put("isim","derya");
        ogr3.put("soyisim","deniz");
        ogr3.put("brans","devops");

        Map<Integer,Map<String,String>> ogrencinestedmap=new HashMap<>();

        ogrencinestedmap.put(101,ogr1);
        ogrencinestedmap.put(102,ogr2);
        ogrencinestedmap.put(103,ogr3);

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti =ogrencinestedmap .entrySet();

        for (Map.Entry each: ogrenciEntrySeti
             ) {
            System.out.println(each);

        }

        //102 nolu kişinin ismini yazdiralım

        System.out.println(ogrencinestedmap.get(102).get("isim"));



    }
}
