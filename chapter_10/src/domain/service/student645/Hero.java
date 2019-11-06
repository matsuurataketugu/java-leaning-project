package domain.service.student645;

public class Hero extends Creature implements IHuman {
    @Override
    public int guard() {
        return 0;
    }

    @Override
    public int skill() {
        return 0;
    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public int run() {
        return super.run();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getMana() {
        return super.getMana();
    }

    @Override
    public void setMana(int mana) {
        super.setMana(mana);
    }

    @Override
    public int getLife() {
        return super.getLife();
    }

    @Override
    public void setLife(int life) {
        super.setLife(life);
    }

    @Override
    public int getOffense() {
        return super.getOffense();
    }

    @Override
    public void setOffense(int offense) {
        super.setOffense(offense);
    }

    @Override
    public int getDefense() {
        return super.getDefense();
    }

    @Override
    public void setDefense(int defense) {
        super.setDefense(defense);
    }
}
