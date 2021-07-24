package com.sda.z92;

import java.util.Objects;

public class Zbiory {
    private int liczba;


    public Zbiory(int liczba) {
        this.liczba = liczba;
    }


    public int getliczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zbiory obywatel = (Zbiory) o;
        return Objects.equals(liczba, obywatel.liczba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liczba);
    }

    @Override
    public String toString() {
        return "Liczby w zbiorze to {" +
                "liczby='" + liczba + '\'' +
                '}';
    }
}
