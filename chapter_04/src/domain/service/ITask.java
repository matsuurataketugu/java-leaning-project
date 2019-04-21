package domain.service;

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
    // 下記の配列を宣言せよ
    // また値の初期化は不要とする
    // 1. int 型の値を４個まとめて格納できる配列 points
    // 2. double 型の値を４個まとめて格納できる配列 weights
    // 3. boolean 型の値を４個まとめて格納できる配列 answers
    // 4. String 型の値を４個まとめて格納できる配列 names
    void learnArrayDeclaration();

    // 問２
    // 下記のプログラムを作成せよ
    // 1. ３つの口座残高「121902」「8302」「55100」が格納されている moneyList を宣言
    // 2. その配列の要素を１つずつfor文で取り出して画面に表示
    // 3. 同じ配列の要素を拡張for文で１つずつ取り出して画面に表示
    void learnArrayFactorDisplay();

    // 問３
    // 実装部に問題があるので参照
    void whatKindOfArraysException();

    // 問４
    // 下記の仕様で「数当てゲーム」を作成せよ
    // 1. int型で要素数３の配列 numbers を準備、このとき初期値は 3,4,9 とする
    // 2. 画面に「１桁の数字を入力してください > 」と表示
    // 3. 数字の入力を受付、変数 input に格納
    // 4. ループで回しながら、いずれかの要素と等しければ「アタリ！」と表示
    // 5. 回答権は３回までとし、それまでに当たらなければ「ハズレ！」と表示
    void countGame();
}
