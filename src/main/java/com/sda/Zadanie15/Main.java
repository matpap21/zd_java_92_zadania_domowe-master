package com.sda.Zadanie15;

import com.sda.z92.Zadanie11stream.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        //Stwórz klasę Programmer, która ma klasę Person jakopole.
        // Poza tym, posiada listęjęzyków, którymi się posługuje.
        // Mogą być one reprezentowaneprzez klasę String

        Person person1 = new Person("Jacek", "Kowalski", 18, true);
        Person person2 = new Person("Jacek", "Górski", 15, true);
        Person person3 = new Person("Andżelika", "Dżoli", 25, false);
        Person person4 = new Person("Wanda", "Ibanda", 12, false);
        Person person5 = new Person("Marek", "Marecki", 17, true);
        Person person6 = new Person("Johny", "Brawo", 25, true);
        Person person7 = new Person("Stary", "Pan", 80, true);
        Person person8 = new Person("Newbie", "Noob", 12, true);
        Person person9 = new Person("Newbies", "Sister", 19, false);
        List<String> languages1 = Arrays.asList("Java;Cobol;Cpp;Lisp".split(";"));
        List<String> languages2 = Arrays.asList("Java;Lisp".split(";"));
        List<String> languages3 = Arrays.asList("Java;Cobol;Cpp;Lisp;C#".split(";"));
        List<String> languages4 = Arrays.asList("C#;C;Cpp".split(";"));
        List<String> languages5 = Arrays.asList("Java;Assembler;Scala;Cobol".split(";"));
        List<String> languages6 = Arrays.asList("Java;Scala".split(";"));
        List<String> languages7 = Arrays.asList("C#;C".split(";"));
        List<String> languages8 = Collections.emptyList();
        List<String> languages9 = Arrays.asList("Java");
        Programmer programmer1 = new Programmer(person1, languages1);
        Programmer programmer2 = new Programmer(person2, languages2);
        Programmer programmer3 = new Programmer(person3, languages3);
        Programmer programmer4 = new Programmer(person4, languages4);
        Programmer programmer5 = new Programmer(person5, languages5);
        Programmer programmer6 = new Programmer(person6, languages6);
        Programmer programmer7 = new Programmer(person7, languages7);
        Programmer programmer8 = new Programmer(person8, languages8);
        Programmer programmer9 = new Programmer(person9, languages9);
        List<Programmer> programmers = Arrays.asList(programmer1, programmer2, programmer3, programmer4, programmer5, programmer6, programmer7, programmer8, programmer9);
        System.out.println(programmers);

        //uzyskaj listę programistów, którzy są mężczyznami
        //Mając listę programistów i korzystając ze streamów:
        //a. uzyskaj listę programistów, którzy są mężczyznami
        List<Programmer> listamezczyzn = programmers
                .stream()
                .filter(programmer -> programmer.getPerson().isMale())
                .collect(Collectors.toList());

        System.out.println("uzyskaj listę programistów, którzy są mężczyznami " + listamezczyzn);

        //b. uzyskaj listę niepełnoletnich programistów (obydwóch płci), którzy piszą w Cobolu
        System.out.println("uzyskaj listę niepełnoletnich programistów (obydwóch płci), którzy piszą w Cobolu");
        List<Programmer> niepełnoletni_programiści = programmers
                .stream()
                .filter(programmer -> programmer.getPerson().getAge() < 18)
                .filter(programmer -> programmer.getLanguages().contains("Cobol"))
                .collect(Collectors.toList());

        System.out.println(niepełnoletni_programiści);

        //c. uzyskaj listę programistów, którzy znają więcej, niż jeden język programowania
        System.out.println("uzyskaj listę programistów, którzy znają więcej, niż jeden język programowania");
        List<Programmer> Proprogramiści = programmers
                .stream()
                .filter(programmer -> programmer.getLanguages().size() >1)
                //.filter(programmer -> programmer.getPerson().getName() // bez tego
                .collect(Collectors.toList());

        System.out.println(Proprogramiści);

        //d. uzyskaj listę programistek, które piszą w Javie i Cpp
        System.out.println("uzyskaj listę programistek, które piszą w Javie i Cpp");
        List<Programmer> programistki = programmers
                .stream()
                .filter(programmer -> programmer.getPerson().isMale() == false)
                //.filter(programmer -> programmer.getLanguages().contains("Java"))
                //.filter(programmer -> programmer.getLanguages().contains("Cpp"))
                .filter(programmer -> programmer.getLanguages().containsAll(Arrays.asList("Java", "Cpp")))
                .collect(Collectors.toList());

        System.out.println(programistki);

        //e. uzyskaj listę męskich imion
        System.out.println("uzyskaj listę męskich imion: ");
            List<String> lista_meskich_imion = programmers
                    .stream()
                    .filter(programmer -> programmer.getPerson().isMale() == true)
                    .map((Programmer programmer) -> programmer.getPerson().getName())
                    .collect(Collectors.toList());

        System.out.println(lista_meskich_imion);

        //f. uzyskaj set wszystkich języków opanowanych przez programistów
        Set<String> wszystkie_jezyki = programmers
                .stream()
                .flatMap(programmer -> programmer.getLanguages().stream()) // List<List<String>> // zamiast tego:
                .collect(Collectors.toSet());                              // List<String>

        System.out.println(wszystkie_jezyki);

        //g. uzyskaj listę nazwisk programistów, którzy znają więcej, niż dwa języki
        System.out.println("uzyskaj listę nazwisk programistów, którzy znają więcej, niż dwa języki: ");
            List<String> lnpkzwn2j = programmers
                    .stream()
                    .filter(programmer -> programmer.getLanguages().size() >2)
                    .map(programmer -> programmer.getPerson().getSurname())
                    .collect(Collectors.toList());

        System.out.println(lnpkzwn2j);

        //h. * sprawdź, czy istnieje chociaż jedna osoba, która nie zna żadnego języka
        System.out.println("sprawdź, czy istnieje chociaż jedna osoba, która nie zna żadnego języka");
        boolean  onzj = programmers
                .stream()
                //.filter(programmer -> programmer.getLanguages().size() <1)
                //.map(programmer -> programmer.getPerson().getSurname())
                //.collect(Collectors.toList());
                .anyMatch(programmer -> programmer.getLanguages().isEmpty());

        System.out.println(onzj);

        //i. * uzyskaj ilość wszystkich języków opanowanych przez programistki
        System.out.println("uzyskaj ilość wszystkich języków opanowanych przez programistki: ");
          //  List<Programmer> iwjopp = programmers
          //          .stream()
          //          .filter(programmer -> programmer.getPerson().isMale() == false)
          //          .filter(programmer -> programmer.getLanguages().isEmpty() ==false)
          //          .collect(Collectors.toList());

        long iwjopp = programmers
                .stream()
                .filter(programmer -> programmer.getPerson().isMale() == false)
                .flatMap(programmer -> programmer.getLanguages().stream())
                .distinct()
                .count();

        System.out.println(iwjopp);

        //j. **Używając streamów znajdź długość najdłuższej linii w wybranym przez ciebie pliku.
        // ja jako wybrany plik wybieram ten który aktualnie implementuje:

        String plik = "src/main/java/com/sda/Zadanie15/Main.java";


        //C:\Users\Mateusz\Downloads\Kurs Java\zd_java_92_zadania_domowe-master\src\main\java\com\sda\Zadanie15\Main.java

        try(BufferedReader reader = new BufferedReader(new FileReader(plik))){
            Optional<String> najdluzszaLinia = reader.lines()
                    .max(Comparator.comparing(String::length));
            if(najdluzszaLinia.isPresent()){
                System.out.println(najdluzszaLinia.get());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
