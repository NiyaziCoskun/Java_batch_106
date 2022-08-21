package Day44_collectıons;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedListDataTuru {
    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<>();

        List<String> ll2=new LinkedList();

        Queue<String> ll3=new LinkedList();

        Deque<String> ll4=new LinkedList();

        ll2.add("berk");
        ll2.add("done");
        ll2.add("ayse");
        ll2.add("enes");
        System.out.println(ll2);//[berk, done, ayse, enes]
        System.out.println(ll2.remove(3));//enes
        System.out.println(ll2.remove("kemal"));//false
        /*
        eger listemiz ınteger elementlerden oluşuyorsa direk  sayiyazarsak
        ındex olarak kabul eder bir variable atama yapar ve remove'da o varıabl 'in
        ismini yazarsak obje olarak kabul eder.
         */
        System.out.println(ll2.isEmpty());//false
        ll2.set(1,"serap");
        System.out.println(ll2);//[berk, serap, ayse]

        ll1.add("berk");
        ll1.add("ismail");
        System.out.println(ll1);
        ll2.retainAll(ll1);//ll2 deki tum elementlerı ll1 ile karşılaştırır
        //ll1'de olmayanları siler


        ll2.retainAll(ll2);//berk
        System.out.println(ll2.hashCode());//3020251
        ll2.add("fatih");
        System.out.println(ll2.hashCode());// 190831485



    }
}
