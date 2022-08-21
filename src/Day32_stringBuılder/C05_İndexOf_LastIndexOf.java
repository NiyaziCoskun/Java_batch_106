package Day32_stringBuılder;

public class C05_İndexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("pay attention please");

        System.out.println(sb.indexOf("pay"));//0
        System.out.println(sb);//pay attention please

        System.out.println(sb.indexOf("e"));//7
        System.out.println(sb.indexOf("e",10));//16

        System.out.println(sb.lastIndexOf("e"));//19

        System.out.println(sb.lastIndexOf("e",10));//7



    }
}
