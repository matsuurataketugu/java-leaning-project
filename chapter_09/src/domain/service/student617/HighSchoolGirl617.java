package domain.service.student617;

import java.util.Random;

public class HighSchoolGirl617 extends Girl617 {

    private static final String recommendedActivity = "海沿いのお店で美味しい食事とお酒";
    private static final String LAST_ANSWER = "q";

    public void rememberMyDream() {
        super.prologue();
    }

    public void research() {

        System.out.println("時代を入力(小学生：1、高校生：2)");
        String key = new java.util.Scanner(System.in).next();

        if ("1".equals(key)) {
            super.research();
        } else {
            this.highSchoolResearch();
        }
    }

    private void highSchoolResearch() {
        String[] stringArray = new String[5];
        stringArray[0] = "ダイビングをして綺麗な魚と一緒に泳ごう！";
        stringArray[1] = "ドレスアップをしてパーティーに参加しよう！";
        stringArray[2] = "一流ホテルでエステを受けよう！";
        stringArray[3] = "ハワイ大学に行ってハワイ留学も視野に入れよう！";
        stringArray[4] = "海沿いで朝ヨガを体験しよう！";

        System.out.println("ハワイのリサーチ！1-5のうち何番を見る？");

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
     public void recommended() {
            System.out.println("ハワイのおススメアクティビティは" + recommendedActivity + "だ。");
            }
        }

