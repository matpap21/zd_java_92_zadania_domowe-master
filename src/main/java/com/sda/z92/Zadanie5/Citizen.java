package com.sda.z92.Zadanie5;

public class Citizen {
    private String name;
    private String surname;
    private Gender gender;


    public Citizen(String name, String surname, Gender gender){
        this.name = name;
        this.surname =surname;
        this.gender =gender;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String Data() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender +
                '}';
    }
}
