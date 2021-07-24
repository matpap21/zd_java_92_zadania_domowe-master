package com.sda.z92.Zadanie7;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Stwórz Set obiektów typu ParaLiczb

        Pairs para1 = new Pairs(1,2);
        Pairs para2 = new Pairs(2,1);
        Pairs para3 = new Pairs(1,1);
        Pairs para4 = new Pairs(1,2);

        Set<Pairs<Integer, Integer>> set = new HashSet<>();
        set.add(para1);
        set.add(para2);
        set.add(para3);
        set.add(para4);


        //Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?
        System.out.println("Wyświetl wszystkie elementy zbioru na ekran ");
        System.out.println(set);

        //Jak wpłynąć na program żeby usunął duplikat (tj. dwa razy występuje ParaLiczb z wartościami (1,2)
        System.out.println("Wydruk bez duplikatów ");
        for(Pairs<Integer, Integer> data : set) {
            System.out.println(data.toString());
        }
    }
}
