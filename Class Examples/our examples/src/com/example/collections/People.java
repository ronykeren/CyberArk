package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class People {

    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person("zzz",30));
        people.add(new Person("aaa",20));
        people.add(new Person("ccc",60));
        people.add(new Person("nnn",80));
        people.add(new Person("aaa",20));
        people.add(new Person("ooo",5));
        people.add(new Person("mmm",18));

        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
        Collections.sort(people,new NameComparator());
        System.out.println(people);
        Collections.sort(people,new ReverseAgeComparator());
        System.out.println(people);

    }
}
