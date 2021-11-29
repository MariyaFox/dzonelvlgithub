import interfaces.Action;
import model.*;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        Human human = new Human();
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        Action [] members = {robot, human, cat, cat2};
        Team team = new Team("My Team", members);

        Object [] barrier = new Object[2];
        barrier[0] = new Wall();
        barrier[1] = new Treadmill();

        for (int i = 0; i < barrier.length; i++) {
            for (int j = 0; j < members.length; j++) {
                if (barrier[i] instanceof Wall) {
                    ((Wall)barrier[i]).jumpOverWall(members[j]);
                }
                if (barrier[i] instanceof Treadmill) {
                    ((Treadmill)barrier[i]).runOnTreadmill(members[j]);
                }
            }

        }
    }
}
