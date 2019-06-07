package domain.service;

import java.math.BigDecimal;

public class TaskServiceImplementedBy506 implements ITask {
    @Override
    public void learnMethod1() {

        selfIntroduction();

    }

    private void selfIntroduction() {

        System.out.println("名前を入力してください >");
        String name = new java.util.Scanner(System.in).next();

        System.out.println("年齢を入力してください >");
        String ageString = new java.util.Scanner(System.in).next();
        int age = Integer.parseInt(ageString);

        System.out.println("身長を入力してください >");
        String sizeString = new java.util.Scanner(System.in).next();
        double size = Double.parseDouble(sizeString);

        System.out.println("性別(男/女)を入力してください >");
        String sex = new java.util.Scanner(System.in).next();

        if ("男".equals(sex) || "女".equals(sex)) {

        } else {
            System.out.println("性別が正しく入力されていません。");
            return;
        }
        System.out.println("名前は" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + size + "cmです。");
        System.out.println("性別は" + sex + "です。");

    }

    @Override
    public void learnMethod2() {

        System.out.println("九九を表示します。何の段を表示しますか？");
        String numString = new java.util.Scanner(System.in).next();
        try {
            int num = Integer.parseInt(numString);
            multiplication(num);
        } catch (NumberFormatException e) {
            System.out.println("数字以外が入力されました。");
        }

    }

    private void multiplication(int number) {

        int results[] = new int[9];

        if (number == 0 || number > 9) {
            System.out.println("九九がない数字です。");
            return;
        }

        for (int i = 0; i < 9; i++) {
            results[i] = number * (i + 1);
        }

        int j = 1;

        for (int value : results) {

            System.out.println(number + "×" + (j) + " = " + value);
            j++;
        }

    }

    @Override
    public void learnMethod3() {

        System.out.println("西暦を入力してください。");
        String yearString = new java.util.Scanner(System.in).next();
        try {
            int year = Integer.parseInt(yearString);
            System.out.println("元号は" + yearToEra(year) + "です");
        } catch (NumberFormatException e) {
            System.out.println("数字以外が入力されました。");
        }

    }

    private String yearToEra (int year) {

        String gengou = "";
        final int MIN_YEAR = 1900;
        final int MAX_YEAR = 2020;
        final int LAST_MEIJI_YEAR = 1911;
        final int FIRST_TAISYO_YEAR = 1912;
        final int LAST_TAISYO_YEAR = 1925;
        final int FIRST_SYOWA_YEAR = 1926;
        final int LAST_SYOWA_YEAR = 1988;
        final int FIRST_HEISEI_YEAR = 1989;
        final int LAST_HEISEI_YEAR = 2018;
        final int FIRST_REIWA_YEAR = 2019;

        if (year < MIN_YEAR || year > MAX_YEAR) {
            System.out.println("入力範囲が正しくありません。");
            return "該当なし";
        }

        if (year >= MIN_YEAR && year <= LAST_MEIJI_YEAR) {
            gengou = "明治";
        } else if (year >= FIRST_TAISYO_YEAR && year <= LAST_TAISYO_YEAR) {
            gengou = "大正";
        } else if (year >= FIRST_SYOWA_YEAR && year <= LAST_SYOWA_YEAR) {
            gengou = "昭和";
        } else if (year >= FIRST_HEISEI_YEAR && year <= LAST_HEISEI_YEAR) {
            gengou = "平成";
        } else if (year >= FIRST_REIWA_YEAR) {
            gengou = "令和";
        }

        return gengou;

    }

    @Override
    public void learnMethod4() {

        try {
            System.out.println("西暦を入力してください。");
            String yearString = new java.util.Scanner(System.in).next();
            int year = Integer.parseInt(yearString);

            System.out.println("価格を入力してください。");
            String priceString = new java.util.Scanner(System.in).next();
            int price = Integer.parseInt(priceString);

            taxCalculation(year,price);
        } catch (NumberFormatException e) {
            System.out.println("数字以外が入力されました。");
        }

    }

    private void taxCalculation(int year, int price) {

        String gengou = "";
        int tax = 0;
        final int TAX_ZERO_PERSENT = 0;
        final int TAX_THREE_PERSENT = 3;
        final int TAX_FIVE_PERSENT = 5;
        final int TAX_EIGHT_PERSENT = 8;
        final int TAX_TEN_PERSENT = 10;

        final double TAX_DOUBLE_THREE_PERSENT = 1.03;
        final double TAX_DOUBLE_FIVE_PERSENT = 1.05;
        final double TAX_DOUBLE_EIGHT_PERSENT = 1.08;
        final double TAX_DOUBLE_TEN_PERSENT = 1.10;

        double resultPrice = price;

        if (year < 1900 || year > 2020) {
            System.out.println("入力範囲が正しくありません。");
            return;
        }

        if (price <= 0) {
            System.out.println("価格の入力が正しくありません。");
            return;
        }

        gengou = yearToEra(year);

        if (year >= 1900 && year <= 1988) {
            tax = TAX_ZERO_PERSENT;
            resultPrice = price;
        } else if (year >= 1989 && year <= 1996) {
            tax = TAX_THREE_PERSENT;
            resultPrice = price * TAX_DOUBLE_THREE_PERSENT;
        } else if (year >= 1997 && year <= 2013) {
            tax = TAX_FIVE_PERSENT;
            resultPrice = price * TAX_DOUBLE_FIVE_PERSENT;
        } else if (year >= 2014 && year <= 2018) {
            tax = TAX_EIGHT_PERSENT;
            resultPrice = price * TAX_DOUBLE_EIGHT_PERSENT;
        } else if (year >= 2019) {
            tax = TAX_TEN_PERSENT;
            resultPrice = price * TAX_DOUBLE_TEN_PERSENT;
        }

        String strPirce = String.valueOf(resultPrice);
        BigDecimal bd = new BigDecimal(strPirce);
        BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_DOWN);

        System.out.println("元号：" + gengou + "、消費税率：" + tax + "%、代金：" + bd1 + "円");

    }

    @Override
    public void learnMethod5() {

        System.out.println("君の名は何回見た？");
        String numString = new java.util.Scanner(System.in).next();
        try {
            int num = Integer.parseInt(numString);
            yourName(num);
        } catch (NumberFormatException e) {
            System.out.println("数字以外が入力されました。");
        }

        System.out.println("君の名は？");
        String name = new java.util.Scanner(System.in).next();

        yourName(name);

    }

    private void yourName(int num) {

        System.out.println(num + "回");

    }

    private void yourName(String name) {

        System.out.println("私は" + name + "です。");

    }
}
