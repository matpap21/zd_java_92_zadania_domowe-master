package com.sda.z92.Zadanie3;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student(100000, "Harry", "Potter");
        Student s2 = new Student(100100, "Albus", "Dumbledore");
        Student s3 = new Student(100200, "Gellert", "Grindewalt");
        Student s4 = new Student(100300, "Severus", "Snape");
        Student s5 = new Student(100400, "Lord", "Voldemort");

        //Stwórz drugiego maina z kopiąkodu. Zamiast HashMap przydeklaracji mapy podmień naTreeMap
        //dodajComparatorsortujący indeksymalejąco

        Map<Long, Student> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(s1.getindeks(), s1);
        map.put(s2.getindeks(), s2);
        map.put(s3.getindeks(), s3);
        map.put(s4.getindeks(), s4);
        map.put(s5.getindeks(), s5);


        //-sprawdź czy mapa zawiera studenta o indeksie 100200,
        System.out.println("czy mapa zawiera studenta o indeksie 100200?");
        if (map.containsKey(100200L)) {
            System.out.println("Mapa zawiera studenta o indeksie 100200");
        } else {
            System.out.println("Mapa nie zawiera studenta o indeksie 100200");
        }


        //wypisz studenta o indeksie 100400
        Student o = map.get(100400L); // otrzymam studenta z wartością 100400L, L na końcu bo rzutowanie na long'a
        System.out.println("Student o indeksie 100400 to " + o);

        System.out.println("Lista wszystkich studentów");
        for (Student element : map.values()
        ) {
            System.out.println(element.toString());
        }

        System.out.println("Lista indeksów:");
        for (Long indeks : map.keySet()) {
            System.out.println(indeks);
        }
    }
}