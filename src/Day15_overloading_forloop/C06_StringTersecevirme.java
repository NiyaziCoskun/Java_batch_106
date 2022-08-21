package Day15_overloading_forloop;

public class C06_StringTersecevirme {
    public static void main(String[] args) {

        //input olarak verilen string terse cevirip yazdiran bir method olusturun

        String input="Java gun gectikce guzellesiyor";
        terstenyazdir(input);
    }

    public static void terstenyazdir(String input) {

        String tersinput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {
            tersinput+=input.substring(i,i+1);



        }
        System.out.println(tersinput);
    }
}
