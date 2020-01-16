package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {

    public static void main(String[] args) {
        Map<String,Integer> data=new TreeMap<>();

        for(String word:args){
            Integer i=data.get(word);
            if(i==null){
                i=1;
            }else{
                i++;
            }
            data.put(word,i);
        }
        System.out.println(data);
    }
}
