package domain.service;

public class Boy506 {

    static final String DEFAULT_NAME = "堀江 達也";
    static final int DEFAULT_AGE = 10;

    static final String LAST_KEY = "q";

    public String name = "";
    public int age = 0;

    public Boy506(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    public Boy506(String pName) {
        this(pName, DEFAULT_AGE);
    }

    public Boy506(int pAge) {
        this(DEFAULT_NAME, pAge);
    }

    public Boy506() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    public void prologue() {
        System.out.println("僕の名前は" + this.name + "、夢はプレミアリーグで活躍できるサッカー選手になることだ！");
        System.out.println("まだ" + this.age + "歳だけど、外国の子供達はこれくらいから頑張ってるんだ！");
        System.out.println("僕も負けられない！ ");
        System.out.println("みんなは帰ってしまったけど、今日も残って特訓だ！ ");
    }

    public void specialTraining() {

        int totalGoal = 0;
        int shootOff = 0;

        System.out.println("何本シュート練習する？");

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
            int result = rnd.nextInt(3);

            if (result == 0) {
                System.out.println("ゴール！");
                totalGoal++;
            } else if (result == 1) {
                System.out.println("惜しい!ポスト");
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
}
