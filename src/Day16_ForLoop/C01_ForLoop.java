package Day16_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen bir pozitif tam sayinin tam bölenlerine yazdirin


        int input=200;

        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                System.out.print(i+" ");
            }

        }
    }
}
