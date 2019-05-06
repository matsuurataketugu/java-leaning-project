package domain.service;

public class TaskServiceImplementedBy645 implements ITask {
    @Override
    public void learnIfSyntax1() {
        // 問１
        // 下記の条件式を記述せよ
        // 構文が正しければ良い
        // 画面に何かを出力する必要なし

        // 1. 変数weightの値が60に等しい
        int weight == 60 ;

        // 2. 変数age1とage2の合計を2倍したものが60を超えている
        int age1 = 20;
        int age2 = 15;
        int ageSUM  = age1 +  age2;
        ageSUM * 2 < 60;

        // 3. 変数ageが奇数である
        int age ;
        age % 2 == 1 ;

        // 4. 変数jobの中身の文字列が「プログラマー」と等しい

    }

    @Override
    public void learnIfSyntax2() {
        // 問２
        // 下記の中から条件式として正しいものを表示せよ
         cost = 300 * 1.08;
        // B. 3
          age != 30;
        // D. true
          b + 5 < 20;
         gender = true;
    }

    @Override
    public void learnIfStatement1() {
        // 問３
        // 下記の内容に沿ったプログラムを作成せよ
        // 1. int型の変数sexを定義し、０か１を格納

        //    またint型変数ageを定義し、適当な数字を格納
        // 2. 画面に「こんにちは」と表示
        // 3. もし変数sexが0なら「私は男です」、そうでなければ「私は女です」と表示
        // 4. もし変数sexが男ならage変数の中身を表示して「(age)歳です」と表示
        // 5. 最後に「よろしくお願いします」と表示

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
        } else
            System.out.println("家でゲーム");
        System.out.println("寝る");
    }

    @Override
    public void learnSwitchStatement() {
        // 問５
        // switch文を用いて以下のプログラムを作成せよ
        // 1. 画面に「[メニュー] 1:検索 2:登録 3:削除 4:変更 >」と表示
        // 2. 数字を入力し、変数selectedに格納
        // 3. 変数が1-4の間であれば「(選択内容)します」と表示
        //    ex. 1選択時、「検索します」
        // 4. 1-4のいずれでもない場合、「メニューにありません」と表示

    }

    @Override
    public void countGame() {
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

    }
}
