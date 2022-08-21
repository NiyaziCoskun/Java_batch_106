package Day17_nestedforloop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen stringi asagıdakı gibi yazdiran bir
        program yazın
        input=deniz
        d
        de
        den
        deni
        deniz
         */
        String input="Deniz";
        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));  // ilk harf icin substring(0,1) olmali
            }
            System.out.println("");
            }

        }
    }

