package Javapratice.JavaPraticeday04;

import java.util.Scanner;

public class C03_MethodCreatıon {
    public static void main(String[] args) {
          /*
     Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("47 den kucuk bir tam sayi giriniz");

        int sayi=scan.nextInt();
        fibonnaci(sayi);


    }

    private static void fibonnaci(int sayi) {
        int sayi1=0;
        int sayi2=1;
        int sayi3;
        System.out.print(sayi1+ " ");
        System.out.print(sayi2+ " ");
        
        if (sayi<47){
            for (int i = 2; i < sayi; i++) {
                sayi3=sayi1+sayi2;
                System.out.println(sayi3 +" ");
                sayi1=sayi2;
                sayi2=sayi3;

                
            }
            
        }else System.out.println("47 den kucuk bir sayi giriniz");
    }
}
