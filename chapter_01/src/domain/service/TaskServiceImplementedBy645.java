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
        int z = x * y;
        System.out.println("縦幅" + x + "横幅 "+ y +" の長方形の面積は、"+ z );

    }

    // 問３
    @Override
    public void learnConstant() {

        double TAX = 0.08;
        int price = 100;
        double priceTax = price * TAX ;
        int total = (int)priceTax + price;
        System.out.println("商品お買い上げありがとうございます。"+ total+"円になります");
    }

    // 問４
    @Override
    public void learnDataType() {
        boolean flg = true;
        char moji = '侍';
        double syosu = 3.14;
        long suuretu = 314159265853979L;
        String mojiretu = "為せば成る 為さねば成らぬ 何事も 成らぬは人の 為さぬなりけり";
        System.out.println(flg);
        System.out.println(moji);
        System.out.println(syosu);
        System.out.println(suuretu);
        System.out.println(mojiretu);


    }
}
