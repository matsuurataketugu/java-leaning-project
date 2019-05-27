package domain.service;

public class TaskServiceImplementedBy617 implements ITask {
    @Override
    public void learnArrayDeclaration() {
        //1.
        int [] points;
        points = new int[4];
        //2.
        double[] weights;
        weights = new double[4];
        //3.
        boolean[] answers;
        answers = new boolean[4];
        //4.
        String [] names;
        names = new String[4];
    }

    @Override
    public void learnArrayFactorDisplay() {
        //1.
        int moneyList[] = {121902, 8302, 55100};
        //2.
        for (int i = 0; i < 3; i++){
            System.out.println(moneyList[i]);
        }
        //3.
        for(int balance: moneyList){
            System.out.println(balance);
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
        //System.out.println(count[1]);
        //ここではNullPointerExceptionという例外が発生します
        //System.out.println(heights[2]);
        //ここではArrayIndexOutOfBoundsExceptionという例外が発生します
    }

    @Override
    public void countGame() {
        //1.
        int numbers[] = new int[3];

        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 9;
        boolean flg = false;

        //2.3.4.5.
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
                if(flg) {
                    break;
                }

                if(!flg) {
                    System.out.println("ハズレ！");
                }
            }
        }
    }

