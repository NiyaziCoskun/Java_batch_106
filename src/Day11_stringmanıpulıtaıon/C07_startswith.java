package Day11_stringmanıpulıtaıon;

public class C07_startswith {
    public static void main(String[] args) {

        String input="Java gun gectikce guzellesıyor";
        System.out.println(input.startsWith("J"));//true

        System.out.println(input.startsWith(""));//

        System.out.println(input.startsWith("gun", 5));//true
    }
}
