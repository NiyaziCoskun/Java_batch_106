package Day21_Arrays;

public class C02_enuzunvekısakelime {
    public static void main(String[] args) {
        // Soru 2- Verilen String bir array’de en uzun ve
        // en kisa String’leri yazdiran bir method olusturun

        String[] isimler = {"erdal", "onur", "mehmet", "hayrullah", "mihrican"};

        enuzunveenkısayazdir(isimler);
    }

    public static void enuzunveenkısayazdir(String[] isimler) {
        String enuzunkelime = isimler[0];
        String enkisakelime = isimler[0];

        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length() > enuzunkelime.length()) {
                enuzunkelime = isimler[i];
            }
            if (isimler[i].length() < enkisakelime.length()) {
                enkisakelime = isimler[i];

            }
        }
        System.out.println("arraydeki en uzun kelime:" + enuzunkelime);
        System.out.println("arraydeki en kisa kelime:" + enkisakelime);
    }
}
