package Day17_nestedforloop;

public class C01_forloop {
    public static void main(String[] args) {

        //verieln string deki kullanılan harfleri tekrarsız olarak yazdiran
        //kelimede kullanılan farkli harf sayisini veren bir method ypın

        String input ="Java her zaman guzel";

        tekrarsizyap(input);
    }

    public static void tekrarsizyap(String input) {
        String benzersizinput="";
        String islenecekkelime=input.replaceAll("\\W","");//javaherzamanguzel
        System.out.print(islenecekkelime.substring(0,1));//j
        benzersizinput+=islenecekkelime.substring(0,1);//j

        for (int i = 1; i <islenecekkelime.length() ; i++) {

            if (!benzersizinput.contains(islenecekkelime.substring(i,i+1))){
                System.out.print(", "+ islenecekkelime.substring(i,i+1));
                benzersizinput+=islenecekkelime.substring(i,i+1);

            }
        }

        System.out.print("");
        System.out.print("inpt: " + input);
        System.out.print("benzersiz input : " + benzersizinput);

    }
}
