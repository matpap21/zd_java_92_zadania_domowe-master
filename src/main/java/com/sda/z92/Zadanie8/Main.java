package com.sda.z92.Zadanie8;

import com.sda.z92.Zadanie5.Gender;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        //W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
        Collection<Student2> students = new ArrayList<>();

        //Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
        Student2 student1 = new Student2(100000, "Harry", "Potter", Gender.MAN);
        Student2 student2 = new Student2(100100, "Albus", "Dumbledore", Gender.MAN);
        Student2 student3 = new Student2(100200, "Gellert", "Grindewalt", Gender.MAN);
        Student2 student4 = new Student2(100900, "Nymphadora ", "Tonks", Gender.WOMAN);
        Student2 student5 = new Student2(100600, "Minerva", "McGonagall", Gender.WOMAN);
        Student2 student6 = new Student2(100002, "Hermione ", "Granger", Gender.WOMAN);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        ////a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
        System.out.println("wypisanie elementów listy ");
        System.out.println(students.toString());

        //b. Spróbuj wypisać elementy stosując pętlę foreach
        System.out.println("wypisanie elementów list pętlą foreach ");
        for (Student2 student : students
        ) {
            System.out.println(student.toString());
        }

        System.out.println("Lista Studentek: ");
        //Wypisz tylko kobiety
        for (Student2 student : students
        ) {
            if (student.getGender() == Gender.WOMAN)
                System.out.println(student.toString()); // PYTANIE JAK ZROBIC BY USUNAC gender z wypisywania ? stworzyc osobno metode na to ?
        }

        System.out.println("Lista Studentów: ");
        //Wypisz tylko mężczyzn
        for (Student2 student : students
        ) {
            if (student.getGender() == Gender.MAN)
                System.out.println(student.toString());
        }
//        //Wypisz tylko indeksy osób
        System.out.println("Indeksy Studentów i Studentek Hogwart'u: ");
        for (Student2 student : students) {
            System.out.println(student.getindeks());
        }
    }
}
