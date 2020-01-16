package com.example.exceptions;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws WrongAgeException{
        this.name = name;
        setAge(age);
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws WrongAgeException{
        if(age>=0&&age<=120)
            this.age = age;
        throw new WrongAgeException("Wrong age value - must be in rance: 0-120",age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
