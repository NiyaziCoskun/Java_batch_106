package Day30_ımmutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();

        list.add("kenan");
        list.add("enes");
        list.add("ismail");
        System.out.println(list.remove(1));

        System.out.println(list);//[kenan, enes, ismail]

        list.set(1, "yasemin");
        System.out.println(list);//[kenan, yasemin, ismail]


        System.out.println(list);//[kenan, yasemin]
        System.out.println(list.remove("kenan"));
        System.out.println(list);

    }
}
