package lotr;

import java.util.Random;

public class King extends Character{
    // - attributes: int power=from 5 to 15, int hp=from 5 to 15
    //   - methods: void kick(Character c) {
    //                decrease number of hp of the enemy by random
    //                number which will be in the range of his power
    //              }
    private static Random random = new Random();
    public King() {
        this.power = random.nextInt(10) + 5;
        this.hp = random.nextInt(10) + 5;
    }
    public void kick(Character c) {
        c.setHp(c.getHp()-random.nextInt(this.power));
    }
}