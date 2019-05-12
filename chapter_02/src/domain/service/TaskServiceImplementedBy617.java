package domain.service;

public class TaskServiceImplementedBy617 implements ITask {
    @Override
    public void learnOperatorPriority() {
        int x = 2;
        int y = 3;
        String answer = "x + y = " + (x + y);
        System.out.println(answer);
    }

    @Override
    public void learnTypeConversion() {
        String answer ="「正しい文は②,④,⑤,⑦です」";
        System.out.println(answer);
    }

    @Override
    public void fortuneGame() {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        java.util.Scanner sc1 = new java.util.Scanner(System.in);
        String name = sc1.next();
        System.out.print("あなたの年齢を入力してください");
        java.util.Scanner sc2 = new java.util.Scanner(System.in);
        String ageString = sc2.next();
        int age = Integer.parseInt(ageString);
        java.util.Random rnd = new java.util.Random();
        int fortune = rnd.nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");
    }
}
