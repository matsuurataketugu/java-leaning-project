package domain.service;

import java.util.Random;
import java.util.Scanner;

public class Boy645 {
    static final String DEFAULT_NAME = "松平 元継";
    static final int DEFAULT_AGE = 10;

    static final String LAST_KEY = "q";

    public String name = "";
    public int age = 0;

    public Boy645(String aName, int aAge) {
        name = aName;
        age = aAge;
    }

    public Boy645(String pName) {
        this(pName, DEFAULT_AGE);
    }
    public Boy645(int pAge) {
        this(DEFAULT_NAME, pAge);
    }
    public Boy645() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    public void prologue() {

        System.out.println("あいててて…  ここはどこだ？");
        System.out.println("見たこともない所だ。うう、頭が痛い…");
        System.out.println("そうだ、僕はスマホゲームをしながら歩いていたら変な穴、 ");
        System.out.println("あれはマンホールだ！それに落ちてしまったんだ！");
        System.out.println("けどマンホールに落ちたはずなのに、なんで地面に座り込んでいるんだ？？");
        System.out.println("謎の声Ａ「くく、見ろよやっぱりだ。初物だぜ！」");
        System.out.println("謎の声Ｂ「ああ、張ってたかいがあったぜ。」");
        System.out.println("僕(なんだ？？)");
        System.out.println("謎の声Ｂ「けど小物だな。」");
        System.out.println("謎の声Ａ「まぁ、しょうがねぇ、贅沢は言えねぇよ。」");
        System.out.println("謎の声Ａ「おい、小僧、名を言え。」");
        System.out.println("僕(え？猫？？猫が喋ってる！)");
        System.out.println("猫Ｂ「名前を言えって言ってんだろ！！」");
        System.out.println("僕「ひぃぃ、" + this.name + "です！」(ぽわわ～ん)");
        System.out.println("猫Ａ「定着したぞ。」");
        System.out.println("猫Ｂ「よし、じゃあ死ね。」(ジャキッ！)");
        System.out.println("僕(え？)");
        System.out.println("謎の声Ｃ「待ちな。」");
        System.out.println("謎の声Ｄ「そいつは俺らのもんだ。」");
        System.out.println("僕(え？？犬？？今度は犬が(以下省略))");
        System.out.println("僕(囲まれた…。)");
        System.out.println("犬Ｃ「小僧、助けてやるぞ、いくつだ？」");
        System.out.println("僕(？？)");
        System.out.println("犬Ｄ「年はいくつだ？」");
        System.out.println("猫Ａ「チッ！」(犬に飛びかかる)");
        System.out.println("猫Ｂ「クソがっ！」(犬に飛びかかる)");
        System.out.println("犬Ｃ「おっと！２人相手はきついから早くしろよ！」(猫ＡＢの攻撃を防ぐ)");
        System.out.println("犬Ｄ「なぁ、年を言えば助けてやるって！」");
        System.out.println("僕「助けて、" + this.age + "歳です！」(ぽわわ～ん)");
        System.out.println("犬Ｄ「よっし、ＯＫだ！ガルルル！」(僕に飛びかかってくる)");
        System.out.println("猫Ｂ「させるかっ！」(犬Ｄに割って入る)");
        System.out.println("犬Ｄ「・・・・」(ビキビキ)");
        System.out.println("猫Ｂ「・・・・」(ビキビキ)");
        System.out.println("猫Ａ「やっぱ」(ビキビキ)");
        System.out.println("犬Ｃ「こうなるよなぁ」(ビキビキ)");
        System.out.println("僕(なんかみんな犬猫だけど人間ぽくなったぞ、でももっとやばそうだ)");
        System.out.println("猫ども「ニャアァァァ」");
        System.out.println("犬ども「ガルルーーー」");
        System.out.println("僕(争ってるようだけど早すぎて見えない…、でも、逃げるなら今のうちだ！)");

    }


    public void helpMe() {
        // 初期設定 文言４パターンの用意
        String[] escapeResult = new String[]{
                "僕「よし！真っ直ぐ走って逃げるぞ！」\nダメだ！逃げれない！\n逃げれるタイミングを待とう・・・",
                "僕「よし！ゆっくり逃げよう」\nダメだ！逃げれない！\n逃げれるタイミングを待とう・・・",
                "僕(ダメだ…怖くて動けない…。)\nダメだ！逃げれない！\n逃げれるタイミングを待とう・・・",
                "僕(助けてくれそうな人を探そう･･･。)\nその時！通りすがりの冒険者が登場！僕は助けてもらえたのであった。"
        };

        //escapeResult[3]に謎の男の登場パターン
        final int ROAD_TO_SAVE = 3;

        //バッドエンド
        String deadMessage = "声「どうやら、逃げ疲れて諦めたようだな。」\n僕（こうして、わけがわからないまま僕の人生は終りをむかえた…。）\n～ Bad End ～";

        // 逃亡処理
        while (true) {
            // メッセージと入力
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("早くここから逃げないと大変だ！！");
            System.out.println("(任意の文字を入力してenterを押下してください。逃げるのを諦めるときは「d」を入力)：");
            System.out.println("----------------------------------------------------------------------------------");
            String input = new Scanner(System.in).next();

            // 入力値がdの場合
            if (input.toLowerCase().equals("d")) {
                System.out.println(deadMessage);
                return;
            }

            // ランダムで４より低い数字をdestinyに格納
            Random rnd = new Random();
            int destiny = rnd.nextInt(4);

            // 配列からdestiny番目の文言を表示
            System.out.println("僕の行動は…");
            System.out.println(escapeResult[destiny]);

            // 謎の男登場パータンのみ、おわる
            if (destiny == ROAD_TO_SAVE) {
                return;
            }
        }
    }
}








