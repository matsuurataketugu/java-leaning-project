package domain.service.student645;

import domain.service.ITask;

import java.io.IOException;

public class Task645 implements ITask {


    @Override
    public void task1() {
        // 問１
        // 次のようなプログラムを作成・実行し、実行時エラーを発生させよ
        // １． String型変数sを宣言し、nullを代入する
        String s = null;

        // ２． s.length()の内容を表示しようとする
        // System.out.print(s.length());

    }

    @Override
    public void task2() {
        // 問２
        // 課題１で作成したコードを修正し、try-catch文を用いて例外処理せよ
        // その際、例外処理では次の処理を行うこと
        // １． 「NullPointerException例外をcatchしました。」と表示する
        // ２． 「－－スタックトレース（ここから）－－」と表示する
        // ３． スタックトレースを表示する
        // ４． 「－－スタックトレース（ここまで）－－」と表示する
        try{
            String s = null;
            System.out.print(s.length());
        } catch(NullPointerException error2){
            System.out.println("NullPointerException例外をcatchしました。");
            System.out.println("－－スタックトレース（ここから）－－");
            System.out.println("スタックトレースを表示する");
            System.out.println("－－スタックトレース（ここまで）--");

        }

    }

    @Override
    public void task3() {
        // 問３
        // Integer.parseInt()メソッドを実行し、文字列"三"の変換結果をint型変数に代入するコードを記述せよ
        String sanbanme = "三";
        //System.out.println(Integer.parseInt(sanbanme));


        // その際に、parseInt()メソッドがどのような例外を発生させる可能性があるかをAPIリファレンスで調べ、
        // 正しく例外処理を記述せよ
        try {
            Integer.parseInt(sanbanme);
        }catch(NumberFormatException error3){
            System.out.println("NumberFormatException例外をcatchしました。");

        }

    }

    @Override
    public void task4() {
        // 問４
        // メソッド実施直後にIOExceptionを発生させて異常終了するようなプログラムを作成せよ
        try {
            throw new IOException();
        } catch (IOException error4){
            System.out.println("異常終了");
        }
    }
}
