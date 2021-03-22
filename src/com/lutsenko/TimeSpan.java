package com.lutsenko;


public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes >= 60) {
            throw new IllegalArgumentException("Minutes must be less than 60");
        }
        this.hours = hours;
        this.minutes = minutes;
    }


    public void add(TimeSpan timeSpan) {
        hours = timeSpan.hours + hours;
        minutes = timeSpan.minutes + minutes;
        while (minutes >= 60) {
            minutes = minutes - 60;
            hours = hours + 1;
        }
    }

    public void sub(TimeSpan timeSpan) {
        hours = hours - timeSpan.hours;
        minutes = minutes - timeSpan.minutes;
        while (minutes < 0) {
            minutes = minutes + 60;
            hours = hours - 1;
        }
    }

    public void mult(double times) {
        double time = hours * 60 + minutes;
        time = time * times;
        hours = (int) time / 60;
        minutes = (int) time - (hours * 60);
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
