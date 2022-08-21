package Day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {


        //iki sekilde arrray oluşrurruz

        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayilar array'in uzunlugu:" + sayilar.length);//3
        System.out.println("harfler arrayin uzuznlugu:"+harfler.length);
        System.out.println(Arrays.toString(harfler));

        //strıng length metodunda parantez var array da yok
        //harfler array ın son  elementi yazdiralım

        System.out.println(harfler[harfler.length-1]);
        System.out.println(harfler[5]);

    }
}
