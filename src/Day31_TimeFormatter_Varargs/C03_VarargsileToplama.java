package Day31_TimeFormatter_Varargs;

public class C03_VarargsileToplama {
    public static void main(String[] args) {
        /*
        verilen  kac int olursa olsun hepsini toplayıp sonucunu
        yazdiran bir method oluşturun
         */
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplayazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplayazdir(sayi1,sayi2,sayi3,sayi4);
        toplayazdir(sayi1,sayi2,sayi3);
        toplayazdir(sayi1,sayi2);








    }

    public static void toplayazdir(int... sayi) {
        /*
        int...  sayi bu gösterim int variable'lardan oluşan
        varargs demektır
        Varargs : Array altyapısını kullanır

         */
        int toplam=0;
        int sayiadedi= sayi.length;
        for (int each:sayi
             ) {
            toplam+=each;

        }
        System.out.println("girilen "  +sayiadedi+ "adet sayinin toplami:" +toplam);

    }
}
