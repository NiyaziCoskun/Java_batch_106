package Day18_WhıleDowhıle;

public class C02_WhıleLoop {
    public static void main(String[] args) {
//Soru 7 ) Kullanicidan bir sayi alin
// ve bu sayinin rakamlari toplamini yazdirin


        int input=5432;

        int rakamlartoplami=0;
        int birlerbasamagi=0;
        int temp=input;

       while (temp>0){
           birlerbasamagi=temp%10;
           rakamlartoplami+=birlerbasamagi;
           temp/=10;

       }
        System.out.println(input + "sayisinin rakamlar toplami :" + rakamlartoplami);
    }
}
