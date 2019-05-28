package domain.service;

public class TaskServiceImplementedBy506 implements ITask {
    @Override
    public void learnIfSyntax1() {

        int weight = 0;
        int age = 30;
        int age1 = 0;
        int age2 = 0;
        String job = "プログラマー";

        if (weight == 60) {

        };

        if((age1 + age2) * 2 > 60){

        };

        if(age % 2 != 0){

        };

        if ("プログラマー".equals(job)) {

        }


    }

    @Override
    public void learnIfSyntax2() {

        System.out.println("正しいのはC、D、Eです。");

    }

    @Override
    public void learnIfStatement1() {

        int age = 30;

        java.util.Random rnd = new java.util.Random();
        int sex = rnd.nextInt(2);

        System.out.println("こんにちは");

        if (sex == 0) {
            System.out.println("私は男です");
        } else {
            System.out.println("私は女です");
        }

        if (sex == 0) {
            System.out.println(age + "歳です");
        }

        System.out.println("よろしくお願いします");

    }

    // 問４
    // 下記のような実装が行われている
    // weatherがfalseの場合、「家でゲーム」の後に「寝る」と表示
    // のつもりで書いたが意図したように動かない
    // 正しく動くように修正せよ
    @Override
    public void learnIfStatement2() {
        System.out.print("今日の天気は？(0:晴れ 1:くもり 2:雨) > ");
        boolean weather = new java.util.Scanner(System.in).nextInt() == 0;
        if (weather) {
            System.out.println("洗濯をする");
            System.out.println("彼女or彼氏とデート");
        } else {
            System.out.println("家でゲーム");
            System.out.println("寝る");
        }
    }

    @Override
    public void learnSwitchStatement() {

        System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更 >");
        String selectedStr = new java.util.Scanner(System.in).next();
        int selected = Integer.parseInt(selectedStr);

        switch (selected) {

            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
            default:
                System.out.println("メニューにありません");

        }
    }

    @Override
    public void countGame() {

        System.out.println("【数当てゲーム】");
        java.util.Random rnd = new java.util.Random();
        int answer = rnd.nextInt(10);

        for (int i = 1; i <= 5; i++) {
            System.out.println("0 ～ 9 の数字を入力してください");

            String numStr = new java.util.Scanner(System.in).next();
            int num = Integer.parseInt(numStr);

            if (num == answer) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("ハズレ！");
            }

        }

        System.out.println("ゲームを終了します");
    }
}
