package Day20_Arrays;

import java.util.Arrays;

public class C04_Elemanlarıyazdırma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};

        //arrayın tamamını yazdirmak istesek

        System.out.println(Arrays.toString(sayilar));
        //arrayın tum elementlerını yazdirin

        for (int i = 0; i < sayilar.length ; i++) {
            if (i!= sayilar.length-1){
                System.out.print(sayilar[i]+"  ");
            }else {
                System.out.println(sayilar[i]);
            }

        }
    }
}
