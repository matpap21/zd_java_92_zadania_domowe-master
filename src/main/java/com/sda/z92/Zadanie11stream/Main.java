package com.sda.z92.Zadanie11stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {


Person person1 = new Person("Jacek","Kowalski",18,true);
Person person2 = new Person("Jacek","Górski",15,true);
Person person3 = new Person("Andżelika","Dżoli",25,false);
Person person4 = new Person("Wanda","Ibanda",12,false);
Person person5 = new Person("Marek","Marecki",17,true);
Person person6 = new Person("Johny","Brawo",25,true);
Person person7 = new Person("Stary","Pan",80,true);
Person person8 = new Person("Newbie","Noob",12,true);
Person person9 = new Person("Newbies","Sister",19,false);
List<Person> people = new ArrayList<>(Arrays.asList(person1,person2, person3,person4, person5, person6, person7, person8, person9));

        //a.uzyskaj listę mężczyzn
        System.out.println("uzyskaj listę mężczyzn: ");
        List<Person> tylkomezczyzni = people
                .stream()
                .filter(mezczyzni -> mezczyzni.isMale() == true)
                .collect(Collectors.toList());
        System.out.println("tylkomezczyzni: " + tylkomezczyzni);

        // b.uzyskaj listę dorosłych kobiet(filter)
        System.out.println("uzyskaj listę dorosłych kobiet: ");
        List<Person> tylkokobiety = people
                .stream()
                .filter(kobiety -> kobiety.isMale() == false)
                .filter(kobiety -> kobiety.getAge()>=18)
                .collect(Collectors.toList());
        System.out.println("tylkokobietydorosle: " + tylkokobiety);


        // c.uzyskaj Optional<Person> z dorosłym Jackiemfind
        System.out.println("optional_dorosly_Jacek z opcją FIRST: ");
        Optional<Person> optional_dorosly_Jacek_first = people.stream()
//                .parallel() // równolegle
                .filter(JAcek -> JAcek.getName().equals("Jacek"))
                .filter(JAcek -> JAcek.getAge()>=18)
                .findFirst();
        System.out.println(optional_dorosly_Jacek_first);

        System.out.println("optional_dorosly_Jacek z opcją ANY: ");
        Optional<Person> optional_dorosly_Jacek_any = people.stream()
//                .parallel() // równolegle
                .filter(JAcek -> JAcek.getName().equals("Jacek"))
                .filter(JAcek -> JAcek.getAge()>=18)
                .findAny();

        System.out.println(optional_dorosly_Jacek_any);

        // d.uzyskaj listę wszystkich nazwisk osób, które są wprzedziale wiekowym:15-19(filter)
        List<String> nazwiska_osób_które_są_w_przedziale_wieku_15_do_19 = people
                .stream()
                .filter(wiek_osob -> wiek_osob.getAge()>=15 && wiek_osob.getAge()<=19 )
                .map(person -> person.getSurname())
                .collect(Collectors.toList());
        System.out.println("nazwiska_osób_które_są_w_przedziale_wieku_15_do_19");
        System.out.println(nazwiska_osób_które_są_w_przedziale_wieku_15_do_19.toString());


        //e.* uzyskaj sumę wieku wszystkich osób(sum)
        System.out.println("uzyskaj sumę wieku wszystkich osób(sum)");
        double sum = people.stream()
                .mapToDouble(suma_wieku -> suma_wieku.getAge())
                .sum();

        System.out.println(sum);

        // f.* uzyskaj średnią wieku wszystkich mężczyzn(average)
        System.out.println("uzyskaj średnią wieku wszystkich mężczyzn: ");
        OptionalDouble average_wszystkich_mężczyzn = people.stream()
                .filter(tylkomezczyzni2 -> tylkomezczyzni2.isMale() == true)
                .mapToDouble(srednia_wieku -> srednia_wieku.getAge())
                .average();

        System.out.println(average_wszystkich_mężczyzn);

        // g.** znajdź najstarszą osobę w liście(findFirst)

        System.out.println("znajdź najstarszą osobę w liście(findFirst)");
        Person najstarsza_osoba =  people
                .stream()
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("nasjtarsza_osoba: " + najstarsza_osoba.getName() + " " + najstarsza_osoba.getSurname());


    }
}
