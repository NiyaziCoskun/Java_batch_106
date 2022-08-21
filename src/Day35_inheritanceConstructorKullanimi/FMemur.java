package Day35_inheritanceConstructorKullanimi;

public class FMemur extends  EMuhasebe {
    /*
    Exdents  keyword kullanılan claslarda ister default constructor bulunsun
    istersek de biz yenı cons.. oluşturalım.
    Java  cons. ilk satırna supercons. call yazar

    super cons. call default cons. benzer
    görünmesede orada vardır ve çalışır ancak biz ilk satıra farklı bir cons. call
    yazarsak java  super cons. siler

    Eger biz müdahale edip kendı cons. call oluşturmazsak javanın default
    olarak oluşturdugu cons.  call her zaman parametresizdir.

     */


    FMemur (){
        System.out.println("memur parameresiz cons");
    }
    FMemur (String İSİM){
        System.out.println("memur parametreli cons");
    }

    public static void main(String[] args) {

        FMemur mmr1=new FMemur("ali");

    }
}
