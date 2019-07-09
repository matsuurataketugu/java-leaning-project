package domain.service;

import java.util.Random;
import java.util.Scanner;

public class Boy645 {
    static final String DEFAULT_NAME = "松平 元継";
    static final int DEFAULT_AGE = 10;


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
        System.out.println("僕「ひぃぃ、" + DEFAULT_NAME + "です！」(ぽわわ～ん)");
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
        System.out.println("僕「助けて、" + DEFAULT_AGE + "歳です！」(ぽわわ～ん)");
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
        String[] escape = new String[4];
        escape[0] = " :僕「よし！真っ直ぐ走って逃げるぞ！";
        escape[1] = " :僕「ゆっくり逃げよう」";
        escape[2] = " :僕(ダメだ…怖くて動けない…。)";
        escape[3] = " :その時！通りすがりの冒険者が登場！僕は助けてもらえたのであった。";

       //選択肢に使う数字を被らないようランダムに使う方法が分かりません。
        //この状態やと、１～４の数値を一つだけ取り出すので。。。
        Random random = new Random();
        int no = random.nextInt(4) + 1;


        System.out.println("僕(何か逃げる方法を考えないと…。)");
        for (int i = 0; i <= 1; ) {
            System.out.println("強制終了する  d  ");
            System.out.println("選択肢１～４を選択してください。");
            System.out.println(no + escape[0]);
            System.out.println(no + escape[1]);
            System.out.println(no + escape[2]);
            System.out.println(no + escape[3]);
            Scanner sentakusi = new Scanner(System.in);

         /* if(助かる選択肢){
           助かった時の文

         }
          逃げれなかった時の文ともう一回選択肢を求める文
          強制終了のパターン
          バットエンド


          */
        }


    }


}
