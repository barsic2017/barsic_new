package ru.stqa.barsic.sandbox;

public class Myfirstprogr {

public static void main(String[] args) {
hello("world");
    hello("user");
    hello("barsic");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 3;
    double b = 4;
    System.out.println("Площать прямоугольника со сторонами " + a + " и " + b + " = " + area (a,b));
}
public static void hello(String somebody)
{
    System.out.println("Hello," + somebody + "!");}

    public static double area (double l) {return l*1;}

    public static double area (double a, double b) {return a*b;}
}