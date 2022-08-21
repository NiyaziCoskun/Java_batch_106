package Day11_stringmanıpulıtaıon;

public class C05_endswith {
    public static void main(String[] args) {

        String str="ah be java";
        System.out.println(str.endsWith("java"));//true
        System.out.println(str.endsWith("be java"));//true
        System.out.println(str.endsWith("ah be java"));

        System.out.println(str.endsWith(""));//
    }
}
