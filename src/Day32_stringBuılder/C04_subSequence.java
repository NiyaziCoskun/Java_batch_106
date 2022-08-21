package Day32_stringBuılder;

public class C04_subSequence {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("kayra");

        sb.substring(0,3);
        //bu method strıngdödürdüğü için strınbuılderın eskı halını değiştiremez

        System.out.println(sb);//kayra

        sb.subSequence(0,3);
        System.out.println(sb);//kayra





    }
}
