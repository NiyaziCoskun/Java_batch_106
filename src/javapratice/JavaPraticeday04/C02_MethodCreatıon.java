package javapratice.JavaPraticeday04;

import java.util.Scanner;

public class C02_MethodCreatıon {
    public static void main(String[] args) {
        /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
        Scanner scan=new Scanner(System.in);

        System.out.println("metre ve km donustermek istediginiz cm yi giriniz:");
        double santimetrevalue=scan.nextDouble();


        convertsm(santimetrevalue);

    }

    public static void convertsm(double santimetrevalue) {
        double metre=santimetrevalue/100;
        double km=santimetrevalue/100000;
        System.out.println("girdiginiz santimetre degeri:" +santimetrevalue +metre+" m dir" +km+ " km dir");


    }
}
