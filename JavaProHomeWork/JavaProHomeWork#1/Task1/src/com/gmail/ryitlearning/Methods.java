package com.gmail.ryitlearning;

public class Methods {

    public Methods() {
    }

    @Test(a = 2, b = 2)
    public int getSum (int a, int b) {
        return a + b;
    }

    public int sum (int a, int b) {
        return a + b;
    }

    @Test(a = 3, b = 5)
    public int getMul(int a, int b) {
        return a * b;
    }

    public int mul (int a, int b) {
        return a * b;
    }

    @Test(a = 12, b = 6)
    public int getDiv(int a, int b) {
        return a / b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
