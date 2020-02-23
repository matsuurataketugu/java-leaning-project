package domain.service;

import java.io.IOException;

/**
 * 課題インターフェース
 *
 * ここにコメント形式で課題内容とメソッドが定義されるので
 * 学習者はメソッド内容を実装することで学習を進める
 *
 * @author kanekos
 *
 */
public interface ITask {
    // 問１
    // 次のようなプログラムを作成・実行し、実行時エラーを発生させよ
    // １． String型変数sを宣言し、nullを代入する
    // ２． s.length()の内容を表示しようとする
    void task1();

    // 問２
    // 課題１で作成したコードを修正し、try-catch文を用いて例外処理せよ
    // その際、例外処理では次の処理を行うこと
    // １． 「NullPointerException例外をcatchしました。」と表示する
    // ２． 「－－スタックトレース（ここから）－－」と表示する
    // ３． スタックトレースを表示する
    // ４． 「－－スタックトレース（ここまで）－－」と表示する
    void task2();

    // 問３
    // Integer.parseInt()メソッドを実行し、文字列"三"の変換結果をint型変数に代入するコードを記述せよ
    // その際に、parseInt()メソッドがどのような例外を発生させる可能性があるかをAPIリファレンスで調べ、
    // 正しく例外処理を記述せよ
    void task3();

    // 問４
    // メソッド実施直後にIOExceptionを発生させて異常終了するようなプログラムを作成せよ
    void task4();
}
