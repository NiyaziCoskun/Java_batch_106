package Day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);



        System.out.println(sayilar1);//5 3 2 1

        sayilar1.remove(1);
        /*
        sayilardan oluşan bir list varsa java remove methodun da
        sayı yazdıgımızda direkt index olarak  kabul eder

         */
        System.out.println(sayilar1);//[5, 2, 1]

        //illa da 5 i silsin
        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);//[2, 1]
        //veya indexof methodundan yardım alabilrim

        sayilar1.remove(sayilar1.indexOf(2));
        //2 yi silmek için 2 nın index sini bulup onu remove yazabılırız

        System.out.println(sayilar1);//[1]



    }
}
