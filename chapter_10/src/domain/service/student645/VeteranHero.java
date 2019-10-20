package domain.service.student645;

public class VeteranHero extends Hero {
    @Override
    public void guard() {
        System.out.println("ベテランヒーローは守る体制になった");
//        super.guard();
    }

    @Override
    public void skill() {
        System.out.println("ベテランヒーローは呪文を唱えた");
//        super.skill();
    }

    @Override
    public void attack() {
        System.out.println("ベテランヒーローの攻撃");
//        super.attack();
    }

    @Override
    public void run() {
        System.out.println("ベテランヒーローは戦闘から離脱した");
//        super.run();
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
