package com.sda.z92.Zadanie5;

//Stwórz nowy program, zrealizuj polecenia:
//stwórz enum Płeć (KOBIETA, MEZCZYZNA)
//stwórz klasę Obywatel (imie, nazwisko, plec)
//stwórz w main scanner i każ użytkownikowi wpisać kolejno:
//swoje imie
//swoje nazwisko
//swoją płeć
//wykorzystaj zebrane informacje do stworzenia obiektu obywatel
//po stworzeniu wypisz obiekt na ekran (nie chcemy żeby wypisał się hashcode, co w tym celu należy zaimplementować?)

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide Your name ");
        String name = input.next();

        System.out.println("Please provide Your surname ");
        String surname = input.next();


        Gender gender = null;

        do {
            try {
                System.out.println("Provide Your gender");
                System.out.println("You can choose:");
                System.out.println(Arrays.asList(Gender.values()));
                for (Gender destination : Gender.values()
                ) {
                    System.out.println("gender " + destination);
                }
                gender = Gender.valueOf(input.next().toUpperCase());

            } catch (Exception e) {
                System.out.println("The choice is inconsistent");
            }
        } while (gender == null);

        Citizen person = new Citizen(name, surname, gender);
        System.out.println(person.Data());

    }
}
