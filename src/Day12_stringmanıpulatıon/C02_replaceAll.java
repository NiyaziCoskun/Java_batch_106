package Day12_stringmanıpulatıon;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";


        // str'i Bugun Java cok guzel haline getirin
        // replaceAll methodundaki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil

        //replaceAll da char kullanamiyoruz
        //replaceAll methodunda Reguler Expressions kullanilabilir
        // \\s : bosluk(space)
        // \\S : bosluk disindaki tum karakterler
        // \\w : harf ve rakamlar
        // \\W : harfler ve ramamlar disindaki tum karakterler
        // \\d : rakamlar (0-9)
        // \\D : ramalar disindaki tum karakterler


        //tum ozel karakterleri silelim dedigimizde space'lerde siliniyor
        //spaceleri korumak icin onlarin yerine cumlede bulunmayacak
        //bir string koyalim ornegon qazwsx
        str = str.replace(" ", "");
        str = str.replaceAll("\\W", "");

        str = str.replaceAll("\\d", "");
        // istenmeyen ozel karakter ve sayilardan kurtulduk
        //simdi spaceleri geri getirelim

        str = str.replace("qazwsx", " ");
        System.out.println(str);

    }
}