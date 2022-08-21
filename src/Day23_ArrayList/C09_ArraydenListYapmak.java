package Day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        list ile calısırken en kotu ozellıgı elemanları
        tek tek eklemek
         */
        Integer []arr={2,3,6,5,8,9,5,1,2,5,3,5,5,8};

        /*
        bu kadar çok elemanlı bir listeyı tek tek eleman olrak
        girmek yerıne array oluşturup forlop ile oluşturdugumuz liste
        tasıyabiliriz

         */

        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        /*
        bu işlemi yapması ıcın javanın olulrdugu bir method var ancak
        bu yöntemin çok yan etkısı var


        YAN ETKİSİ
        1 bu sekilde oluşturulan listeye add remove gibi size  değiştiren
        methodlar kullanılamaz


         */

        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar);

       // sayilar2.add(5);
        //System.out.println(sayilar2);
        arr[0]=20;
        System.out.println(Arrays.toString(arr));
        System.out.println(sayilar2);
    }
}
