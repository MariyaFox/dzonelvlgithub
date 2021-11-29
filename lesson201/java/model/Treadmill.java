package model;

import interfaces.Runable;

public class Treadmill {

    private boolean doAction;

    public void runOnTreadmill(Runable runable) {
        if (doAction) {
            runable.run();
        } else {
            System.out.println("Member can not run on treadmill.");
        }
    }
}
