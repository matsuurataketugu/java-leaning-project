package domain.service.student645;

import java.util.Random;

public abstract class Creature implements IAnimal {
    private String name;
    private int life;
    private int mana;
    private int offense;
    private int defense;

    @Override
    public int attack() {
        return new Random().nextInt(10) + 1;
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

}
