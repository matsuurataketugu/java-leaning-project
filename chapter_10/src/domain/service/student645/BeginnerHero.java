package domain.service.student645;

import java.util.Random;

public class BeginnerHero extends Hero {

    @Override
    public void guard() {
        System.out.println("マツは守理の体制になった！");
        System.out.println("防御力が上がった");
//        super.guard();
    }

    @Override
    public void skill() {
        System.out.println("マツは呪文を唱えた");
//        super.skill();
    }

    @Override
    public void attack() {

        System.out.println("マツの攻撃　");

        //攻撃力
        int ATK = getOffense();

        //ランダム　敵のどちらかHPを減らす  1はベテラン 2は鳥
        Random rnd = new Random();
        int enemy = rnd.nextInt(2);
        if(enemy ==1){
            VeteranHero enemyA = new VeteranHero();

            //攻撃前の敵HP
            int EnemyHpBofore = enemyA.getLife();

            //攻撃後の敵HP
            int EnemyHpAfter = EnemyHpBofore - ATK;

            //減ったHPをセッターで戻す
                enemyA.setLife(EnemyHpAfter);

            System.out.println("ベテランさんに" + ATK + "ダメージ与えた");
            System.out.println("残り　ベテランさんHP" + EnemyHpAfter );
        }else{
            Bird enemyB = new Bird();
            int EnemyHpBofore = enemyB.getLife();
            int EnemyHpAfter = EnemyHpBofore - ATK;
            enemyB.setLife(EnemyHpAfter);
            System.out.println("カラアゲくんに" + ATK + "ダメージ与えた");
            System.out.println("残り　カアラゲくんHP" + EnemyHpAfter );

        }



    }

    @Override
    public void run() {
        System.out.println("ここに独自の処理を書く");


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




