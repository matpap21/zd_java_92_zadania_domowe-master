package com.sda.z92.Zadanie7;


import java.util.*;

// Stwórz main, w nim dodaj instrukcje:
//Stwórz klasę ParaLiczb która powinna posiadać pola typu int o nazwie liczbaA, liczbaB,  =>
//
//ParaLiczb (int liczbaA,int liczbaB)
//
//
//Stwórz Set obiektów typu ParaLiczb
//Utwórz kilka instancji obiektu ParaLiczb z wartościami:
//(1,2)
//(2,1)
//(1,1)
//(1,2)
//Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?
//Jak wpłynąć na program żeby usunął duplikat (tj. dwa razy występuje ParaLiczb z wartościami (1,2)
public class Zadanie7 {
    public static void main(String[] args) {
        ParaLiczb para1 = new ParaLiczb(1, 2);
        ParaLiczb para2 = new ParaLiczb(2, 1);
        ParaLiczb para3 = new ParaLiczb(1, 1);
        ParaLiczb para4 = new ParaLiczb(1, 2);


        //Stwórz Set obiektów typu ParaLiczb
        Set<ParaLiczb> set = new HashSet<>();
        set.add(para1);
        set.add(para2);
        set.add(para3);
        set.add(para4);




        ///Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?
        System.out.println("Wyświetlenie wszystkich zbiorów par: ");
        for (ParaLiczb element : set) {
            System.out.println(element.toString());
        }
        //Jak wpłynąć na program żeby usunął duplikat (tj. dwa razy występuje ParaLiczb z wartościami (1,2)
        // w klasie combinacja klawiszy alt + insert + wybrac equals + hashcode


        System.out.println("Wydruk set'a");
        System.out.println(set);
    }
}
