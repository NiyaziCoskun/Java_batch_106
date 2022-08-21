package Day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        elimizde  ürünlerin bulunduğu bir liste var listede ki
        istenen sıradakı urunu yenısı ıle değistirip
        eski ürünü, var olan eski urunler listesine ekleyelim

         */
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        List<String> eskiUrunler= new ArrayList<>();
        // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da eski urunler listesine ekleyelim
        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";
        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);
        yeniUrun="Kahve";
        silinecekUrun="Cay";
        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);
        yeniUrun="Findik";
        silinecekUrun="Cekirdek";
        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("urunler listesi : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);
    }
    }

