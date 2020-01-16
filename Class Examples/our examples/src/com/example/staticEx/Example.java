package com.example.staticEx;

public class Example {

//    static{
//        System.out.println("before main...");
//    }

    public static void main(String[] args) throws Exception{
//        Person p1=new Person("David",20);
//        Person p2=new Person("Eve", 30);

        Class.forName(args[0]);
    }

//    static{
//        System.out.println("before main 2...");
//    }

}
