package Day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesı uzerınden marka varıable na ulaşabildim
        //değiştirebildim(yazma)(set) ve yazdirabildim.(okuma)(get)


        arb1.marka="toyota";
        System.out.println(arb1.marka);
        //acces modifıer kullanarak marka varıable na ulasimi
        //tamamen serbest yapabilir veya engelliyebilirim.
        //private yaptıgımız modele ıse hıc ulasamayız
        //yanı acces modifıer ya hep ya hiç diyor

        /*
        modeli  değiştirelim ama göremeyelim yakıtıda görelim ama
        değiştiremeylım

        *  set ve get yetkilerini özel olarak tanımlamak istersenız.
        *  1. adım =özel yetkı tanımlayacagınız variabları private yapın.
        *  private bır data ya başka claslardan ulaşmak mümkün olmadıgından
        *  2. adım set yetkisi setter, get yetkisi için getter methodları oluşturalım



         */

        arb1.setModel("coralla");//model olarak  supra yı atadık
        System.out.println(  arb1.getYakit());//yakıt olarak elektırıklı bilgisi
        //modeli yazdirma imkanımız yok cunku getter methodu yok
        //yakıtı değiştiremeyz cunku setter  methodu yok





    }
}
