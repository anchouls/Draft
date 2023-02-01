package ru.hse.java.util;

public class B extends A {
    @Override
    public int a(int x, int y) {
        System.out.println(y);
        return x + y;
    }
}
