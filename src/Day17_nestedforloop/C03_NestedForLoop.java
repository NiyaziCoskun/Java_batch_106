package Day17_nestedforloop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        veilen yükseklik ve boy değerine göre * lardan oluşan
        bir dikdörtgen oluşturun  yükeklik;3 boy; 4
        * * * *
        * * * *
        * * * *

         */

        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");


            }
            System.out.println("");

        }
    }
}
