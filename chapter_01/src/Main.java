import controller.MainController;

public class Main {
    public static void main(String[] args) {

        MainController.run();
        // 問１
        // Java WikipediaのサイトからJavaの仕組みをコンソールに出力せよ。
        // なお、出力する文章は「Javaプログラムは～～仕組みとなっている。」の部分とする。
        System.out.println("JavaプログラムはJavaバイトコードと呼ばれる中間言語（中間表現）にコンパイルされて、");
        System.out.println("Java仮想マシンと呼ばれるソフトウェア上で実行される。");
        System.out.println("各コンピュータ環境に対応したJava仮想マシンがハードウェア間の差異を吸収し、");
        System.out.println("特定の環境に依存しないプログラム動作を実現する仕組みとなっている。");


        // 画面に３×５を表示するコードを作成せよ。
        // ロジック内で変数 x に３、変数 y に５、変数 z に解を設定して下記のように表示すること。
        // 縦幅 3 横幅 5 の長方形の面積は、15
        int x = 3 ;
        int y = 5 ;
        int z = x*y;
        System.out.println("縦幅" + x + "横幅 "+ y +" の長方形の面積は、"+ z );

        // １００円の商品を買ったときに支払う料金を表示するコードを作成せよ。
        // 消費税率は８％で、定数名は TAX と定義すること。
        double TAX = 1.08;
        int a = 100;
        double b = a * TAX ;
        System.out.println("商品お買い上げありがとうございます。"+ (int)b +"円になります");


        // 以下に示した値を格納するために適した型を考え定義して表示せよ。
        // 格納用の変数名は任意とする。(ただしJavaのルールに従うこと)
        // ２つ以上の型が考えられる場合は、どちらでも良いこととする。
        // 1. true
        // 2. '侍'
        // 3. 3.14
        // 4. 314159265853979L
        // 5. "為せば成る 為さねば成らぬ 何事も 成らぬは人の 為さぬなりけり"

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
