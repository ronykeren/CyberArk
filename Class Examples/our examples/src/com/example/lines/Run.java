package com.example.lines;

public class Run {
    public static void main(String[] args) {

        Line[] lines=new Line[4];
        lines[0]=new Line(10);
        lines[1]=new Line(20);
        lines[2]=new WLine(10,3);
        lines[3]=new WLine(6,4);

       for(Line curr: lines) {
           curr.paint();
       }


       //print width of WLine instances
        for(Line curr:lines){
            if(curr instanceof WLine){
                int width=((WLine)curr).getWidth();
                System.out.println(width);
            }
        }
    }
}
