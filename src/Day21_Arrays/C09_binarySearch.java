package Day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        binarySerach metodu sıralanmıs array de aradıgımız elementın
        index sini döndürür.
        ya aradıgımız element array de yoksa ?
         String de indexof bize olmayan elementler icin -1 döndüruyor

         */

        int [] sayilar={3,5,1,4,7,0};
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.binarySearch(sayilar,1));






    }
}
