package com.study.week4;

public class Multiply {
    private int x;
    private int y;

    public Multiply(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Multiply() {
        this.x = 1;
        this.y = 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int multi(int x, int y){
        return x * y;
    }
}
