package domain.service.student617;

import java.util.Random;

public class Girl617 {
    private static final String DEFAULT_NAME = "渡来 歩美";
    private static final int DEFAULT_AGE = 10;
    private static final String LAST_ANSWER = "q";

    private String name;
    private int age;

    public Girl617(String aName, int aAge) {
        name = aName;
        age = aAge;
    }

    public Girl617(String aName) {
        this(aName, DEFAULT_AGE);
    }

    public Girl617(int aAge) {
        this(DEFAULT_NAME, aAge);
    }

    public Girl617() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    public void prologue() {
        System.out.println("私の名前は" + this.name + "、"+ this.age + "歳の小学4年生。");
        System.out.println("今度の夏休みに生まれて初めてハワイに行くの。");
        System.out.println("ああ、今から楽しみすぎてちっとも勉強が手につかないわ！");
        System.out.println("でもそんなこと言ってたらパパとママに叱られちゃう。");
        System.out.println("さっさとこの宿題を片付けて、今日もハワイのリサーチをするわよ！");
    }

    public void research() {

        String[] stringArray = new String[5];
        stringArray[0] = "ワイキキビーチで思い切り遊ぶべき！";
        stringArray[1] = "イルカに出会えるツアーもあるよ！";
        stringArray[2] = "ダイヤモンドヘッドから日の出は絶景！";
        stringArray[3] = "ディーンアンドでルーカで限定グッズをゲットしよう！";
        stringArray[4] = "ウルフギャングでお腹いっぱいステーキを食べよう！";

        System.out.println("ハワイのリサーチ！何個みる？");

        String num = new java.util.Scanner(System.in).next();
        int count = Integer.parseInt(num);

        //int i = 0;

        for (int i = 0; i < count; i++) {

            Random rnd = new Random();
            int result = rnd.nextInt(5);

            if (result == 0) {
                System.out.println(stringArray[result]);
            } else if (result == 1) {
                System.out.println(stringArray[result]);
            } else if (result == 2) {
                System.out.println(stringArray[result]);
            } else if (result == 3) {
                System.out.println(stringArray[result]);
            } else {
                System.out.println(stringArray[result]);
            }

            System.out.println("任意のキーを入力(qで終了)");
            String key = new java.util.Scanner(System.in).next();

            if (LAST_ANSWER.equals(key)) {
                break;
            }
        }
    }
}
