package Day29_PassByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        verilen 4 elemanlı bir array'i methoda gönderelim
        method 'da yeni üç elemanlı bir array atayıp bu yeni array'e
        rastgele 100'den kucuk 3 sayi atayalım
        method da arrayı yazdiralım maın method da method call dan sonra
        yenıden  methodu yazdiralım

         */

        int [] arr={3,5,8,10};

        arrayidegistir(arr);
        System.out.println("method call dan sonra array :" + Arrays.toString(arr));

        /*
        birden fazla element iceren array ve arraylist gibi yapılarda
        passbyvalue  gecerlidir.
        eger method da array veya listin kendisi değiştirlirse passbyvalue
        özelliği sebebi ile değişen degeri değil array veya listin orjinal degerini alir
        ancak array veya list değiştirilmeden sadece içindeki elemnlar değiştirilirse
        java obje değişmediği için referans aynı veya aynı array  veya listi döndürür
        ancak ıcındekı elementler değişmiş olacaktır

         */


    }

    public static void arrayidegistir(int[] arr) {
        arr=new  int[3];
        Random rnd=new Random();

        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println("method da array :" + Arrays.toString(arr));


    }

}
