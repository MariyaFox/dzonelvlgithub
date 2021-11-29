package model;

import interfaces.Action;

public class Cat implements Action {
    public void run() {
        System.out.println("Cat бежит");
    }

    public void jump() {
        System.out.println("Cat прыгает");
    }
}
