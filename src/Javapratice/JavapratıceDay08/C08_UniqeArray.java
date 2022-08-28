package Javapratice.JavapratıceDay08;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_UniqeArray {
    public static void main(String[] args) {

        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */
       int [] arr = {1,2,3,2,1,4,2,5,-2,6,8,7,5,6,-2,9,3,10};

       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-2, -2, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10]
        List<Integer>tekrarsiz =new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1] && !tekrarsiz.contains(arr[i])){
                tekrarsiz.add(arr[i]);
            }


        }
        System.out.println(tekrarsiz);

        }





        }


