package Day28_StatikBlock;

public class C01_StaticBlok {

    static  int sayi;
    static {
        System.out.println(" static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);

        /*
        static blok class uyelerının tamamından once calısır
        maın method dan bıle önce calısır
        statıc blok class olusturuldugunda calısır genelıkle class ıle ılgılı
        ön ayarlamalr veya statıc varıable lara deger atamak ıcın kullanılır

        statıc blok ların class ıcerinde nerede oldugu önemlı degıl
        önce statıc bloklar calısır bırden fazla statıc blok varsa
        yukarıdan asagı dogru calısır


         */
    }
    static {
        System.out.println(" maın method altindaki static blok calisti");
    }

}
