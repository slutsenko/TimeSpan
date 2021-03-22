package com.lutsenko;

public class Main {

    public static void main(String[] args) {
        TimeSpan timespan1 = new TimeSpan(0, 1);
        TimeSpan timespan2 = new TimeSpan(0, 59);
        timespan1.add(timespan2);
        timespan1.sub(timespan2);
        timespan1.mult(10);
        System.out.println(timespan1);
    }
}
