package Recap01;

import java.util.Scanner;

public class C08_BMI {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("kg olarak agirliginizi giriniz");
        double agirlik=scan.nextDouble();
        System.out.println("lutfen cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();

        boy=boy/100;
        //boy/=100

        double vke=agirlik/(boy*boy);
        System.out.println("vke =" + vke);

    }
}
