package domain.service;

public class TaskServiceImplementedBy506 implements ITask {
    @Override
    public void learnArrayDeclaration() {

        int points[] = new int[4];
        double weights[] = new double[4];
        boolean answers[] = new boolean[4];
        String names[] = new String[4];

    }

    @Override
    public void learnArrayFactorDisplay() {

        int moneyList[] = new int[3];

        moneyList[0] = 121902;
        moneyList[1] = 8302;
        moneyList[2] = 55100;

        for (int i = 0; i < 3; i++) {
            System.out.println(moneyList[i]);
        }

        for (int value : moneyList) {
            System.out.println(value);
        }
    }

    // 下記のコードを実行すると、22行目と23行目で例外が発生する
    // それぞれの例外をコード中にコメントで記述せよ
    // ex. 「ここでは～～という例外が発生します」
    // ヒント デバッグモードで動作検証するとわかりやすい
    @Override
    public void whatKindOfArraysException() {
        int[] count = null;
        float[] heights = { 171.3F, 175.0F };
//        ここでは、NullPointerExceptionという例外が発生します。
//        System.out.println(count[1]);
//        ここでは、ArrayIndexOutOfBoundsExceptionという例外が発生します。
//        System.out.println(heights[2]);
    }

    @Override
    public void countGame() {
        int numbers[] = new int[3];

        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 9;
        boolean flg = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("１桁の数字を入力してください >");

            String inputString = new java.util.Scanner(System.in).next();
            int input = Integer.parseInt(inputString);

            for (int j = 0; j < 3; j++) {
                if (input == numbers[j]) {
                    System.out.println("アタリ！");
                    flg = true;
                    break;
                }
            }

            if (flg) {
                break;
            }
        }

        if (!flg) {
            System.out.println("ハズレ！");
        }


    }
}
