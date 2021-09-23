package ru.geekbrains.lesson2;

public class MainApp {

    public static void main (String[] args) {
    foo(7,8);
    foo(5);
    check(6);
    bar(1000);
        }

    public static void foo(int a, int b) {
        if(a + b  >= 10 && a + b <= 20) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }

    public static void foo(int c) {
        System.out.println(c < 0 ? "-" : "+");
    }

    public static void check(int i) {
        if(i < 0) {
            System.out.println(true);
            } else {
            System.out.println(false);
        }
    }

    public static boolean bar(long year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}