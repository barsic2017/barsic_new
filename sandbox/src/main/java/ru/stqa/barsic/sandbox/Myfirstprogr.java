package ru.stqa.barsic.sandbox;

public class Myfirstprogr {

public static void main(String[] args) {
hello("world");
    hello("user");
    hello("barsic");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle();
    r.a = 3;
    r.b = 4;
    System.out.println("Площать прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
}
public static void hello(String somebody)
{
    System.out.println("Hello," + somebody + "!");}




}