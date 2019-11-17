package domain.service.student645;

public class GameSystem {


    private int damage;

    public void enemyTurn(Hero veteranHero, Hero beginnerHero) {
        damage = 0;
        int beginnerHeroLife = beginnerHero.getLife();
        veteranHero.setAction(Utility.getRandom(100));

        if (veteranHero.getAction() <= VeteranHeroAction.guard.getId()) {
            System.out.println(veteranHero.getName() + "は守りに徹した！");
            veteranHero.setLife(veteranHero.getLife() + veteranHero.guard());
            return;
        } else if (veteranHero.getAction() <= VeteranHeroAction.skill.getId()) {
            System.out.println(veteranHero.getName() + "のスキル発動！");
            if (veteranHero.getMana() >= 25) {
                System.out.println("倍返しだ！");
                damage = veteranHero.skill();
            } else {
                System.out.println("マナが足りない！");
                return;
            }
        } else if (veteranHero.getAction() <= VeteranHeroAction.attack.getId()) {
            damage = veteranHero.attack();
            damage -= beginnerHero.getDefense();
            if (damage < 0) {
                damage = 0;
            }
        }
        System.out.println(veteranHero.getName() + "の攻撃！");
        System.out.println(beginnerHero.getName() + "は" + damage + "のダメージを受けた");
        beginnerHeroLife -= damage;
        if (beginnerHeroLife < 0) {
            beginnerHeroLife = 0;
        }
        beginnerHero.setLife(beginnerHeroLife);
    }

    public void enemyTurn(ACreature bird, Hero beginnerHero) {
        damage = 0;
        int beginnerHeroLife = beginnerHero.getLife();
        bird.setAction(Utility.getRandom(100));
        if (bird.getAction() <= BirdAction.run.getId()) {
            System.out.println(bird.getName() + "は逃げ出した！");
            bird.setLife(0);
            return;
        } else if (bird.getAction() <= BirdAction.attack.getId()) {
            damage = bird.attack();
            damage -= beginnerHero.getDefense();
            if (damage < 0) {
                damage = 0;
            }
        }
        System.out.println(bird.getName() + "の攻撃！");
        System.out.println(beginnerHero.getName() + "は" + damage + "のダメージを受けた");
        beginnerHeroLife -= damage;
        if (beginnerHeroLife < 0) {
            beginnerHeroLife = 0;
        }
        beginnerHero.setLife(beginnerHeroLife);
    }

    public void myGuard(Hero beginnerHero) {
        System.out.println(beginnerHero.getName() + "は守りに徹した！");
        beginnerHero.setLife(beginnerHero.getLife() + beginnerHero.guard());
    }

    public void myAttack(Hero beginnerHero, ACreature target) {
        damage = 0;
        int targetLife = target.getLife();
        damage = beginnerHero.attack();
        damage -= target.getDefense();
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(beginnerHero.getName() + "の攻撃！");
        System.out.println(target.getName() + "は" + damage + "のダメージを受けた");
        targetLife -= damage;
        if (targetLife < 0) {
            targetLife = 0;
        }
        target.setLife(targetLife);
        Utility.lastDamage = damage;
    }

    public void mySkill(Hero beginnerHero, ACreature target) {
        damage = 0;
        int targetLife = target.getLife();
        System.out.println(beginnerHero.getName() + "のスキル発動！");
        if (beginnerHero.getMana() >= 25) {
            System.out.println("ガードキル！");
            target.setDefense(target.getDefense() - beginnerHero.skill());
            damage = beginnerHero.attack();
            System.out.println(beginnerHero.getName() + "の攻撃！");
            System.out.println(target.getName() + "は" + damage + "のダメージを受けた");
            targetLife -= damage;
            if (targetLife < 0) {
                targetLife = 0;
            }
            target.setLife(targetLife);
            Utility.lastDamage = damage;
        } else {
            System.out.println("マナが足りない！");
            return;
        }
    }

    public boolean isEnd(BeginnerHero beginnerHero, VeteranHero veteranHero, Bird bird) {
        System.out.println(beginnerHero.getName() + "のライフ: " + beginnerHero.getLife());
        System.out.println(veteranHero.getName() + "のライフ: " + veteranHero.getLife());
        System.out.println(bird.getName() + "のライフ: " + bird.getLife());
        if (beginnerHero.getLife() == 0 || veteranHero.getLife() == 0 || bird.getLife() == 0) {
            return true;
        }
        return false;
    }
}
