package Day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        System.out.println(urunler.contains("Nutella"));
        System.out.println(urunler.contains("hobby"));

        List<String> urunler2= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        System.out.println(urunler.contains(urunler2));//true
        urunler2.add("hobby");
        System.out.println(urunler.containsAll(urunler2));//false


    }

}
