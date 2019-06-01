package domain.service;

import java.util.Scanner;

public class TaskServiceImplementedBy645 implements ITask {
    @Override
    public void learnMethod1() {

        //}
        // 問１
        // 下記のメソッドを作成せよ
        // 適用範囲  ：private
        // メソッド名：selfIntroduction
        // 戻り値    ：なし
        // 引数      ：なし
        // 処理内容  ：名前、年齢、身長、性別(男/女)を入力させ、入力値をそれぞれ変数に格納して結果を画面に表示
        // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと

      //private void selfIntroduction() {
        //引数なし　→　selfIntroduction()
        //返り値無し　→　void
            System.out.print("お名前は？＞");
            String name = new Scanner(System.in).next();

            System.out.print("年齢は？＞");
            int old = new Scanner(System.in).nextInt();

            System.out.print("伸長は？＞");
            int sintyou = new Scanner(System.in).nextInt();

            System.out.print("性別は？(男/女)＞");
            String sex = new Scanner(System.in).next();

            System.out.println(old + "歳の" + name + "さんは、伸長が" + sintyou + "の" + sex + "なんですね！");
        //}
    }

    @Override
    public void learnMethod2() {
        // 問２
        // 下記のメソッドを作成せよ
        // 適用範囲  ：private
        // メソッド名：multiplication
        // 戻り値    ：なし
        // 引数      ：１から９の整数
        // 処理内容  ：引数で受け取った数字の段の九九を画面に表示
        // 九九の結果を配列に格納した後で結果を表示すること
        // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと

        // 引数      ：１から９の整数
        int namberList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //九九結果の格納先 81個の値が入る配列の宣言
        int kukuList[] = new int[81];

        //for (int i = 0; i < kukuList.length; i++){
            for (int j = 0; j < namberList.length; j++) {
                for (int k = 0; k < namberList.length; k++) {
                    // System.out.println(namberList[j] * namberList[i]);
                   // kukuList[i] = namberList[j] * namberList[k];

                }
            }
         //}
        System.out.println(kukuList[0]);
        System.out.println(kukuList[1]);
        System.out.println(kukuList[2]);
        System.out.println(kukuList[3]);
        System.out.println(kukuList[4]);
        System.out.println(kukuList[5]);
        System.out.println(kukuList[6]);



    }

    @Override
    public void learnMethod3() {
        // 問３
        // 下記のメソッドを作成せよ
        // 適用範囲  ：private
        // メソッド名：yearToEra
        // 戻り値    ：元号
        // 引数      ：西暦(1900-2020)
        // 処理内容  ：西暦を入力させ、その年の元号を表示
        // 西暦別の年号は下記の通りとする
        // 1911年まで:明治, 1925年まで:大正, 1988年まで:昭和, 2018年まで:平成, 2019年以降:令和
        // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと

    }

    @Override
    public void learnMethod4() {
        // 問４
        // 下記のメソッドを作成せよ
        // 適用範囲  ：private
        // メソッド名：taxCalculation
        // 戻り値    ：なし
        // 引数      ：西暦(1900-2020), 商品価格
        // 処理内容  ：西暦、商品の価格を入力させ、その年の元号、消費税率、消費税を加味した代金を表示
        // 西暦別の消費税は下記の通りとする
        // 1988年まで:0%, 1989年以降:3%, 1997年以降:5%, 2014年以降:8%, 2019年以降:10%
        // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと

    }

    @Override
    public void learnMethod5() {
        // 問５
        // 下記のメソッドを作成せよ
        // 適用範囲  ：private
        // メソッド名：yourName
        // 戻り値    ：任意
        // 引数      ：任意
        // 処理内容  ：オーバーロードの概念を用いてそれぞれ下記の処理を実装せよ
        // 1. 君の名は何回見た？と質問 → 映画「君の名は」を見た回数を表示
        // 2. 君の名は？と質問 → 私は〇〇です。と表示
        // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと

    }
}
