package Day24_FoorİcLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int [] arr={2,3,4,6,23,6,8,9,6,2,4,};
        List<Integer> liste=new ArrayList<>();

        //arraydeki tum elemanları inceleyelım tek sayı olanları liste atalım

        for (int each:arr  //gelecek dataların turu loop içinde ne isim verdiğim ve nereden aldığım
        ) {


            if (each%2==1){
                liste.add(each);

            }
        }
        System.out.println(liste);

    }
}
