package javapratice.JavapratıceDay08;

public class C09_SurveMonkey {
    public static void main(String[] args) {

        /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.
        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        */
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;

        do {

            System.out.println("maymunlar gunde 4 muz yer:");
            numberOfBananas-=4;//toplam 4 azalir
            survivalDays++;//yasadıgı gun sayısı 1 artır
            if (numberOfBananas<4){//4 den az muz kalırsa
                monkeyAlive=false;//maymun hayatta değil
                System.out.println("bugun " + survivalDays + "gun muz kalmadı maymun oldu "  );


            }else
                System.out.println("bugun " + survivalDays + "gun maymun hayatta" );


        }while (monkeyAlive);
        System.out.println("toplam yasadıgı gun sayisi : " +(survivalDays-1));


    }
}
