package ru.hse.java.util;

public class NewClass {

    int first = 1;
    int second = 2;
    private int a = 5;
    private int b = 66;
    private int c = 7;
    private int e = 4;
    private int k = 22;

    public int methodA1() {
        int a = first + second;
        return a;
    }

    public int extract() {
        int z = 5;
        a = 10;
        b = a + b + 3;
        c = 113 + e;
        e += 4;
        return z;
    }
}
