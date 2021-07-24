package com.sda.z92;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Umiesc elementy tablicy {10,12,10,3,4,12,300,12,40,55} w zbiorze (HashSet) oraz:
        //Konstuktor kopiujacy elementy listy do setu:
        // Set<Integer> liczby = new HashSet<>(Arrays.asList(1,2 ...));
        //a. Wypisz liczbe elementow na ekran (metoda size)
        //b. Wypisz wszystkie zbiory elementu na ekran (foreach)
        //c. usun elementy 10 i 12 (wykonaj ponownie podpunkty a i b)
        //d. zmien implementacje na TreeSet (zamien HashSet na TreeSet przy tworzeniu instancji kolekcji)


        List<Integer> list = new ArrayList<>(Arrays.asList(
                10, 12, 10, 3, 4, 12, 300, 12, 40, 55
        ));

        Set<Integer> zbioryliczb = new HashSet<>(list);
        int i = 0;

        // przerzucam elementy z listy do setu
        System.out.println("Lista: " + zbioryliczb);

        //a. Wypisz liczbe elementow na ekran (metoda size)

        System.out.println("Wypisz liczbe elementow na ekran (metoda size):" + zbioryliczb.size());

        Set<Integer> unikalneElementy = new TreeSet<>(zbioryliczb);

        //b. Wypisz wszystkie zbiory elementu na ekran (foreach)

        for (Integer integer : unikalneElementy) {
            System.out.println(integer);
        }
        unikalneElementy.remove(12);
        unikalneElementy.remove(10);

        System.out.println(unikalneElementy);

    }
}