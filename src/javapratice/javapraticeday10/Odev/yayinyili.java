package javapratice.javapraticeday10.Odev;

public class yayinyili {

    String kitapadi="belli degil";
    String yazari="bilinmiyor";
    int yayinyili;

    public yayinyili(String kitapadi, String yazari, int yayinyili) {
        this.kitapadi = kitapadi;
        this.yazari = yazari;
        this.yayinyili = yayinyili;
    }

    @Override
    public String toString() {
        return "yayinyili{" +
                "\n kitapadi= " + kitapadi +
                "\n yazari= "  + yazari +
                "\nyayinyili=" + yayinyili +
                '}';
    }

    public yayinyili() {
    }
}
