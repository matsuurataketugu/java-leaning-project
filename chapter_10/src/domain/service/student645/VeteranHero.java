package domain.service.student645;

public class VeteranHero extends Hero {
    @Override
    public int guard() {
        int DEF = super.getDefense() + 20;
        super.setDefense(DEF);

        return super.guard();
    }

    @Override
    public int skill() {
        // ここに独自の処理を書く
        return Utility.lastDamage * 2;
    }

    @Override
    public int attack() {

        return super.attack();
    }

    @Override
    public int run() {
        // ここに独自の処理を書く
        return super.run();
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


