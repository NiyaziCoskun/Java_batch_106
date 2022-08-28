package Javapratice.Javapraticeday06;

import java.util.Scanner;

public class C02_WhıleLoop {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

          int count=0;


        while (sayi>0){
            if (sayi%2==1){
                System.out.println(sayi);
                count++;


            }
            sayi--;

        }
        System.out.println("count:"+count);
    }
}
