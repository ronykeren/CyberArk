package com.example;

import com.example.lines.Line;

public class ObjectExample {
    public static void main(String[] args) {
        Object o=new Object();
        System.out.println(o);

        Line l1=new Line(10);
        Line l2=new Line(10);
        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));
    }
}
