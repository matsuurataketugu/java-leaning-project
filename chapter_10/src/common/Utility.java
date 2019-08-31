package common;

public class Utility {
    /**
     * 整数型の乱数を取得する
     * @param until 乱数の範囲 例）100なら1から100までの乱数を生成
     * @return 乱数
     */
    public static int getRandom(int until) {
        return new java.util.Random().nextInt(until) + 1;
    }

    /**
     * 真偽値型の乱数を取得する
     * @return true/false
     */
    public static boolean getRandom() {
        return new java.util.Random().nextBoolean();
    }
}
