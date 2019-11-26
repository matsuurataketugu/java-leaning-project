package domain.service.student645;

import java.util.Random;

public class BeginnerHero extends Hero {

    @Override
    public int guard() {
        //防御を高める
      int DEF = super.getDefense() + 50;
      super.setDefense(DEF);

      return DEF;
    }

    @Override
    public int skill() {
        //返り値で防御へらす
       int SKILL = super.getOffense();
       return SKILL;
    }

    @Override
    public int attack() {

        int ATK = super.getOffense() ;

        return ATK;
    }

    @Override
    public int run() {
        System.out.println("ここに独自の処理を書く");
        return 0;


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




