package Day44_collectıons;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String>ll3=new LinkedList();

        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("polat");
        ll3.add("kadir");
        //queue kuyruk demektir sira onemlidir
        //gelen sona gelir, giden bastan gider

        System.out.println(ll3);//[adem, zeynep, polat, kadir]

        System.out.println(ll3.remove());//adem
        System.out.println(ll3);//[zeynep, polat, kadir]

        System.out.println(ll3.remove("polat"));//true

        System.out.println(ll3);//[zeynep, kadir]

        System.out.println(ll3.element());//zeynep
        System.out.println(ll3.peek());//zeynep

        Queue<String>ll4=new LinkedList();
        //System.out.println(ll4.element());//thowrs excaptıon
        System.out.println(ll3.peek());//null
        /*
        peek ve elementi silmeden ilk elementi bize döndürür.
        aralarında ki fark boş liste  olursa peek null döner
        element exceptıon verir.

         */
        ll3.offer("ahmet");
        ll3.offer("sefa");
        System.out.println(ll3);//[zeynep, kadir, ahmet, sefa]

        System.out.println(ll3.poll());//zeynep
        System.out.println(ll3);//[kadir, ahmet, sefa]

       //System.out.println(ll4.remove());//Exception in thread "main" java.util.NoSuchElementException
        System.out.println(ll4.poll());//null

    }
}
