package Recap01;

import java.util.Scanner;

public class C04_ifstatement {
    public static void main(String[] args) {
        /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */

        System.out.println("lutfen is unvanizi giriniz");
        Scanner scan=new Scanner(System.in);
        String jobtitle=scan.nextLine().toLowerCase();

        if (jobtitle.equals("qa")){
            System.out.println("Quality Analyst");

        } else if (jobtitle.equals("dev")) {
            System.out.println("developer");


        } else if (jobtitle.equals("ba")) {
            System.out.println("Business Analyst");


        } else if (jobtitle.equals("pm")) {
            System.out.println("Project Manager");


            switch (jobtitle){
                case "qa":
                    System.out.println("Quality Analyst");
                    break;

                case  "dev":
                    System.out.println("developer");
                break;

                case "ba":
                    System.out.println("Business Analyst");
                break;

                case "pm":
                    System.out.println("Project Manager");
                   break;
                default:
                    System.out.println("yanlis faormatta jobtitler bilgisi girdiniz");
                    break;
            }

        }

    }
}
