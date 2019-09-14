package domain.service.student506;

public class ALife implements ILife {

    public void story() {

        System.out.println("とうとう僕はプロサッカー選手になった！");
        System.out.println("そして今、チャンピオンズカップ決勝の舞台に立っている。 ");
        System.out.println("試合は最後までもつれ込みＰＫになった。 ");
        System.out.println("最後のキッカーは僕だ。");
        System.out.println("これを決めれば優勝だ！");
        System.out.println("いざ、勝負！");

    }

    public boolean scene() {

        // キッカーとキーパーのそれぞれのクラスを用意する。
        Kicker kc = new Kicker();
        Keeper kp = new Keeper();

        // ２分の１の確率でイベントが発生する
        java.util.Random rnd = new java.util.Random();
        int result = rnd.nextInt(1);

        if (result == 1) {
            // イベント発生
            // イベントの種類はLuckOfTimeからランダムで決定する。
            // このあたりから詰まっています。AnEventクラスの用途やどのクラスからどの処理を呼ぶかなど。クラスは全クラス作るだけ作りましたが・・・

        }

        return true;

    }

    public void epilogue() {

        // シーンメソッドの結果によってエンディングを２パターン用意する。(内容はひとまず後回し)
        if (scene()) {
            System.out.println("Aパターン");
        } else {
            System.out.println("Bパターン");
        }

    }
}
