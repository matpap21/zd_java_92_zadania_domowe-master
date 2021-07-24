package com.sda.z92.Zadanie3;

import java.util.Objects;

public class Student {
    private long indeks;
    private String imie;
    private String nazwisko;

    public Student(long indeks) {
        this.indeks = indeks;
    }

    public Student(long indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
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
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Obywatel obywatel = (Obywatel) o;
//        return Objects.equals(pesel, obywatel.pesel);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(pesel);
//    }

    public void przedstawSie(){
        System.out.println("Siema, jestem jarek!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(indeks, student.indeks) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indeks, nazwisko);
    }

    @Override
    public String toString() {
        return "Student{" +
                "pesel='" + indeks + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

}
