package domain.service.student506;

public abstract class ALife implements ILife {

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
        Kicker kc = new Kicker(2,1);
        Keeper kp = new Keeper(0,1);

        // ２分の１の確率でイベントが発生する
        java.util.Random rnd = new java.util.Random();
        int result = rnd.nextInt(1);

        boolean kickerWin = true;
        int eventPoint = 0;
        int kickerPoint = 0;
        int keeperPoint = 0;

        if (result == 1) {
            // イベント発生
            System.out.println("イベント発生");

            // イベントの種類はLuckOfTimeからランダムで決定する。
            int event = rnd.nextInt(1);

            AnEvent evt = new AnEvent();

            if (event == 0) {
                System.out.println("勝利の女神イベント");
                eventPoint = evt.GoddessOfVictory();
            } else {
                System.out.println("運命の悪戯イベント");
                kickerWin = evt.FatefulMischief(kc.getOffensivePower() - kc.getDefensivePower(),kp.getOffensivePower() - kp.getDefensivePower());

                // ポイント計算による判定は行わず、勝敗を返却する
                if (kickerWin) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        // キッカーとしてスキルを使用するか選択する。
        System.out.println("スキルを使用しますか？使用する場合：Yを入力");
        String key = new java.util.Scanner(System.in).next();

        // キッカーのスキル使用
        if ("Y".equals(key)) {
            kc.skill();
        }

        // キーパーのスキル使用判定
        int keeperSkill = rnd.nextInt(1);

        // キーパーのスキル使用
        if (1 == keeperSkill) {
            kp.skill();
        }

        // ポイント計算
        kickerPoint = kc.getOffensivePower() - kp.getDefensivePower() + eventPoint;
        keeperPoint = kp.getDefensivePower() - kc.getOffensivePower() + eventPoint;

        if (kickerPoint > keeperPoint) {
            return true;
        } else {
            return false;
        }

    }

    public void epilogue() {

        // シーンメソッドの結果によってエンディングを２パターン用意する。
        if (scene()) {
            System.out.println("僕のPKが決まり、チャンピオンズカップ決勝に勝利した。");
            System.out.println("優勝することができて、最高の気分だ！");
            System.out.println("まだまだたくさん練習して世界最高の選手を目指す！");
        } else {
            System.out.println("僕のPKは惜しくもキーパーに止められてしまった。");
            System.out.println("悔しいけど僕よりキーパーの実力が上だったということ。");
            System.out.println("次に必ずリベンジできるように練習だ！");
        }

    }
}
