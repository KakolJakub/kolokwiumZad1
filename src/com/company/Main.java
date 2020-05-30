package com.company;

public class Main {

    public static void main(String[] args) {

        Kwadrat k = new Kwadrat(5);
        Trojkat t = new Trojkat(5, 4, 2);
        System.out.println(k.obliczPowierzchnie());
        System.out.println(t.obliczPowierzchnie());
    }
}

interface Ksztalt {

    double obliczPowierzchnie();

    double obliczObwod();
}

class Kwadrat implements Ksztalt {

    double dlugoscBoku;

    Kwadrat(double a) {
        dlugoscBoku = a;
    }

    @Override
    public double obliczPowierzchnie() {

        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {

        return dlugoscBoku * 4;
    }

}

class Trojkat implements Ksztalt {

    double a, b, c;

    Trojkat(double aa, double ba, double ca) {

        a = aa;
        b = ba;
        c = ca;
    }

    @Override
    public double obliczPowierzchnie() {

        double d = obliczObwod() / 2;
        return Math.sqrt(d * (d - a) * (d - b) * (d - c));
    }

    @Override
    public double obliczObwod() {
        return a + b + c;
    }
}