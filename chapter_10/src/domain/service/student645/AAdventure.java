package domain.service.student645;

import java.util.Random;
import java.util.Scanner;

public abstract class AAdventure implements IAdventure {
    private BeginnerHero beginnerHero;
    private VeteranHero veteranHero;
    private Bird bird;



    public AAdventure() {
        this.beginnerHero = new BeginnerHero();
        this.beginnerHero.name = "マツ";
        this.beginnerHero.life = 120;
        this.beginnerHero.mana = 50;
        this.beginnerHero.offense = 100;
        this.beginnerHero.defense = 60;

        this.veteranHero = new VeteranHero();
        this.veteranHero.name = "ベテランさん";
        this.veteranHero.life = 200;
        this.veteranHero.mana = 100;
        this.veteranHero.offense = 120;
        this.veteranHero.defense = 30;

        this.bird = new Bird();
        this.bird.name = "カラアゲくん";
        this.bird.life = 50;
        this.bird.mana = 50;
        this.bird.offense = 20;
        this.bird.defense = 10;
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
        System.out.println("\n\n\n\n");
        System.out.println("模擬戦闘の開始");
        System.out.println("ベテランヒーローと相棒の鳥が、マツに襲い掛かってきた");
        System.out.println("\n");


        AAdventure para ;
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
            if(sentakusi == 1){
                zibun.attack();

            }else if (sentakusi == 2 ) {
                zibun.skill();

            }else if (sentakusi == 3) {
                zibun.guard();

            }else if (sentakusi == 4) {
                zibun.run();
            } else{
                System.out.println("選択肢エラーは何もしない");
            }



            //敵の攻撃　ベテランの行動パターン
            System.out.println("敵のターン！");
            Random rnd = new Random();


            int enemy1 = rnd.nextInt(5);
            int enemy2 = rnd.nextInt(3);

            //ベテランの行動パターン　enenmy1
            if(enemy1 == 0){
                enemyA.attack();

            }else if (enemy1 == 1 ) {
                enemyA.skill();

            }else if (enemy1 == 2) {
                enemyA.guard();

            }else if (enemy1 == 3) {
                enemyA.run();
            } else{
                System.out.println("ベテランさんの攻撃！　　マツは素早く避けた！");
            }

            //敵の攻撃　カラアゲくんの行動パターン
            if(enemy2 == 0){
                enemyB.attack();

            }else if (enemy2 == 1 ) {
                enemyB.run();

            }else{
                System.out.println("餌をほしそうにこちらを眺めている");
            }

        }
    }






}
