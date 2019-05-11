package domain.service;

import java.util.Random;
import java.util.Scanner;

public class TaskServiceImplementedBy645 implements ITask {
    @Override
    public void learnOperatorPriority() {
        int x = 2;
        int y = 3;
        //問１
        // 現在すでに処理は実装されている。
        // しかし、動作させると「x + y = 23」と表示されてしまう。
        // 「x + y = 5」と表示されるように修正せよ。
        String answer = "x + y = " + (x + y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(answer);
    }

    @Override
    public void learnTypeConversion() {
        // 問２
        // 次の中で文法として正しいものをすべて表示せよ。
        // 回答例. 「正しい文は①, ②, ③です。」
        // ①int x = 1 + 2.0;
        // ②double d = 4.0F
        // ③int i = "9";
        // ④String s = 3 + " days";
        // ⑤byte b = 7;
        // ⑥double d = true;
        // ⑦short s = (byte)2;
        System.out.println("正しいのは、②④⑤⑦だと思います");

    }

    @Override
    public void fortuneGame() {
       // import java.util.Scanner;


        int random = 0 ;
        // 問３
        // 以下の内容のプログラムを作成せよ。
        // 1. 画面に「ようこそ占いの館へ」と表示
        System.out.println("ようこそ占いの館へ");

        // 2. 画面に「あなたの名前を入力してください」と表示
        System.out.println("あなたの名前を入力してください");
        Scanner scan1 = new Scanner(System.in);

        // 3. キーボードから１行の文字入力を受け付け、String型の変数nameに格納
        String name = scan1.next();


        // 4. 画面に「あなたの年齢を入力してください」と表示
        System.out.println("あなたの年齢を入力してください");

        // 5. キーボードから１行の文字入力を受け付け、String型の変数ageStringに格納
        // 6. 変数ageStringの内容をint型に変換し、int型の変数ageに代入
        Scanner scan2 = new Scanner(System.in);
        String ageString = scan2.next();


        // 7. ０から３までの乱数を生成し、int型の変数fortuneに代入
        // 8. fortuneの数値をインクリメント演算子で１増やし、１から４の乱数する
        Random rnd = new Random ();
        int fortune = rnd.nextInt(4)+1 ;

        // 9. 画面に「占いの結果が出ました！」と表示
        System.out.println("あなたの年齢を入力してください");
        // 10. 画面に「(年齢)歳の(名前)さん、あなたの運気番号は(乱数)です。」と表示 ※カッコの中身は変数
        System.out.println( ageString +"歳の"+ name +"さん、あなたの運気番号は "+ fortune +" です。");

        // 11. 画面に「1:大吉 2:中吉 3:吉 4:凶」と表示
        System.out.println("1:大吉  2:中吉  3:吉  4:凶");

        // ヒント：
        //   文字入力受付  java.util.Scanner
        //   ランダム生成  java.util.Random

    }
}
