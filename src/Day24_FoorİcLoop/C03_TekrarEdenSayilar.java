package Day24_FoorİcLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {

       // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int []arr={2,3,5,6,4,6,5,9,6,3,5,5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> tekraredenler=new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i]==arr[i+1] && !tekraredenler.contains(arr[i])){
                System.out.print(arr[i] + " ");
            }

        }

    }
}
