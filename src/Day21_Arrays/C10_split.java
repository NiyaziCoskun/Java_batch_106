package Day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split bir array metodu degil strng metodu
        ama  array döndürdügü için bu konuda anlatıyoruz

         */
        String str="java ne kadar guzel";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
    }
}
