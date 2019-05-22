package domain.service;

public class TaskServiceImplementedBy645 implements ITask {
    @Override
    public void learnArrayDeclaration() {
        // 1. int 型の値を４個まとめて格納できる配列 points
        int [] points;
        points = new int[4];

        // 2. double 型の値を４個まとめて格納できる配列 weights
        double[] weights;
        weights = new double[4];

        // 3. boolean 型の値を４個まとめて格納できる配列 answers
        boolean[] answers;
        answers = new boolean[4];

        // 4. String 型の値を４個まとめて格納できる配列 names
        String [] names;
        names = new String[4];
    }
    @Override
    public void learnArrayFactorDisplay() {
        // 問２
        // 下記のプログラムを作成せよ
        // 1. ３つの口座残高「121902」「8302」「55100」が格納されている moneyList を宣言
         int  moneyList[] = {121902,8302,55100};
       // moneyList = new int[3];
        //moneyList[0] = 121902;
        //moneyList[1] = 8302;
        //moneyList[2] = 55100;

         //2. その配列の要素を１つずつfor文で取り出して画面に表示
        for(int i=0;i<moneyList.length;i++ ){
            System.out.println(moneyList[i] );
        }
        // 3. 同じ配列の要素を拡張for文で１つずつ取り出して画面に表示
        for(int i : moneyList ){
            System.out.println("↓拡張for文");
            System.out.println(i);
        }

    }
    // 問３
    // 実装部に問題があるので参照
    // 下記のコードを実行すると、22行目と23行目で例外が発生する
    // それぞれの例外をコード中にコメントで記述せよ
    // ex. 「ここでは～～という例外が発生します」
    // ヒント デバッグモードで動作検証するとわかりやすい
    @Override
    public void whatKindOfArraysException() {
        int[] count = null;
        float[] heights = { 171.3F, 175.0F };

//        System.out.println(count[1]);
           //countにnullを代入して
           //nullを参照しようとしてるため
           //NullPointExceotionがでてしまう

//        System.out.println(heights[2]);
           //heightsに添字２が存在しない
           // heights[0] = 171.3F,
           // heights[1] = 175.0F
    }

    @Override
    public void countGame() {
        // 問４
        // 下記の仕様で「数当てゲーム」を作成せよ
        // 1. int型で要素数３の配列 numbers を準備、このとき初期値は 3,4,9 とする
        // 2. 画面に「１桁の数字を入力してください > 」と表示
        // 3. 数字の入力を受付、変数 input に格納
        // 4. ループで回しながら、いずれかの要素と等しければ「アタリ！」と表示
        // 5. 回答権は３回までとし、それまでに当たらなければ「ハズレ！」と表示

    }
}
