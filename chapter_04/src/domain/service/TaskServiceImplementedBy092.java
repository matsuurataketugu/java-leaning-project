package domain.service;

public class TaskServiceImplementedBy092 implements ITask {
    @Override
    public void learnArrayDeclaration() {

    }

    @Override
    public void learnArrayFactorDisplay() {

    }

    // 下記のコードを実行すると、22行目と23行目で例外が発生する
    // それぞれの例外をコード中にコメントで記述せよ
    // ex. 「ここでは～～という例外が発生します」
    // ヒント デバッグモードで動作検証するとわかりやすい
    @Override
    public void whatKindOfArraysException() {
        int[] count = null;
        float[] heights = { 171.3F, 175.0F };
//        System.out.println(count[1]);
//        System.out.println(heights[2]);
    }

    @Override
    public void countGame() {

    }
}
