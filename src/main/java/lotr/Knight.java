package lotr;

import java.util.Random;

public class Knight extends Character {
    //  - attributes: int power=from 2 to 12, int hp=from 2 to 12
    //   - methods: void kick(Character c) { like King }
    private static Random random = new Random();
    public Knight() {
        this.power = random.nextInt(10) + 2;
        this.hp = random.nextInt(10) + 2;
    }
    public void kick(Character c) {
        c.hp -= random.nextInt(power);
    }
}