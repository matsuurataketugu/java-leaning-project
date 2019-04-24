package domain.service;

/**
 * 課題実装部
 */
public class TaskServiceImplementedBy617 implements ITask {
    // 問１
    @Override
    public void learnJavaMechanism() {
        System.out.println("JavaプログラムはJavaバイトコードと呼ばれる中間言語（中間表現）にコンパイルされて、" +
                "Java仮想マシンと呼ばれるソフトウェア上で実行される。" +
                "各コンピュータ環境に対応したJava仮想マシンがハードウェア間の差異を吸収し、" +
                "特定の環境に依存しないプログラム動作を実現する仕組みとなっている。");
    }

    // 問２
    @Override
    public void learnVariable() {
            int x = 3;
            int y = 5;
            char z = '解';
            String answer = "縦幅 3 横幅 5 の長方形の面積は、 " + (x * y);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println(answer);
    }

    // 問３
    @Override
    public void learnConstant() {
        final double TAX = 1.08;
        final int price = 100;
        double cost = price * TAX ;
        System.out.println("商品お買い上げありがとうございます。"+ cost +"円になります");
    }


    // 問４
    @Override
    public void learnDataType() {
         boolean flag = true;
         char moji =  '侍';
         double pi = 3.14;
         long  number = 314159265853979L;
         String moji2 = "為せば成る 為さねば成らぬ 何事も 成らぬは人の 為さぬなりけり";
         System.out.println(flag);
         System.out.println(moji);
         System.out.println(pi);
         System.out.println(number);
         System.out.println(moji2);
    }
}
