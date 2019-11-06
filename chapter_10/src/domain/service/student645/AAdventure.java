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
        this.beginnerHero.setLife(120);
        this.beginnerHero.setMana(50);
        this.beginnerHero.setOffense(100);
        this.beginnerHero.setDefense(60);

        this.veteranHero = new VeteranHero();
        this.veteranHero.setName("ベテランさん");
        this.veteranHero.setLife(200);
        this.veteranHero.setMana(100);
        this.veteranHero.setOffense(120);
        this.veteranHero.setDefense(30);

        this.bird = new Bird();
        this.bird.setName("相棒の鳥");
        this.bird.setLife(50);
        this.bird.setMana(50);
        this.bird.setOffense(20);
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


       // AAdventure para ;
        BeginnerHero zibun = new BeginnerHero();
        VeteranHero enemyA = new VeteranHero();
        Bird enemyB = new Bird();

        for(int i = 0;;){

            System.out.println("選択してください");
            System.out.println("たたかう：１");
            System.out.println("特技　　：２");
            System.out.println("まもる　：３");
            System.out.println("ねげる　：４");
            int sentakusi = new Scanner(System.in).nextInt();


            //敵のどちらかランダム
            // 0はベテラン
            // 1は鳥
            Random rndA = new Random();
            int enemy = rndA.nextInt(2);

            System.out.println(enemy);
            if (enemy==1){  //鳥へ攻撃
                switch (sentakusi) {
                    case 1: //攻撃
                        System.out.println(this.beginnerHero.getName() + "の攻撃！");
                        System.out.print(this.bird.getName() + "に");
                        System.out.println(this.beginnerHero.attack() + "のダメージを与えた。");

                        int BefHp = this.bird.getLife();
                        int AftHp = BefHp - this.beginnerHero.attack();
                        this.bird.setLife(AftHp);
                        break;

                    case 2: //スキル
                        System.out.println("スキルを選択");
                        System.out.println("全体に" + this.beginnerHero.skill() + "のダメージを与えた。");

                        int BefBirdHp = this.bird.getLife();
                        int BefVeteranHp = this.veteranHero.getLife();
                        int AftBirdHp = BefBirdHp - this.beginnerHero.skill();
                        int AftVeteranHp = BefVeteranHp - this.beginnerHero.skill();
                        this.bird.setLife(AftBirdHp);
                        this.veteranHero.setLife(AftVeteranHp);

                        break;
                    case 3: //守る
                        System.out.println("守るを選択");
                        this.beginnerHero.guard();
                        System.out.println("防御力が" + this.beginnerHero.getDefense() + "にあがった！");
                        break;
                    case 4: //逃げる
                        System.out.println("逃げるを選択");
                        break;
                }
            }else {  //ベテランへ攻撃
                switch (sentakusi) {
                    case 1: //攻撃
                        System.out.println(this.beginnerHero.getName() + "の攻撃！");
                        System.out.print(this.veteranHero.getName() + "に");
                        System.out.println(this.beginnerHero.attack() + "のダメージを与えた。");

                        int BefHp = this.veteranHero.getLife();
                        int AftHp = BefHp - this.beginnerHero.attack();
                        this.veteranHero.setLife(AftHp);

                        break;

                    case 2: //スキル
                        System.out.println("スキルを選択");
                        System.out.println("全体に" + this.beginnerHero.skill() + "のダメージを与えた。");

                        int BefBirdHp = this.bird.getLife();
                        int BefVeteranHp = this.veteranHero.getLife();
                        int AftBirdHp = BefBirdHp - this.beginnerHero.skill();
                        int AftVeteranHp = BefVeteranHp - this.beginnerHero.skill();
                        this.bird.setLife(AftBirdHp);
                        this.veteranHero.setLife(AftVeteranHp);
                        break;

                    case 3: //守る
                        System.out.println("守るを選択");
                        System.out.println("防御力が" + this.beginnerHero.guard() + "に上がった。");
                        break;

                    case 4: //逃げる
                        System.out.println("逃げるを選択");
                        break;
                }

            }

            //敵の攻撃　ベテランの行動パターン
            System.out.println("敵のターン！");
            Random rndB = new Random();
            Random rndC = new Random();


            int enemy1 = rndB.nextInt(5);
            int enemy2 = rndC.nextInt(3);


            //ベテランの行動パターン　enenmy1
            //0～5
            switch (enemy1){
                case 1: //攻撃
                    System.out.println(this.veteranHero.getName() + "の攻撃！");
                    System.out.print(this.beginnerHero.getName() + "に");
                    System.out.println(this.veteranHero.attack() + "のダメージを与えた。");

                    int BefHp = this.beginnerHero.getLife();
                    int AftHp = BefHp - this.veteranHero.attack();
                    this.beginnerHero.setLife(AftHp);
                    break;

                case 2: //スキル
                    System.out.println(this.veteranHero.getName() + "のスキル！");
                    System.out.println(this.beginnerHero.getName() + "の防御が" + this.veteranHero.skill() + "ダウンした");

                    int BefGuard = this.beginnerHero.getDefense();
                    int AftGuard = BefGuard - this.veteranHero.skill();
                    this.beginnerHero.setLife(AftGuard);
                    break;

                case 3: //守る
                    System.out.println("ベテランさんは防御している");
                    this.veteranHero.guard();
                    break;

                case 4: //逃げる
                    System.out.println("");
                    break;

                default: //何もしない
                    System.out.println("ベテランさんはボーっとしている");
                    break;
            }


            //敵の攻撃　鳥の行動パターン　enemy2
            //0～2
            switch (enemy2){
                case 1: //攻撃
                    System.out.println(this.bird.getName() + "の攻撃！");
                    System.out.print(this.beginnerHero.getName() + "に");
                    System.out.println(this.bird.attack() + "のダメージを与えた。");

                    int BefHp = this.beginnerHero.getLife();
                    int AftHp = BefHp - this.bird.attack();
                    this.beginnerHero.setLife(AftHp);
                    break;

                case 2: //逃げる
                    System.out.println("");
                    break;

                default: //何もしない
                    System.out.println("鳥は餌を食べている");
                    break;
            }




            System.out.print("マツHP：" + this.beginnerHero.getLife());
            System.out.print("ベテランHP：" + this.veteranHero.getLife());
            System.out.println("鳥HP：" + this.bird.getLife());

        }
    }






}
