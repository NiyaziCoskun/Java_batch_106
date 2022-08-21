package Day16_ForLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

        /*
           Soru 2)
            10 ile 30 arasindaki sayilari arasinda virgul kullanarak yazdirin
              */
               int bas=20;
               int son=35;

        for (int i = bas; i <=son ; i++) {
            System.out.print(i +",");


            if (i<son){
                System.out.print(i+ ",");

            }else {
                System.out.print(i);
            }

        }

    }
}
