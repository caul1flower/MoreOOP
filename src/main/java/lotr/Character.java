package lotr;

import lombok.Getter;
import lombok.Setter;

public abstract class Character {
    @Setter @Getter
    int power;
    @Getter
    int hp;
    public void setHp(int newHp) {
        this.hp = Math.max(newHp, 0);
    }
    public void kick(Character c) {
        if (!c.isAlive()) return;
        c.hp -= 1;
    }
    public boolean isAlive() {
        return this.hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{" + "hp=" + hp +
                ", power=" + power + '}';
    }
}