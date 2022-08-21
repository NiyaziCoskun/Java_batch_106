package Day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        Verilen bir array'deki tekrar eden elementleri silip
        tekrarasiz halini bir array'e atayan kod yaziniz.

         */
        int [] arr={3,4,5,6,9,7,8,2,5,6,4,5,6,6,3,8,9,6};

        Set<Integer> tekrarsizset=new HashSet<>();

        for (int each: arr) {
            tekrarsizset.add(each);



        }
        System.out.println(tekrarsizset);

        int []tekrarsizarr=new int[tekrarsizset.size()];


         int i=0;
        for (Integer each:tekrarsizset
             ) {
            tekrarsizarr[i]=each;
            i++;



        }
        arr=tekrarsizarr;
        System.out.println( " bizim arrayin son hali : " + Arrays.toString(tekrarsizarr));

    }
}
