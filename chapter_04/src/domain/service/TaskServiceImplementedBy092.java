package domain.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskServiceImplementedBy092 implements ITask {
    // 問１
    // 下記の配列を宣言せよ
    // また値の初期化は不要とする
    // 1. int 型の値を４個まとめて格納できる配列 points
    // 2. double 型の値を４個まとめて格納できる配列 weights
    // 3. boolean 型の値を４個まとめて格納できる配列 answers
    // 4. String 型の値を４個まとめて格納できる配列 names
    @Override
    public void learnArrayDeclaration() {
        int[] points = new int[4];
        double[] weights = new double[4];
        boolean[] answers = new boolean[4];
        String[] names = new String[4];
    }

    // 問２
    // 下記のプログラムを作成せよ
    // 1. ３つの口座残高「121902」「8302」「55100」が格納されている moneyList を宣言
    // 2. その配列の要素を１つずつfor文で取り出して画面に表示
    // 3. 同じ配列の要素を拡張for文で１つずつ取り出して画面に表示
    @Override
    public void learnArrayFactorDisplay() {
        int[] moneyList = {121902, 8302, 55100};
        System.out.println("配列の要素を１つずつfor文で取り出して画面に表示");
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(i + "番目の値：" + moneyList[i]);
        }
        System.out.println("配列の要素を拡張for文で１つずつ取り出して画面に表示");
        int i = 0;
        for (int value : moneyList) {
            System.out.println(i + "番目の値：" + value);
            i++;
        }
    }

    // 下記のコードを実行すると、22行目と23行目で例外が発生する
    // それぞれの例外をコード中にコメントで記述せよ
    // ex. 「ここでは～～という例外が発生します」
    // ヒント デバッグモードで動作検証するとわかりやすい
    @Override
    public void whatKindOfArraysException() {
        try {
            System.out.println("下記のような処理を実行。すると…");
            System.out.println("int[] count = null;");
            System.out.println("System.out.println(count[1]);");
            int[] count = null;
            System.out.println(count[1]);
        } catch (Exception e) {
            System.out.println("ここでは " + e.toString() + " という例外が発生します。");
        }
        try {
            System.out.println("下記のような処理を実行。すると…");
            System.out.println("float[] heights = { 171.3F, 175.0F };");
            System.out.println("System.out.println(heights[2]);");
            float[] heights = {171.3F, 175.0F};
            System.out.println(heights[2]);
        } catch (Exception e) {
            System.out.println("ここでは " + e.toString() + " という例外が発生します。");
        }
    }

    // 問４
    // 下記の仕様で「数当てゲーム」を作成せよ
    // 1. int型で要素数３の配列 numbers を準備、このとき初期値は 3,4,9 とする
    // 2. 画面に「１桁の数字を入力してください > 」と表示
    // 3. 数字の入力を受付、変数 input に格納
    // 4. ループで回しながら、いずれかの要素と等しければ「アタリ！」と表示
    // 5. 回答権は３回までとし、それまでに当たらなければ「ハズレ！」と表示
    @Override
    public void countGame() {
        System.out.println("============================================");
        System.out.println("==             【数当てゲーム】           ==");
        System.out.println("============================================");
        System.out.println("「ルール説明」");
        System.out.println("・３つの数字が配列に格納されています。");
        System.out.println("・数字は０～９の何れか３つです。");
        System.out.println("・３回の回答チャンスのうちに数字を当ててください。");
        System.out.println("・０～９の範囲外、数字以外を入力しても１回の回答にカウントされます。");
        int[] numbers = {3, 4, 9};
        int chance = 3;
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.print("１桁の数字を入力してください（あと " + chance + " 回） > ");
                int input = new Scanner(System.in).nextByte();
                for (int number : numbers) {
                    if (number == input) {
                        System.out.println("アタリ！");
                        System.out.println("ゲームを終了します。");
                        return;
                    }
                }
                throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("ハズレ！");
            }
            chance--;
        }
        System.out.println("ゲームを終了します。");
    }
}
