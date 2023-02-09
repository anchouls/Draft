package ru.hse.java.util;


public class C {
    private int a = 5;
    private int b = 66;
    private int c = 7;
    private int e = 4;
    private int k = 22;
    private int x = (e == 4) ? k : ((c == 7) ? b : c);
    public int b(int x, int y) {
        return extract();
    }

    public int extract() {
        int z = x + 5;
        a = 10;
        b = a + b + 3;
        c = 113 + e;
        e += 4;
        return z;
    }
}
