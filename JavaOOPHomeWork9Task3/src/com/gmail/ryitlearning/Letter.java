package com.gmail.ryitlearning;

public class Letter {
    private char ltr;               //letter Name
    private int freq = 1;           //How many times appears in text
    private double relFreq = 0;     //Relative frequency (the number of matches related to number of letters in text)


    public Letter(char ltr) {
        this.ltr = ltr;
    }

    public char getLtr() {
        return ltr;
    }

    public void setLtr(char ltr) {
        this.ltr = ltr;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq() {
        this.freq++;
    }

    public double getRelFreq() {
        return relFreq;
    }

    public void setRelFreq(double relFreq) {
        this.relFreq = relFreq;
    }

    @Override
    public String toString() {
        return "The letter " + "'" + ltr + "'" + " Appeared in text " + freq + " times with Relative frequency " + relFreq;
    }
}
