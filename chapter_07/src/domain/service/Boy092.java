package domain.service;

public class Boy092 {
    private static final String DEFAULT_NAME = "金田 進ノ介";
    private static final int DEFAULT_AGE = 10;
    private String name;
    private int age;

    public Boy092(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boy092(String name) {
        this(name, DEFAULT_AGE);
    }

    public Boy092(int age) {
        this(DEFAULT_NAME, age);
    }

    public Boy092() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    public void prologue() {
        System.out.println("僕の名前は" + this.name + "、夢は素敵な女性と結婚して幸せな家庭を築くことだ！");
        System.out.println("まだ" + this.age + "歳だけど、いろんな女の子と仲良くなるぞ！");
        System.out.println("今日も街に出て女の子を探そう！");
    }

    public void getAlongWellWithGirls() {
        System.out.println("-----------------------------------------------------");
        System.out.println(this.name + "(" + this.age + ")のナンパ道");
        System.out.println("-----------------------------------------------------");
        System.out.println("街に出て素敵な女の子を探そう！");
        System.out.println("１度のゲームで行動できる回数は５回までだ！");
        System.out.println("女の子に会えるかは運次第、仲良くなれるかも運次第だ！");
        System.out.println("頑張れ！");

        int actTimes = 5;
        boolean ai = false;
        boolean iori = false;
        boolean umi = false;
        boolean enako = false;
        boolean origa = false;
        String[] nanpaSpot = new String[]{
                "1.公園  ：あいちゃんに会えるかも！",
                "2.学校  ：いおりちゃんに会えるかも！",
                "3.図書館：うみちゃんに会えるかも！",
                "4.モール：えなこちゃんに会えるかも！",
                "5.駅    ：オリガちゃんに会えるかも！",
        };
        for (int i = 1; i <= actTimes; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.println("どこに行ってみようか？(行動回数：" + i + "回目)");
            System.out.println("-----------------------------------------------------");
            for (String item : nanpaSpot) {
                System.out.println(item);
            }
            int movingLocation;
            while (true) {
                System.out.println("移動する場所を入力(1-5)：");
                String key = new java.util.Scanner(System.in).next();
                if (IsInputOk(key)) {
                    movingLocation = Integer.parseInt(key);
                    break;
                } else {
                    System.out.println("error：1-5の整数で入力してください。");
                }
            }
            switch (movingLocation) {
                case 1:
                    ai = getAi();
                    break;
                case 2:
                    iori = getIori();
                    break;
                case 3:
                    umi = getUmi();
                    break;
                case 4:
                    enako = getEnako();
                    break;
                case 5:
                    origa = getOriga();
                    break;
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("結果発表！！");
        System.out.println("-----------------------------------------------------");
        if (!ai && !iori && !umi && !enako && !origa) {
            System.out.println("今日は誰とも仲良くなれなかった…。");
            return;
        }

        System.out.println("今日はこの子と仲良くなれたぞ！");
        if (ai) {
            System.out.println("あいちゃん！");
        }
        if (iori) {
            System.out.println("いおりちゃん！");
        }
        if (umi) {
            System.out.println("うみちゃん！");
        }
        if (enako) {
            System.out.println("えなこちゃん！");
        }
        if (origa) {
            System.out.println("おりがちゃん！");
        }
    }

    private boolean IsInputOk(String input) {
        try {
            int i = Integer.parseInt(input);
            return 1 <= i && i <= 5;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean getAi() {
        return isDateSuccessful("公園", "あい");
    }

    private boolean getIori() {
        return isDateSuccessful("学校", "いおり");
    }

    private boolean getUmi() {
        return isDateSuccessful("図書館", "うみ");
    }

    private boolean getEnako() {
        return isDateSuccessful("ショッピングモール", "えなこ");
    }

    private boolean getOriga() {
        return isDateSuccessful("駅", "オリガ");
    }

    private boolean isDateSuccessful(String location, String girlsName) {
        if (!isMeet()) {
            System.out.println(location + "に行ってみた。");
            System.out.println(girlsName + "ちゃんには会えなかった…。");
            return false;
        }
        System.out.println(girlsName + "ちゃんに合った。");
        System.out.println(girlsName + "ちゃんと遊んだ。");
        System.out.print("親密度が…");
        if (!isFeelGood()) {
            System.out.println("ダウンした。");
            return false;
        }
        System.out.println("アップした。");
        return true;
    }

    private boolean isMeet() {
        return new java.util.Random().nextBoolean();
    }

    private boolean isFeelGood() {
        return new java.util.Random().nextBoolean();
    }
}
