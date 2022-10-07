package lotr;

public class Hobbit extends Character {
    //  - attributes: int power=0, int hp=3
    //  - methods: void kick(Character c) { toCry() }
    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }
    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit cries.");
    }
}