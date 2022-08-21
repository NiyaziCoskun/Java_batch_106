package Day35_inheritanceConstructorKullanimi;

public class AGrandParent {

    protected   String isim="Grandpa ismi belirtilmedi";
    /*
    Her class'da görünmese bile bir constructor vardir.
    Bu class'dan obje oluşturmak istediğimizde default
    constructor devreye girecektir.
    Default constructor gözlemleyemeyecegımız için onun yerine kullanılabılıcek
    parametresız constructor oluşturalım.
     */

    protected String grandpakulupadi="Grandpa kulubu";



    AGrandParent (){
        System.out.println("Grandpa constructor calisti");

    }

}
