package com.example.generics;

public class Stam<T> {

    private T obj;

    public Stam(T obj){
        this.obj=obj;
    }

    public void print(T toPrint){
        System.out.println(toPrint);
    }

    public <S extends T> void printSub(S sub){
        System.out.println(sub);
    }

}
