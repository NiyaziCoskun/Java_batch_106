package Day23_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler);
        /*
        list ile gelen sort methodun da sıralama özelliğini girmek gerekiyor
        bunun yerine collectıons clasından sort methodunu
        kullanırız.bu method  listemizi natural order'a  gore sıralar

         */

    }
}
