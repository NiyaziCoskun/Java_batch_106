package Javapratice.JavaPraticeDay11_interwiev;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/
    /*
    önce Scanner clasında obje oluşturacaz
    sonra spilit
    sonraa sort  kullanacaz
    for loop alacaz
    if ile kontrol yaparız sout ıle  yazdiririz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string ifade giriniz");
        String str=scan.nextLine();

        String arr[]= str.split("");
        System.out.println("arr = " + Arrays.toString(arr));
           //sort
        Arrays.sort(arr);
        System.out.println("arr'nin sort hali= " + Arrays.toString(arr));


        for (int i = 1; i < arr.length ; i++) {
            int cont=0;
            if (arr[i-1].equals(arr[i])){
                cont++;
            }else{
                System.out.println(arr[i-1]+ " sayisi" + (cont+1));
                cont=0;

            }if (i== args.length-1){
                System.out.println(arr[i-1]+ " sayisi" + (cont+1));

            }



        }

    }

}
