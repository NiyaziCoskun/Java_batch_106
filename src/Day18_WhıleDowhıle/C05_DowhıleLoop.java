package Day18_WhıleDowhıle;

public class C05_DowhıleLoop {
    public static void main(String[] args) {
        /*
9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
 */
        int bas=9;
        int bitis=190;

        int temp=bas;

        // whıle loop ıle

        while (temp<bitis){

            if (temp%7==0){
                System.out.print(temp + " ");

            }
            temp++;
        }
        //do whıle ıle
        System.out.println("");
        temp=bas;

        do {
            if (temp%7==0){
                System.out.print(temp + " ");


            }
            temp++;
        }while (temp<bitis);



    }
}
