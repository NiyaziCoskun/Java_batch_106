package Day25_constructor;

import java.util.Scanner;

public class C02_Constructor {

    /*
    java oop konsept kuulandıgı ıcın olusturulan her bir clasın ıhtıyac
    oldugunda obje uretılmasıne uygun dizayn etmişitr
    ama her classdan obje uretılmeyebilir
    bunun içi java ihtiyac halınde kullanılması ıcın her class da default bir constructor koymustur
    bu default constructor class dan  obje oluşturuldunda otomatık olarak calısır
    örnek bu clasda constructor görülmemmesine ragmen c02 clasında
    içinde oldugumuz c01 clasından bır obje üretebilidik

     */
    public static void main(String[] args) {

        C01 obj1=new C01();
        /*
        class adı
        obj1 objenın adı
        new = keyword
        constructor


         */
        Scanner scan=new Scanner(System.in);


        System.out.println(obj1.sayi);//0


        obj1.deneme();
        /*
        java da bır obje oluşturmak ıcın mutlaka
        constructor kullanmalısınız

         */

    }
}
