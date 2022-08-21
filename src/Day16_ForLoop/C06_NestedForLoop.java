package Day16_ForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /* bazen tek değisken sorunu çözmeye yetmez
        *
        * ***
        * *******
        * **********
        * 3 tane yıldız * yaz
         */
        for (int i = 1; i <=3 ; i++) {
            System.out.print("* ");
        }

        //yan yana 4 tane yıldız
        for (int i = 1; i <=4; i++) {
            System.out.print("* ");
        }
        System.out.print("");
        //bu tür durumlarad ic ice nested loop kulanırız
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.println("* ");
            }


        }
    }
}
