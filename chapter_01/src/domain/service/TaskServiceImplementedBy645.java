package domain.service;

/**
 * 課題実装部
 */
public class TaskServiceImplementedBy645 implements ITask {
    // 問１
    @Override
    public void learnJavaMechanism() {
        System.out.println("JavaプログラムはJavaバイトコードと呼ばれる中間言語（中間表現）にコンパイルされて、");
        System.out.println("Java仮想マシンと呼ばれるソフトウェア上で実行される。");
        System.out.println("各コンピュータ環境に対応したJava仮想マシンがハードウェア間の差異を吸収し、");
        System.out.println("特定の環境に依存しないプログラム動作を実現する仕組みとなっている。");


    }

    // 問２
    @Override
    public void learnVariable() {
        int x = 3 ;
        int y = 5 ;
        int z = x*y;
        System.out.println("縦幅" + x + "横幅 "+ y +" の長方形の面積は、"+ z );

    }

    // 問３
    @Override
    public void learnConstant() {

        double TAX = 1.08;
        int a = 100;
        double b = a * TAX ;
        System.out.println("商品お買い上げありがとうございます。"+ (int)b +"円になります");
    }

    // 問４
    @Override
    public void learnDataType() {
        boolean c = true;
        char d = '侍';
        double e = 3.14;
        long f = 314159265853979L;
        String g = "為せば成る 為さねば成らぬ 何事も 成らぬは人の 為さぬなりけり";
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


    }
}
