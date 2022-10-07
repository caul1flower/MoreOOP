package lotr;

public class GameManager {
    //    - methods: void fight(Character c1, Character c2) {
    //                to provide fight between to characters and explain via command
    //                line what happens during fight, till both of
    //                the characters are alive
    //              }
    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            if (c1.getPower() > c2.getPower()) {
                c1.kick(c2);
                System.out.println(c1.getClass() +
                                    "kicked" + c2.getClass());
            } else {
                c2.kick(c1);
                System.out.println(c2.getClass() +
                        "kicked" + c1.getClass());
            }
        }
        String died = "no-one";
        if (c1.hp < 1) {died = (c1.getClass()).toString(); }
        else if (c2.hp < 1) {died = (c2.getClass()).toString();}
        System.out.println(died + " has died.");
    }
}