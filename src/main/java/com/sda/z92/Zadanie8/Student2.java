package com.sda.z92.Zadanie8;

import com.sda.z92.Zadanie3.Student;
import com.sda.z92.Zadanie5.Gender;

import java.util.Objects;

public class Student2 {
    private long indeks;
    private String imie;
    private String nazwisko;
    private Gender Gender;


    public Student2(long indeks, String imie, String nazwisko, Gender gender) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.Gender = gender;
    }

    public long getindeks() { return indeks;}
    public void setIndeks(long indeks) {
        this.indeks = indeks;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public com.sda.z92.Zadanie5.Gender getGender() {
        return Gender;
    }


    @Override
    public String toString() {
        return "Student{" +
                "nrindeksu='" + indeks + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", gender='" + Gender + '\'' +
                '}';
    }
}