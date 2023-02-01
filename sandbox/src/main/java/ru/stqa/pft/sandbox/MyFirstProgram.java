package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    nameFunc("World");
    nameFunc("Серожа");

    double len = 5;
    System.out.println("Площадь квадрата равна: " + area(len));

    double a = 4;
    double b = 5;
    System.out.println("Площадь прямоугольника равна: " + area(a, b));
  }

  public static void nameFunc(String nameVariable) {
    System.out.println("Hello, " + nameVariable + "!");
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}