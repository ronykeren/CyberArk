package com.example;

public class Boom7 {

    public static void main(String[] args) {
        int num=1000;

        outer:for(int i=0;i<num;i++){
            if(i%7==0){
                System.out.println("Boom");
                continue;
            }
            int temp=i;
            while(temp>0){
                int digit=temp%10;
                if(digit==7){
                    System.out.println("Boom");
                    continue outer;
                }
                temp/=10;
            }
            System.out.println(i);
        }
    }

}
