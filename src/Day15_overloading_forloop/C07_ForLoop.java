package Day15_overloading_forloop;

import Day14_MethodCreation.C01_MethodCreation;

public class C07_ForLoop {
    private static C01_MethodCreation C06_StringTerseCevirme;

    public static void main(String[] args) {

        C06_StringTerseCevirme.terstenYazdir("Zekeriya");
        // 100'den 1'e kadar(sinirlar dahil) 8 ile bolunebilen sayilari yazdirin
        for (int i = 100; i >=1 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }
        }
    }
}
    

