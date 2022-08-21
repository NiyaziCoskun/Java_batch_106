package Day44_collectıons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_LıstIterator {
    public static void main(String[] args) {

        /*
        Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

         */
        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        //sondan başa gelebilmek için önce sona gitmek lazım

        ListIterator Lİ1=liste.listIterator();
        System.out.println(liste);
        while (Lİ1.hasNext()){
            Lİ1.next();
        }
        //bu loop bizi sona götürür.
        while (Lİ1.hasPrevious()){
            System.out.print(Lİ1.previous() + " ");
        }

    }
}
