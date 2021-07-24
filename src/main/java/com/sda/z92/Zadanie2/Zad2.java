package com.sda.z92.Zadanie2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
// -dodaj do listy 10 liczb losowych
// -oblicz sumę elementów na liście (wypisz ją)
// -oblicz średnią elementów na liście (wypisz ją)
// -stwórz kopię listy i ją posortuj:(Collections.sort( listaDoPosortowania)
// -sortuje listę)
// (przykład użycia Collections.sort(lista):ArrayList<Integer> liczby = new ArrayList<>();
// liczby.add(5);liczby.add(10);
// liczby.add(15);Collections.sort(liczby);


// -podaj medianę elementówna liście posortowanej (wypisz ją)-znajdź największy i najmniejszy element na liście która nie była sortowana.
// Zrób to pętlą for-po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for-po znalezieniu elementów (największy i najmniejszy)
// znajdź index posługując się metodą indexofSprawdź działanie aplikacji.Stwórz oddzielnego maina, a w nim kolejną listę integerów.


public class Zad2 {
    public static void main(String[] args) {

        // Deklaracja listy
        List<Integer> list = new ArrayList<>();
        // Deklaracja random'a
        Random random = new Random();
        // pętla for i - 10 iteracji
        for (int i = 0; i < 10; i++) {
            int wartosc = random.nextInt(500);
            list.add(wartosc);
        }
        // wewnątrz pętli losujemy wartości / liczby i dodajemy do listy

        // wypisanie całej listy
        System.out.println("Lista, pierwsze wypisanie" + list);
        // ## Obliczanie sumy
        // deklaracja zmiennej suma

        int suma = 0;
        // pętla ma wykonać się tyle iteracji ile jest elementów
        for (int i = 0; i < list.size(); i++) {
            // sumujemy elementy w pętli
            int wartosc = list.get(i);
            suma += wartosc;
        }

        // poza pętlą wypisujemy sumę i średnią
        System.out.println("Lista, drugie wypisanie: " + list);
        System.out.println("Suma: " + suma);
        double average = suma / (double) list.size();

        System.out.println("Srednia: " + average);

        // ## Stworzenie kopii
        // należy pamiętać że kolekcje posiadają konstruktor kopiujący
        // List<Integer> lista_orginalna = new ArrayList<>();
        // ... dodajemy jakieś elementy.. coś się dzieje
        // List<Integer> lista_kopia = new ArrayList<>(lista_orginalna);

        List<Integer> ListCopy = new ArrayList<>();

        // sortowanie i wypisanie
        // lista.kopia.sort();
        // Collections.sort(lista_kopia);

        Collections.sort(ListCopy);


// ############# Część druga
        // mediana to środkowy element (jeśli taki jest)
        // mediana to średnia dwóch środkowych elementów (jeśli ilość jest parzysta)
        // lista.size() - rozmiar
        // lista.size()%2 - parzystość
        //
        // Przypadek gdy ilość elementów jest parzysta
        // lista.size() = 10
        // 0 1 2 3 (4 5) 6 7 8 9
        double mediana;
        if (ListCopy.size() % 2 == 0) {
            // (lista.size() / 2 - 1)
            // lista.get( (lista.size() / 2) - 1 )

            int element1 = ListCopy.get((ListCopy.size() / 2) - 1);
            int element2 = ListCopy.get((ListCopy.size() / 2));
            mediana = (element1 + element2) / 2.0;
        } else {
            // Przypadek gdy ilość elementów jest nieparzysta
            // 0 1 2 3 4 5 6 7 8 9
            // lista.get(?)
            // (lista.size() / 2) = 5 index = 6 element
            // lista.get( (lista.size() / 2) )

            mediana = ListCopy.get(ListCopy.size() / 2);
        }
        System.out.println("Mediana: " + mediana);

        // Pamiętajcie w tym miejscu pracować na liście pierwszej (orginalnej)
        // zadeklarowanie zmiennej minimum / maximum
        int min = list.get(0);
        int max = list.get(0);

        // pętla która szuka min/max
        for (int i = 1; i < list.size(); i++) {
            // jeśli trafiliśmy na liczbę mniejszą to zapisujemy nowe minimum
            if (min > list.get(i)) {
                min = list.get(i);
            }

            // jeśli trafiliśmy na liczbę większą to zapisujemy nowe maksimum
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Max: " + max + " Min: " + min);

        //     - po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for
        int minIndex = 0;
        int maxIndex = 0;

        // pętla która szuka indeksów min/max
        for (int i = 1; i < list.size(); i++) {
            // jeśli trafiliśmy na liczbę mniejszą to zapisujemy nowe minimum
            if (min == list.get(i)) {
                minIndex = i;
            }

            // jeśli trafiliśmy na liczbę większą to zapisujemy nowe maksimum
            if (max == list.get(i)) {
                maxIndex = i;
            }
        }
        System.out.println("Max index: " + maxIndex + " Min index: " + minIndex);
        // - po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
        System.out.println("Max index: " + list.indexOf(max) + " Min index: " + list.indexOf(min));
    }
}