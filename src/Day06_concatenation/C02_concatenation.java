package Day06_concatenation;

public class C02_concatenation {
    public static void main(String[] args) {

         String str= "java";
         String str2="guzeldir";
          int sayi1=5;
          int sayi2=4;

        System.out.println( str+" "+str2+" "+sayi1+sayi2);

        System.out.println(str+" "+str2+ " " +(sayi1+sayi2) );//java güzeldir 9
        System.out.println(sayi1+sayi2+" "+ str);//9
        System.out.println(" "+sayi1+sayi2+" "+str);//54 güzelidr
        System.out.println(str.concat(str2) );//javagüzelidr
        System.out.println(str.concat( (" ").concat(str2)));//java güzeldir



    }
}
