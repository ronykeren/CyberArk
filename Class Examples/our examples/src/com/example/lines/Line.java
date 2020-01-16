package com.example.lines;

import java.util.Objects;

public class Line {

    private int length;

    public Line(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return length == line.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    public void paint(){
        for(int i=0;i<length;i++){
            System.out.print('_');
        }
        System.out.println();
    }
}
