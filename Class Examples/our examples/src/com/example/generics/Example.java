package com.example.generics;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        Stam<Integer> s1=new Stam<>(100);
        s1.print(100);

        Stam<String> s2=new Stam<>("Hello");
        s2.print("Hello");

        Stam<Date> s3=new Stam<>(new Date());
        s3.print(new  Date());
        s3.printSub(new java.sql.Date(345345));
    }

}
