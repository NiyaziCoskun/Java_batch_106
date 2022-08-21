package Day28_StatikBlock;

public class C02_PassByValue {

    public static void main(String[] args) {

        double satisfiyati=100;
        System.out.println(inidirimliFiyat(satisfiyati));//90
        System.out.println(satisfiyati);//100
        System.out.println(inidirimliFiyat(satisfiyati));//90
        /*
        iki farkli method da satis fiyatı ısmınde varıable olabılır
        java buna itiraz etmz çünkü scopp ları farklıdır

         */


    }
    public static double inidirimliFiyat(double orjinalfiyat){
        //methodumuz %10indirim yapip
        //yeni fiyat maın methoda döndürsün

        double satisfiyati=orjinalfiyat*0.9;

        return satisfiyati;
    }
}
