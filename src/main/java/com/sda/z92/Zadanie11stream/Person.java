package com.sda.z92.Zadanie11stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean male;

    @Override
    public String toString() {
        return "Person{" +
                ", surname='" + surname + '\'' +
                '}';
    }
}
