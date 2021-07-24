package com.sda.z92.Zadanie4;

//Stwórz maina, a w nim kolejną listę String'ów. Wykonaj zadania:
//dodaj do listy elementy 10030, 3004, 4000,
//12355, 12222, 67888, 111200, 225355, 2222, 1111, 3546, 138751, 235912 (jako stringi) (dodaj je posługując się metodą Arrays.asList())
//
//Przykład użycia Arrays.asList():
//ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
//Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać na liście String’ów.
//
//określ indeks elementu 138751 posługując się metodą indexOf
//sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
//sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
//usuń z listy obiekt 67888 oraz 67889 (metoda remove)
//wykonaj ponownie polecenia z punktu 2, 3, 4.
//iteruj całą listę (pętla forEach), wypisz elementy na ekran w oddzielnych liniach
//iteruj całą listę (pętla forEach), wypisz elementy na ekran w jednej linii
//
//Sprawdź działanie aplikacji.
//*Podziel aplikację na metody.
//**Przetestuj aplikację


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {

        // deklaracja listy

        List<String> list = new ArrayList<>(Arrays.asList(
                "10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912"
        ));

        // dodanie elementów do listy


        //System.out.println(list);

        //sprawdzenie metodą indexof
        // -- wypisanie wyniku sprawdzenia na ekran

        System.out.println("Indeks elementu 138751 w tablicy to: " + list.indexOf("138751"));

        // sprawdzenie metodą contains
//     -- wypisanie wyniku

        if (list.contains("67888")) {
            System.out.println("Wystepuje taka wartość - 67888 w tablicy: ");
        }else {
            System.out.println("Nie Wystepuje taka wartość - 67888 w tablicy: ");
        }

        if (list.contains("67888")) {
            System.out.println("Wystepuje taka wartość - 67888 w tablicy: ");
        }else {
            System.out.println("Nie Wystepuje taka wartość - 67888 w tablicy: ");
        }

        //usuń z listy obiekt 67888 oraz 67889 (metoda remove)
        list.remove("67888");
        list.remove("67889");

        //wykonaj ponownie polecenia z punktu 3, 4, 5

        System.out.println("Indeks elementu 138751 w tablicy to: " + list.indexOf("138751"));

        if (list.contains("67888")) {
                System.out.println("Wystepuje taka wartość - 67888 w tablicy: ");
        }else {
                System.out.println("Nie Wystepuje taka wartość - 67888 w tablicy: ");
        }

        if (list.contains("67888")) {
            System.out.println("Wystepuje taka wartość - 67888 w tablicy: ");
        }else {
            System.out.println("Nie Wystepuje taka wartość - 67888 w tablicy: ");
        }

        list.remove("67888");
        list.remove("67889");

        //iteruj całą listę (pętla forEach), wypisz elementy na ekran w oddzielnych liniach

        for (String element: list){
            System.out.println(element + " ");
        }

        //iteruj całą listę (pętla forEach), wypisz elementy na ekran w jednej linii
        for (String element: list){
            System.out.print(element + " ");
        }
    }
}
