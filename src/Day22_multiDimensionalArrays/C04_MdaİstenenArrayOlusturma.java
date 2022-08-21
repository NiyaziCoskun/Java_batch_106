package Day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaİstenenArrayOlusturma {
    public static void main(String[] args) {

        /*
        Soru 4)
        Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini  birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i  ekrana  yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
       Ornek; { {1,2,3}, {4,5}, {6,7} }
       ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */
        int [][]ınput={ {1,2,3}, {4,5}, {6,7} };
        int [] yeniarray=new int[ınput.length];
        int toplam=0;

        for (int i = 0; i <ınput.length ; i++) {//dıs outer array kontrol ediyor

            for (int j = 0; j <ınput[i].length ; j++) {//ic loop ise  inner arayleri gezer
                toplam+=ınput[i][j];




            }
            yeniarray[i]=toplam;
            toplam=0;

        }
        System.out.println("istenen yeni array:  " + Arrays.toString(yeniarray));

    }
}
