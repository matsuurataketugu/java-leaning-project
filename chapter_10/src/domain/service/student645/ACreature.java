package domain.service.student645;

import java.util.Random;

public abstract class ACreature implements IAnimal {
    private String name;
    private int life;
    private int mana;
    private int offense;
    private int defense;
    private int action;

    @Override
    public int attack() {
        return this.getOffense() + (int) (this.getOffense() * new Random().nextDouble());
    }

    @Override
    public int run() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getOffense() {
        return offense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
}
