package Day21_Arrays;

public class C01_ArraysMaksımumsayibul {
    public static void main(String[] args) {
       // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int []sayilar={3,5,7,1,4,9,5,2};

        maxsayiyiyazdir(sayilar);
    }

    public static void maxsayiyiyazdir(int[] sayilar) {
        int maxsayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar[i]>maxsayi){
                maxsayi=sayilar[i];
            }


        }

        System.out.println("arraydeki en buyuk sayi:" +maxsayi);
    }
}
