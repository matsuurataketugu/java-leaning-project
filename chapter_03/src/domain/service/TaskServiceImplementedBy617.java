package domain.service;

public class TaskServiceImplementedBy617 implements ITask {
    @Override
    public void learnIfSyntax1() {

    }

    @Override
    public void learnIfSyntax2() {

    }

    @Override
    public void learnIfStatement1() {

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
        } else
            System.out.println("家でゲーム");
        System.out.println("寝る");
    }

    @Override
    public void learnSwitchStatement() {

    }

    @Override
    public void countGame() {

    }
}
