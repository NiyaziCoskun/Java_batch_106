package Day12_stringmanıpulatıon;

public class C05_substring {
    public static void main(String[] args) {


        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        String input= "selim";
        String tersInput= input.substring(4)+
                input.substring(3,4)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);

    }
}
