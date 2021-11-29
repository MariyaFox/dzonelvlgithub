package model;

import interfaces.Jumpable;

public class Wall {

    private boolean doAction;

    public void jumpOverWall(Jumpable jumpable) {
        if (doAction) {
            jumpable.jump();
        } else {
            System.out.println("Member can not jump over wall.");
        }
    }
}
