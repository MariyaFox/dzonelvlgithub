package model;

import interfaces.Action;

public class Human implements Action {
    public void run() {
        System.out.println("Human бежит");
    }

    public void jump() {
        System.out.println("Human прыгает");
    }
}
