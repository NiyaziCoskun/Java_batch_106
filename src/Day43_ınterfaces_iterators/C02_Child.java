package Day43_ınterfaces_iterators;

public class C02_Child implements  I01_InterfaceBodyOlanMethod{

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
        /*
        Parent ınterface'de abstract olan 3 method'u implement ettiğimizde
        java itirazini durdurur.
        Sonradan eklediğimiz default veya statıc keyword ile
        tanımladığımız method'ları implement etmemız sorun oluşturmadı.

         */

    }

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_Child obj=new C02_Child();
        obj.teker();
    }
}
