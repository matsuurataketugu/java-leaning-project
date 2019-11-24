package domain.service.student645;

import java.util.Random;
import java.util.Scanner;

public abstract class AAdventure implements IAdventure {
    private BeginnerHero beginnerHero;
    private VeteranHero veteranHero;
    private Bird bird;



    public AAdventure() {

        this.beginnerHero = new BeginnerHero();
        this.beginnerHero.setName("マツ");
        this.beginnerHero.setLife(1000);
        this.beginnerHero.setMana(100);
        this.beginnerHero.setOffense(100);
        this.beginnerHero.setDefense(50);

        this.veteranHero = new VeteranHero();
        this.veteranHero.setName("ベテランさん");
        this.veteranHero.setLife(1000);
        this.veteranHero.setMana(100);
        this.veteranHero.setOffense(100);
        this.veteranHero.setDefense(50);

        this.bird = new Bird();
        this.bird.setName("相棒の鳥");
        this.bird.setLife(500);
        this.bird.setMana(50);
        this.bird.setOffense(70);
        this.bird.setDefense(10);
    }

    public AAdventure(BeginnerHero beginnerHero, VeteranHero veteranHero, Bird bird) {
        this.beginnerHero = beginnerHero;
        this.veteranHero = veteranHero;
        this.bird = bird;
    }


    @Override
    public void story() {
        System.out.println("得体のしれない犬と猫に襲われたところを通りがかりの冒険者に助けられた。");
        System.out.println("あれから色々聞いたところによると、どうやらここは異世界らしい。");
        System.out.println("この世界では犬と猫が覇権を争っており、人間はその間で細々と生きながらえている。");
        System.out.println("人間に残された道はやつらの食料となるか、戦って生き抜くかの２つに１つとのこと。");
        System.out.println("やつらの食料になるなんて真っ平御免だ！俺は戦って元の世界に帰るぞ！");

        return;
    }


    @Override
    public void training() {
        System.out.println("ベテランさん「この世界じゃ、自分の身を自分で守る力が必要だ！」");
        System.out.println("ベテランさん「特別に俺が稽古をつけてやる！おもいっきりかかってこい！！」");
        System.out.println("\n");
        System.out.println("模擬戦闘の開始");
        System.out.println("ベテランヒーローと相棒の鳥が、マツに襲い掛かってきた");
        System.out.println("\n");

        GameSystem gs = new GameSystem();




        while (true) {
            gs.enemyTurn(this.veteranHero, this.beginnerHero);
            pause();
            gs.enemyTurn(this.bird, this.beginnerHero);
            pause();
            System.out.println("行動を選択してください。（１：攻撃 ２：守り ３：スキル）");
            int action = new Scanner(System.in).nextInt();
            switch (action) {
                case 1:
                    if (getTarget() == 1) {
                        gs.myAttack(this.beginnerHero, this.veteranHero);
                    } else {
                        gs.myAttack(this.beginnerHero, this.bird);
                    }
                    break;
                case 2:
                    gs.myGuard(this.beginnerHero);
                    break;
                case 3:
                    if (getTarget() == 1) {
                        gs.mySkill(this.beginnerHero, this.veteranHero);
                    } else {
                        gs.mySkill(this.beginnerHero, this.bird);
                    }
                    break;
                default:
                    break;
            }
            pause();
            if (gs.isEnd(this.beginnerHero, this.veteranHero, this.bird)) {
                break;
            }
            pause();
        }
        System.out.println("今日のトレーニングはここまで！");
        return;
    }





    public void pause() {
        System.out.println("一時停止：任意の値を入力してエンターキーを押してください。");
        new Scanner(System.in).next();
    }

    public int getTarget() {
        System.out.println("ターゲットを選択してください。（１：ヒーロー ２：鳥）");
        return new Scanner(System.in).nextInt();
    }






}
