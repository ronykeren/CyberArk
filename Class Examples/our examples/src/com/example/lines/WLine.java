package com.example.lines;

public class WLine extends Line {

    private int width;

    public WLine(int size) {
        this(size,size);
    }

    public WLine(int length, int width) {
        super(length);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void paint() {
        for(int i=0;i<width;i++) {
            super.paint();
        }
        System.out.println();
    }


}
