package Day44_collectıons;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DataTuru {
    public static void main(String[] args) {

        Deque<String> ll4=new LinkedList();

        ll4.add("cavidan");
        ll4.add("mesut");
        ll4.add("selim");
        ll4.add("tevfik");
        ll4.add("selim");
        ll4.removeFirstOccurrence("selim");
        System.out.println(ll4);
        System.out.println(ll4.pop());
        //linklist'in başında ki elementi silip bize döndürür.


        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
        //deque iki taraflı queue demektir dolayısıyla her method'un fırst ve last var

    }
}
