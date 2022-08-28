package Javapratice.Javapraticeday06;

import java.util.Scanner;

public class C08_Arrays {
    public static void main(String[] args) {
        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        int [] arr=new int[8];
        Scanner scan=new Scanner(System.in);
        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + ".ındexdeki sayiyi giriniz:" );
            arr[i]=scan.nextInt();

             if (arr[i]%3==0){
                 System.out.println(arr[i]);
                 sayac++;


            }
        }
        System.out.println("3 e bolunebilen sayi" +sayac);

    }
}
