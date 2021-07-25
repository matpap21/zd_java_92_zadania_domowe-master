package com.sda.Zadanie15;

import com.sda.z92.Zadanie11stream.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Programmer {

    private Person person;
    private List<String>  languages;

    }

