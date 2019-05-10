package domain.service;

public class TaskServiceImplementedBy506 implements ITask {
    @Override
    public void learnOperatorPriority() {
        int x = 2;
        int y = 3;
        int result = x + y;
        String answer = "x + y = ";
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(answer + result);
    }

    @Override
    public void learnTypeConversion() {
        System.out.println("正しい文は②, ⑤, ⑦です。");
    }

    @Override
    public void fortuneGame() {

        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください：");
        String name = new java.util.Scanner(System.in).next();

        System.out.print("あなたの年齢を入力してください：");
        String ageString = new java.util.Scanner(System.in).next();
        int age = Integer.parseInt(ageString);

        java.util.Random rnd = new java.util.Random();
        int fortune = rnd.nextInt(3);
        fortune++;

        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");

    }
}
