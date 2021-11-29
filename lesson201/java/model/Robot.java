package model;

import interfaces.Action;

public class Robot implements Action {
    public void run() {
        System.out.println("Robot бежит");
    }

    public void jump() {
        System.out.println("Robot прыгает");
    }

}
