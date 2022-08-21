package Day24_FoorİcLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr={"ismail","nurullah","fatih"};
        /*
        uzun listeler oluşturmamız gerektiğinde tek tek
        eklemek yerıne array oluşturup bunları list cevirmek
        daha pratık olur
        1- loop ile array deki tum elementlerı list'e atarız
        2- Arrays.aslist mehodu ile kullanırız ancak bu methodun iki tane kotu yan
        etkısı var
        1-arrays clası kullanıldıgı ıcın array ozeliklerigecerli olur
        dolayısıyla
        list te olan add remove gibi size degistiren
        mehodlar bu sekilde olusturulan listlerde kullanılmaz
        -kaynak olan array ıle urun olan list ozdeslestırılır
        birinde yapılan değişiklik otomatık oalrak diğerinede işlenir

         */
        List<String> siniflist= Arrays.asList(arr);
        System.out.println(siniflist);//ısmail nurullah fatih

        //1. ci yan etki
       // siniflist.add("erdi");exceptıon
       // siniflist.remove(1);exceptıon

        //2. ci yan etki
        arr[1]="emre";

        System.out.println( " degisim sonrasi array:" +Arrays.toString(arr));
        System.out.println("arrayi degisitrince list:" +siniflist);
        siniflist.set(0,"utku");
        System.out.println("listi degistirince list:" +siniflist);
        System.out.println("listi degistirince array:"+Arrays.toString(arr));
    }
}
