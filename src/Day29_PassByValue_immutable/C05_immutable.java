package Day29_PassByValue_immutable;

public class C05_immutable {
    public static void main(String[] args) {
        String isim="mine";

        isim=isim.toUpperCase();

        System.out.println(isim);//MINE

        isim="mevlut";
        System.out.println(isim);

        for (int i = 0; i <100 ; i++) {
            isim+=".";

        }

        System.out.println(isim);


    }





}
