package Day34_ınheritance;

public class ToyotaCoralla  extends Toyota{
    public static void main(String[] args) {

        ToyotaCoralla arb1=new ToyotaCoralla();
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.model);//model belirtilmedi.
        /*
        chıld clas dan parent clasa erişimde acces  modifier
        kurallarını bypass edmeyız örneğin parent class dakı private clas uyelerını
        chıld clasdan kullanamyız aynı şekilde parent ve chıld farklı pazkcage
        parent  clasdakı default acces  modefıer olan class uyelerını chıld clasrtan kullanamyız
         */

    }


}
