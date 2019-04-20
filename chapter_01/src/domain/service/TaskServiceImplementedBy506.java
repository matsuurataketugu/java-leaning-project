package domain.service;

/**
 * 課題実装部
 */
public class TaskServiceImplementedBy506 implements ITask {
    // 問１
    @Override
    public void learnJavaMechanism() {
        System.out.print("JavaプログラムはJavaバイトコードと呼ばれる");
        System.out.print("中間言語（中間表現）にコンパイルされて、Java");
        System.out.print("仮想マシンと呼ばれるソフトウェア上で実行される。");
        System.out.print("各コンピュータ環境に対応したJava仮想マシンが");
        System.out.print("ハードウェア間の差異を吸収し、特定の環境に");
        System.out.println("依存しないプログラム動作を実現する仕組みとなっている。");
    }

    // 問２
    @Override
    public void learnVariable() {
        int x = 3;
        int y = 5;
        int z = x * y;

        System.out.println("縦幅 " + x + " 横幅 " + y + " の長方形の面積は、" + z);

    }

    // 問３
    @Override
    public void learnConstant() {
        final double TAX = 1.08;
        int money = 100;
        double price = money * TAX;
        System.out.println("商品お買い上げありがとうございます。" + (int)price + "円になります。");
    }

    // 問４
    @Override
    public void learnDataType() {
        boolean flg = true;
        char moji = '侍';
        double num1 = 3.14;
        long num2 = 314159265853979L;
        String str1 = "為せば成る 為さねば成らぬ 何事も 成らぬは人の 為さぬなりけり";

        System.out.println(flg);
        System.out.println(moji);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str1);

    }
}
