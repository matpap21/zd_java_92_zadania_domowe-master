package com.sda.z92.Zadanie14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

// Napisz aplikację w której:
// - wczytaj od użytkownika jedną linię tekstu
// - po wczytaniu linii otwórz plik o nazwie 'output_2.txt'
// - zapisz do pliku linię pobraną od użytkownika
// - zamknij plik
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj tekst ");
        String sciezkaRelatywna = "output_2.txt";

        File sciezka = new File(sciezkaRelatywna);
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(sciezka))) {
            String linia ;
            do {
                // czytam linie
                linia = input.nextLine();

                if ((linia.equalsIgnoreCase("quit"))){
                    break;
                }
                // zapis do pliku
                writer.println(linia);

                // wyczyść bufor, wymuś zapis do pliku
                writer.flush();

                // sprawdzenie czy linia byla quit.
            }while (!linia.equalsIgnoreCase("quit"));
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
        }
    }
}
