package Day35_inheritanceConstructorKullanimi;

public class Matematikciler extends  LOgretmen {

    Matematikciler (){
        System.out.println("matematikciler parametresiz cons");

    }
    Matematikciler (String isim){
        this();
        System.out.println("matematikciler parametreli cons");

    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("tugba");

    }
    /*
    thıs () cons. call içinde bulununlan class daki cons. super cons. call ise
    parent class da bulunan cons cagırır.

    * this veya super parametre yapısına uygun bır cons. bulamazsa
    java CTE verir.

    -cons. konusunda gördüğümüz thıs. o class daki ınstance varıable refere ediyordu
    ınherıtance super nokta vardir
    super.  parent class dakı ınstance refere eder.

     */

}
