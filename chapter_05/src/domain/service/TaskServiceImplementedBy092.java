package domain.service;

import java.util.Scanner;

public class TaskServiceImplementedBy092 implements ITask {
    // 問１
    // 下記のメソッドを作成せよ
    // 適用範囲  ：private
    // メソッド名：selfIntroduction
    // 戻り値    ：なし
    // 引数      ：なし
    // 処理内容  ：名前、年齢、身長、性別(男/女)を入力させ、入力値をそれぞれ変数に格納して結果を画面に表示
    // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと
    @Override
    public void learnMethod1() {
        selfIntroduction();
    }

    /**
     * 自己紹介関数
     */
    private void selfIntroduction() {
        System.out.print("名前を入力してください。 > ");
        String name = new Scanner(System.in).next();

        System.out.print("年齢を入力してください。 > ");
        String inputAge = new Scanner(System.in).next();
        if (!isNumericInt(inputAge)) {
            return;
        }
        int age = Integer.parseInt(inputAge);

        System.out.print("身長を入力してください。 > ");
        String inputHeight = new Scanner(System.in).next();
        if (!isNumericFloat(inputHeight)) {
            return;
        }
        float height = Float.parseFloat(inputHeight);

        System.out.print("性別(男/女)を入力してください。 > ");
        String sex = new Scanner(System.in).next();
        if (!sex.equals("男") && !sex.equals("女")) {
            System.out.println("男か女で入力してください。");
            return;
        }

        System.out.println("[結果]");
        System.out.println("名前：" + name + "さん");
        System.out.println("年齢：" + age + "歳");
        System.out.println("身長：" + height + "cm");
        System.out.println("性別：" + sex);
    }

    /**
     * 整数判定関数
     * @param value 判定する値
     * @return 整数ならtrue、それ以外はエラー表示後、falseを返す
     */
    private boolean isNumericInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            System.out.println("整数で入力してください。");
            return false;
        }
    }

    /**
     * 数値判定関数
     * @param value 判定する値
     * @return 数値ならtrue、それ以外はエラー表示後、falseを返す
     */
    private boolean isNumericFloat(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (Exception e) {
            System.out.println("数値(少数OK)で入力してください。");
            return false;
        }
    }

    // 問２
    // 下記のメソッドを作成せよ
    // 適用範囲  ：private
    // メソッド名：multiplication
    // 戻り値    ：なし
    // 引数      ：１から９の整数
    // 処理内容  ：引数で受け取った数字の段の九九を画面に表示
    // 九九の結果を配列に格納した後で結果を表示すること
    // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと
    @Override
    public void learnMethod2() {
        System.out.println("引数で受け取った数字で九九を表示します。");
        System.out.print("１から９の整数を入力してください。 > ");
        String inputValue = new Scanner(System.in).next();
        if (!isLearnMethod2Validation(inputValue)) {
            return;
        }
        multiplication(inputValue);
    }

    /**
     * 問２の検証関数
     * @param value 判定する値
     * @return 検証ＯＫならTure、検証ＮＧならfalseを返す
     */
    private boolean isLearnMethod2Validation(String value) {
        if (!isNumericInt(value)) {
            return false;
        }
        int v = Integer.parseInt(value);
        final int RANGE_MIN = 1;
        final int RANGE_MAX = 9;
        return isRangeIn(v, RANGE_MIN, RANGE_MAX);
    }

    /**
     * 範囲内判定関数
     * @param value 判定する値
     * @param rangeMin 最小範囲
     * @param rangeMax 最大範囲
     * @return 範囲内ならtrue、範囲外ならfalseを返す
     */
    private boolean isRangeIn(int value, int rangeMin, int rangeMax) {
        if (value < rangeMin || value > rangeMax) {
            System.out.println(rangeMin + "から" + rangeMax + "の範囲の整数で入力してください。");
            return false;
        }
        return true;
    }

    /**
     * 九九表示関数
     * @param value 掛け算の段（１の段から９の段まで）
     */
    private void multiplication(String value) {
        final int ELEMENT_COUNT = 9;
        // 掛ける数
        int multiplier = Integer.parseInt(value);
        int[] answers = new int[ELEMENT_COUNT];
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            answers[i] = multiplier * (i + 1);
        }
        // 掛けられる数
        int multiplicand = 0;
        for (int answer : answers) {
            multiplicand++;
            System.out.println(multiplier + " × " + multiplicand + " = " + answer);
        }
    }

    // 問３
    // 下記のメソッドを作成せよ
    // 適用範囲  ：private
    // メソッド名：yearToEra
    // 戻り値    ：元号
    // 引数      ：西暦(1900-2020)
    // 処理内容  ：西暦を入力させ、その年の元号を表示
    // 西暦別の年号は下記の通りとする
    // 1911年まで:明治, 1925年まで:大正, 1988年まで:昭和, 2018年まで:平成, 2019年以降:令和
    // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと
    @Override
    public void learnMethod3() {
        System.out.println("引数で受け取った西暦の元号を判定します。");
        System.out.print("西暦(1900-2020)を入力してください。 > ");
        String inputValue = new Scanner(System.in).next();
        String era = yearToEra(inputValue);
        if (era != null) {
            System.out.println(inputValue + "年の元号は" + era + "です。");
        }
    }

    /**
     * 問３の検証関数
     * @param value 判定する値
     * @return 検証ＯＫならTure、検証ＮＧならfalseを返す
     */
    private boolean isLearnMethod3Validation(String value) {
        if (!isNumericInt(value)) {
            return false;
        }
        int v = Integer.parseInt(value);
        final int RANGE_MIN = 1900;
        final int RANGE_MAX = 2020;
        return isRangeIn(v, RANGE_MIN, RANGE_MAX);
    }

    /**
     * 西暦→年号変換関数
     * @param value 判定する値
     * @return 西暦を判定して年号を返す。正常に判定できない場合、nullを返す
     */
    private String yearToEra(String value) {
        if (!isLearnMethod3Validation(value)) {
            return null;
        }
        int year = Integer.parseInt(value);
        String era;
        final int MEIJI = 1911;
        final int TAISHO = 1925;
        final int SHOWA = 1988;
        final int HEISEI = 2018;
        if (year <= MEIJI) {
            era = "明治";
        } else if (year <= TAISHO) {
            era = "大正";
        } else if (year <= SHOWA) {
            era = "昭和";
        } else if (year <= HEISEI) {
            era = "平成";
        } else {
            era = "令和";
        }
        return era;
    }

    // 問４
    // 下記のメソッドを作成せよ
    // 適用範囲  ：private
    // メソッド名：taxCalculation
    // 戻り値    ：なし
    // 引数      ：西暦(1900-2020), 商品価格
    // 処理内容  ：西暦、商品の価格を入力させ、その年の元号、消費税率、消費税を加味した代金を表示
    // 西暦別の消費税は下記の通りとする
    // 1988年まで:0%, 1989年以降:3%, 1997年以降:5%, 2014年以降:8%, 2019年以降:10%
    // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと
    @Override
    public void learnMethod4() {
        System.out.println("引数で受け取った西暦の元号及び消費税を判定します。");
        System.out.print("西暦(1900-2020)を入力してください。 > ");
        String year = new Scanner(System.in).next();
        System.out.print("商品価格を入力してください。 > ");
        String price = new Scanner(System.in).next();
        taxCalculation(year, price);
    }

    /**
     * 西暦、商品の価格を入力させ、その年の元号、消費税率、消費税を加味した代金を表示する関数
     * @param year 西暦
     * @param price 商品価格
     */
    private void taxCalculation(String year, String price) {
        String era = yearToEra(year);
        if (era == null) {
            System.out.println("西暦入力が誤っています。");
            return;
        }
        Float tax = getTax(year);
        if (tax == null) {
            System.out.println("西暦入力が誤っています。");
            return;
        }
        if (!isNumericInt(price)) {
            System.out.println("商品価格入力が誤っています。");
            return;
        }
        int taxPercent = (int) (tax * 100);
        int cost = (int) (Integer.parseInt(price) + (Integer.parseInt(price) * tax));
        System.out.println("[結果]");
        System.out.println("西暦：" + year + "年");
        System.out.println("元号：" + era);
        System.out.println("価格：" + price + "円");
        System.out.println("税率：" + taxPercent + "%");
        System.out.println("税込：" + cost + "円");
    }

    /**
     * 消費税取得関数
     * @param year 西暦
     * @return 入力した西暦を判定して消費税を返す、エラー時はnullを返す
     */
    private Float getTax(String year) {
        if (!isNumericInt(year)) {
            return null;
        }
        // 1988年まで:0%, 1989年以降:3%, 1997年以降:5%, 2014年以降:8%, 2019年以降:10%
        final int TAX10_START_YEAR = 2019;
        final int TAX8_START_YEAR = 2014;
        final int TAX5_START_YEAR = 1997;
        final int TAX3_START_YEAR = 1989;
        final Float TAX10 = 0.1F;
        final Float TAX8 = 0.08F;
        final Float TAX5 = 0.05F;
        final Float TAX3 = 0.03F;
        final Float TAX_FREE = 0F;
        int y = Integer.parseInt(year);
        if (y >= TAX10_START_YEAR) {
            return TAX10;
        } else if (y >= TAX8_START_YEAR) {
            return TAX8;
        } else if (y >= TAX5_START_YEAR) {
            return TAX5;
        } else if (y >= TAX3_START_YEAR) {
            return TAX3;
        } else {
            return TAX_FREE;
        }
    }

    // 問５
    // 下記のメソッドを作成せよ
    // 適用範囲  ：private
    // メソッド名：yourName
    // 戻り値    ：任意
    // 引数      ：任意
    // 処理内容  ：オーバーロードの概念を用いてそれぞれ下記の処理を実装せよ
    // 1. 君の名は何回見た？と質問 → 映画「君の名は」を見た回数を表示
    // 2. 君の名は？と質問 → 私は〇〇です。と表示
    // 変数の型はふさわしいものを定義すること、最低限の入力チェックは行うこと
    @Override
    public void learnMethod5() {
        System.out.print("君の名は何回見た？ > ");
        String value = new Scanner(System.in).next();
        if (!isNumericInt(value)) {
            return;
        }
        int watchingTimes = Integer.parseInt(value);
        yourName(watchingTimes);

        System.out.print("君の名は？ > ");
        String name = new Scanner(System.in).next();
        yourName(name);
    }

    /**
     * 映画「君の名は」の視聴回数を表示する
     * @param watchingTimes 視聴回数
     */
    private void yourName(int watchingTimes) {
        System.out.println("自慢じゃないが、もう" + watchingTimes + "回は見たね！");
    }

    /**
     * 名前を表示する
     * @param name 名前
     */
    private void yourName(String name) {
        System.out.println("私の名は" + name + "です。");
    }
}
