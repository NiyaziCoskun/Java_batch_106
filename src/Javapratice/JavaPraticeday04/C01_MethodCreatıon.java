package Javapratice.JavaPraticeday04;

public class C01_MethodCreatıon {
    public static void main(String[] args) {

        /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */

        birkereyazdir("aaaaaabbbbbbaaabbahfdjkghggfkkkkfj");
    }

    public static void birkereyazdir(String str) {
        String output = "";//string default "" oldugu ıcın isleme etkı etmesın dıye bu sekılde yaptık

        for (int i = 0; i < str.length(); i++) {
            if (!output.contains(str.substring(i, i + 1))) {//tekarasız karakterleri dondurecegımz ıcın sunucumuz str den aldıgımız herhangı bır karakteri içermesin
                output += str.substring(i, i + 1);//icermiyorsa o zaman sonuca eklesin

            }

        }
        System.out.println(output);
    }
}