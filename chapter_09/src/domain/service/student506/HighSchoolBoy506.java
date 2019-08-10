package domain.service.student506;

public class HighSchoolBoy506 extends Boy506{

    private static final String signatureMove = "フリーキック";
    private static final String LAST_KEY = "q";

    public void rememberMyDream() {
        super.prologue();
    }

    public void specialTraining() {

        System.out.println("時代を入力(少年時代：1、高校時代：2");
        String key = new java.util.Scanner(System.in).next();

        if ("1".equals(key)) {
            super.specialTraining();
        } else if ("2".equals(key)) {
            this.highSchoolSpecialTraining();
        } else {
            System.out.println("1または2以外が入力されました。");
            return;
        }

    }

    public void highSchoolSpecialTraining() {
        int totalGoal = 0;
        int shootOff = 0;

        System.out.println("何本フリーキック練習する？");

        String num = new java.util.Scanner(System.in).next();
        int shootNum = Integer.parseInt(num);

        for (int i = 0; i < shootNum; i++) {
            System.out.println("シュート！");

            System.out.println("任意のキーを入力(qで終了)");
            String key = new java.util.Scanner(System.in).next();

            if (LAST_KEY.equals(key)) {
                break;
            }

            java.util.Random rnd = new java.util.Random();
            int result = rnd.nextInt(4);

            if (result == 0) {
                System.out.println("ゴール！");
                totalGoal++;
            } else if (result == 1) {
                System.out.println("惜しい!ポスト");
                shootOff++;
            } else if (result == 2) {
                System.out.println("残念!壁に当たった");
                shootOff++;
            } else {
                System.out.println("残念!枠外");
                shootOff++;
            }
        }

        System.out.println("ゴール数：" + totalGoal);
        System.out.println("枠外シュート数：" + shootOff);

        System.out.println("シュート練習終わり");
    }

    public void boast() {

        System.out.println("僕の特技は" + signatureMove + "だ。");
        System.out.println("将来は中村俊輔選手のようなフリーキックが蹴れるように日々特訓中だ！");

    }
}
