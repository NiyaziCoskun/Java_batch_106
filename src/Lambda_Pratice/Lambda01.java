package Lambda_Pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda01 {

    static ArrayList<String> names=new ArrayList<>(Arrays.asList
            ("tulay","zekeriya","hasan","ismail","osman","fatih","ersin","mevlut"));
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,54,9,35,35,34));

    public static void aHarfleriSilenGerisiniYazdiran(ArrayList<String>isimler){
        //1.Yol
        System.out.println(isimler.stream().//akısa alındı
                map(t -> t.toLowerCase()).filter//hepsi kucuk harfe cevrildi
                        (t -> !t.contains("a")).collect//a harfi olamyanlar filtrelendi
                        (Collectors.toList()));//liste atandı



//2.Yol
        isimler.removeIf(t->t.contains("a")|| t.contains("A"));
        System.out.println(names);

    }
    public static void enBuyukSayi(List<Integer> sayilar){
        Optional<Integer>maxSayi=sayilar.stream().reduce(Math::max);
        /*
         reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
         */
    }
    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...
    public static void elemanlariTopla(List<Integer> sayilar){
        System.out.println("sayilar.stream().reduce(0,(a,b)->a+b) = " +
                sayilar.stream().reduce(0, (a, b) -> a + b));

        System.out.println("sayilar.stream().reduce(Integer::sum) = " + sayilar.stream().reduce(Integer::sum).get());
        //spesifik method daha hızlidir

    }
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.

    public static void elemanlariCarpimi(List<Integer>list){
        list.stream().reduce(1,(a,b)-> a+b);
    }





}
