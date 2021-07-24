package com.sda.z92.Zadanie3;
//Utwórz klasę Student o polach (long) numerIndeksu,imie,nazwisko oraz:
// -utwórz kilku studentów i dodaj ich do mapy (kluczemjestindeks,
// -sprawdź czy mapa zawiera studenta o indeksie 100200,
// -wypisz studenta o indeksie 100400
// -wypisz listę studentów
// -wypisz listę indeksów

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // -utwórz kilku studentów i dodaj ich do mapy (kluczemjestindeks,
        Student s1 = new Student(100000, "Harry","Potter");
        Student s2 = new Student(100100, "Albus", "Dumbledore");
        Student s3 = new Student(100200, "Gellert", "Grindewalt");
        Student s4 = new Student(100300, "Severus", "Snape");
        Student s5 = new Student(100400, "Lord", "Voldemort");
        Map<Long, Student> map = new HashMap<>();
        map.put(s1.getindeks(), s1);
        map.put(s2.getindeks(), s2);
        map.put(s3.getindeks(), s3);
        map.put(s4.getindeks(), s4);
        map.put(s5.getindeks(), s5);



        //-sprawdź czy mapa zawiera studenta o indeksie 100200,

        if (map.containsKey(100200L)){
            System.out.println("Mapa zawiera studenta o indeksie 100200 ");
        }
        else
        {
            System.out.println("Mapa nie zawiera studenta o indeksie 100200");
        }


        //wypisz studenta o indeksie 100400
        Student o = map.get(100400L); // otrzymam studenta z wartością 100400L, L na końcu bo rzutowanie na long'a
        System.out.println("Student o indeksie 100400 to " + o);


        System.out.println("Lista wszystkich studentów");
        for (Student Student_z_mapy : map.values()
        ) {
            System.out.println(Student_z_mapy.toString());
        }

        System.out.println("Lista indeksów:");
        for (Long indeks : map.keySet()) {
            System.out.println(indeks);
        }
    }
}