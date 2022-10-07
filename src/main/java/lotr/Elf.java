package lotr;

public class Elf extends Character {
    // - attributes: int power=10, int hp=10
    //   - methods: void kick(Character c) {
    //                kill everybody weaker than him,
    //                otherwise decrease the power of character by 1
    //              }
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        }
        else {
            this.setPower(this.getPower()-1);
        }
    }
}