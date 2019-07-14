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
        System.out.println("僕(何か逃げる方法を考えないと…。)");

        //ランダム添字の作成
        for (int i = 0; i <= 1; ) {
            int index1 = (int) (Math.random() * 4);
            int index2 = (int) (Math.random() * 4);
            int index3 = (int) (Math.random() * 4);
            int index4 = (int) (Math.random() * 4);

            //添字同士が同じにならない時、処理が進む
            if (index1 != index2 && index1 != index3 && index1 != index4 && index2 != index3 && index2 != index4 && index3 != index4) {

                        //文言の入る文字列作成
                        String[] escape = new String[4];
                        escape[index1] = " :僕「よし！真っ直ぐ走って逃げるぞ！";
                        escape[index2] = " :僕「ゆっくり逃げよう」";
                        escape[index3] = " :僕(ダメだ…怖くて動けない…。)";
                        escape[index4] = " :僕(助けてくれそうな人を探そう･･･。)";

                        //文字入力の要求
                        System.out.println("選択肢１～４を選択してください。   強制終了  d ");
                        System.out.println((index1 +1) + escape[0]);
                        System.out.println((index2 +1) + escape[1]);
                        System.out.println((index3 +1) + escape[2]);
                        System.out.println((index4 +1) + escape[3]);
                        System.out.print("選択肢：");
                        String sentakusi = new Scanner(System.in).next();

                        switch (sentakusi){
                            case "d":
                                System.out.println("あなたは猫に引っかかれ、犬に噛まれて力尽きてしました。");
                                System.out.println("おわり");
                                boolean dieFlg = true;
                                break;

                          /*  case index4 ;
                                System.out.println("その時！通りすがりの冒険者が登場！僕は助けてもらえたのであった。");
                                System.out.println("おわり");
                                break;
                             */
                            default:
                                System.out.println("ダメだ！逃げれない！");

                        }


            }
        }
    }
}










