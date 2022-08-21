package Day15_overloading_forloop;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(5, 7); // 12
        topla(5.2, 3); // 8.2
        topla(3.4, 6.1); // 9.5
        topla(5, 6.2);//

        /*
        java hangi methodun calısacagına karar verirken optimizasyon
        yapar eger hic cast yapmadan kullanacagı method varsa onu kullanır
        eger cast yapmadan kullanacagı bir method yoksa en az cast
        yaparak kullanbilecegi metodu tercih eder
         */
    }



    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integer'in toplami : " + (sayi1 + sayi2));
    }



    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integer'in toplami : " + (sayi1 + sayi2));
    }




    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double'in toplami : " + (sayi1 + sayi2));
    }

}

