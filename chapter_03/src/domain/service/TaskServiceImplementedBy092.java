package domain.service;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TaskServiceImplementedBy092 implements ITask {
    // 問１
    // 下記の条件式を記述せよ
    // 構文が正しければ良い
    // 画面に何かを出力する必要なし
    // 1. 変数weightの値が60に等しい
    // 2. 変数age1とage2の合計を2倍したものが60を超えている
    // 3. 変数ageが奇数である
    // 4. 変数jobの中身の文字列が「プログラマー」と等しい
    @Override
    public void learnIfSyntax1() {
        final int GENERATION_RANGE_MAX = 100;

        int weight = new Random().nextInt(GENERATION_RANGE_MAX);
        if (weight == 60) {
            System.out.println("weight = " + weight);
        }

        int age1 = new Random().nextInt(GENERATION_RANGE_MAX);
        int age2 = new Random().nextInt(GENERATION_RANGE_MAX);
        if ((age1 + age2) * 2 > 60) {
            System.out.println("age1 = " + age1);
            System.out.println("age2 = " + age2);
        }

        int age = new Random().nextInt(GENERATION_RANGE_MAX);
        if (age % 2 == 1) {
            System.out.println("age % 2 = " + (age % 2));
        }

        int jobType = new Random().nextInt(GENERATION_RANGE_MAX);
        String job;
        if (jobType % 2 == 1) {
            job = "プログラマー";
        } else {
            job = "大工";
        }
        if (job.equals("プログラマー")) {
            System.out.println("job = " + job);
        }
    }

    // 問２
    // 下記の中から条件式として正しいものを表示せよ
    // A. cost = 300 * 1.08
    // B. 3
    // C. age != 30
    // D. true
    // E. b + 5 < 20
    // F. gender = true
    @Override
    public void learnIfSyntax2() {
        System.out.println("条件式として正しいのは C, D, E です。");
    }

    // 問３
    // 下記の内容に沿ったプログラムを作成せよ
    // 1. int型の変数sexを定義し、０か１を格納
    //    またint型変数ageを定義し、適当な数字を格納
    // 2. 画面に「こんにちは」と表示
    // 3. もし変数sexが0なら「私は男です」、そうでなければ「私は女です」と表示
    // 4. もし変数sexが男ならage変数の中身を表示して「(age)歳です」と表示
    // 5. 最後に「よろしくお願いします」と表示
    @Override
    public void learnIfStatement1() {
        final int MAN = 0;
        final int WOMAN = 1;

        System.out.print("性別を０か１で入力してください。（０：男、１：女）> ");
        int sex;
        try {
            sex = new Scanner(System.in).nextInt();
            if (sex != MAN && sex != WOMAN) {
                throw new InputMismatchException("");
            }
        } catch (InputMismatchException e) {
            System.out.println("０か１で入力してください。");
            return;
        }

        System.out.print("年齢を入力してください。> ");
        int age;
        try {
            age = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("整数で入力してください。");
            return;
        }

        System.out.println("こんにちは");
        if (sex == MAN) {
            System.out.println("私は男です。");
            System.out.println(age + "歳です。");
        } else {
            System.out.println("私は女です。");
        }
    }

    // 問４
    // 下記のような実装が行われている
    // weatherがfalseの場合、「家でゲーム」の後に「寝る」と表示
    // のつもりで書いたが意図したように動かない
    // 正しく動くように修正せよ
    @Override
    public void learnIfStatement2() {
        System.out.print("今日の天気は？(0:晴れ 1:くもり 2:雨) > ");
        boolean weather = new java.util.Scanner(System.in).nextInt() == 0;
        if (weather) {
            System.out.println("洗濯をする");
            System.out.println("彼女or彼氏とデート");
        } else {
            System.out.println("家でゲーム");
            System.out.println("寝る");
        }
    }

    // 問５
    // switch文を用いて以下のプログラムを作成せよ
    // 1. 画面に「[メニュー] 1:検索 2:登録 3:削除 4:変更 >」と表示
    // 2. 数字を入力し、変数selectedに格納
    // 3. 変数が1-4の間であれば「(選択内容)します」と表示
    //    ex. 1選択時、「検索します」
    // 4. 1-4のいずれでもない場合、「メニューにありません」と表示
    @Override
    public void learnSwitchStatement() {
        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 > ");
        String selected = new Scanner(System.in).next();
        switch (selected) {
            case "1":
                System.out.println("検索します。");
                break;
            case "2":
                System.out.println("登録します。");
                break;
            case "3":
                System.out.println("削除します。");
                break;
            case "4":
                System.out.println("変更します。");
                break;
            default:
                System.out.println("メニューにありません。");
        }
    }

    // 問６
    // 次の条件に従ってプログラムを作成せよ
    // 1. 画面に【数当てゲーム】と表示
    // 2. ０から９までの整数の中からランダムな数を１つ生成して変数answerに格納
    // 3. for文を用いて5回のループ処理を作成
    // (以下4-7はループ中の処理)
    // 4. 画面に「0 ～ 9 の数字を入力してください」を表示
    // 5. 数字を入力し変数numに格納
    // 6. 入力した数字がanswerと一致したら「アタリ！」と画面に表示して繰り返しを終了
    // 7. もし不一致ならば「ハズレ！」と画面に表示
    // 8. 「ゲームを終了します」を表示
    @Override
    public void countGame() {
        System.out.println("============================================");
        System.out.println("==             【数当てゲーム】           ==");
        System.out.println("============================================");
        int answer = new Random().nextInt(10);
        System.out.println("「ルール説明」");
        System.out.println("・０～９のランダムな数字が生成されます。");
        System.out.println("・５回の回答チャンスのうちに数字を当ててください。");
        System.out.println("・０～９の範囲外、数字以外を入力しても１回の回答にカウントされます。");

// for debug
//        System.out.println("カンニング：" + answer);

        int chance = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.print("数字を入力してください（あと " + chance + " 回）：");
            try {
                int num = new Scanner(System.in).nextInt();
                if (num == answer) {
                    System.out.println("アタリ！");
                    break;
                }
                throw new InputMismatchException("");
            } catch (InputMismatchException e) {
                System.out.println("ハズレ！");
            }
            chance--;
        }
        System.out.println("ゲームを終了します。");
    }
}
