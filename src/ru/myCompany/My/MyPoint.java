package ru.myCompany.My;

import static java.lang.Math.*;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int[] getXY() {
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        double distance = sqrt(pow((this.x - x),2) + pow((this.y - y), 2));
        return distance;
    }

    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    public double distance() {
        return distance(0,0);
    }
}
