package com.example.exceptions;

public class Test {

    public static void main(String[] args) {
        try {
            Person p=new Person("David",230);
        } catch (WrongAgeException e) {
            System.out.println(e.getMessage()+" we got it due to age ="+e.getWrongAge());
        }

        System.out.println("Bye!");
    }
}
