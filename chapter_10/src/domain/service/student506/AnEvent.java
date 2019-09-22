package domain.service.student506;

public class AnEvent {

    public enum LuckOfTime {
        Goddess_of_Victory,
        Fateful_Mischef
    }

    public static int GoddessOfVictory() {

        return 5;
    }

    public static boolean FatefulMischief(int kickerPoint, int keeperPoint) {

        //運命の悪戯。勝利条件をポイント累積結果ではなく、キッカーとキーパーのポイント累積結果を合計して、
        // 合計が奇数ならキッカーの勝利、偶数ならキーパーの勝利とする。
        int goukeiPoint = kickerPoint + keeperPoint;

        if (goukeiPoint % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
