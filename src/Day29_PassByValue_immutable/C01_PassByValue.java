package Day29_PassByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {

        /*
        4 elemanlı bir array oluşturalım sonra ayrı bir method da bu arrayın  ıkncı ve
        4 elemanlarını 100 'den kucuk rsatgele bir sayi ile değistirelım
        ve yenı halini yazdiralim
         */
         int [] arr={5,7,8,10};

         elemandegistir(arr);

        System.out.println("main methodun icinde diger method calistiktan sonra:" +Arrays.toString(arr));


    }

    public static void elemandegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));
    }
}
