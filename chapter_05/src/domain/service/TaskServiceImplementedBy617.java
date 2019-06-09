package domain.service;

import java.math.BigDecimal;

public class TaskServiceImplementedBy617 implements ITask {
    @Override
    public void learnMethod1() {
        selfIntroduction();
    }
        private void selfIntroduction () {
            System.out.println("名前を入力してください");
            String name = new java.util.Scanner(System.in).next();

            System.out.println("年齢を入力してください");
            String ageString= new java.util.Scanner(System.in).next();
            int age = Integer.parseInt(ageString);

            System.out.println("身長を記載入力してください");
            String heightString= new java.util.Scanner(System.in).next();
            double height = Double.parseDouble(heightString);

            System.out.println("性別(男/女)を入力してください");
            String sex = new java.util.Scanner(System.in).next();

            System.out.println("名前は"+ name + "です");
            System.out.println("年齢は"+ age + "歳です");
            System.out.println("身長は"+ height + "cmです");
            System.out.println("性別は"+ sex + "です");

        }



    @Override
    public void learnMethod2() {
        System.out.println("何の段の九九を表示しますか？");
        String numString = new java.util.Scanner(System.in).next();
        int num = Integer.parseInt(numString);
        multiplication(num);
    }

        private void multiplication(int number) {

            int results[] = new int[9];

            if (number == 0 || number > 9) {
                System.out.println("九九にはない数字です");
                return;
            }

            for (int i = 0; i < 9; i++) {
                results[i] = number * (i + 1);
            }

            int j = 1;

            for (int value : results) {

                System.out.println(number + "*" + (j) + "=" + value);
                j++;
            }
        }



    @Override
    public void learnMethod3() {
        System.out.println("西暦を入力してください");
        String yearString = new java.util.Scanner(System.in).next();
        int year = Integer.parseInt(yearString);
        System.out.println("元号は" + yearToEra(year) + "です");
    }

    private String yearToEra (int year) {

        String era = "";
        final int MIN_YEAR = 1900;
        final int MAX_YEAR = 2020;
        final int LAST_MEIJI_YEAR = 1911;
        final int FIRST_TAISYO_YEAR = 1912;
        final int LAST_TAISYO_YEAR = 1925;
        final int FIRST_SYOWA_YEAR = 1926;
        final int LAST_SYOWA_YEAR = 1988;
        final int FIRST_HEISEI_YEAR = 1989;
        final int LAST_HEISEI_YEAR = 2018;
        final int FIRAT_REIWA_YEAR = 2019;

        if (year < MIN_YEAR || year > MAX_YEAR) {
            System.out.println("入力範囲が正しくありません。1900年～2020年の間で入力してください");
            return "該当なし";
        }

        if (year >= MIN_YEAR && year <= LAST_MEIJI_YEAR) {
            era = "明治";
        } else if (year >= FIRST_TAISYO_YEAR && year <= LAST_TAISYO_YEAR) {
            era = "大正";
        } else if (year >= FIRST_SYOWA_YEAR && year <= LAST_SYOWA_YEAR) {
            era = "昭和";
        } else if (year >= FIRST_HEISEI_YEAR && year <= LAST_HEISEI_YEAR) {
            era = "平成";
        } else if (year >= FIRAT_REIWA_YEAR) {
            era = "令和";
        }

        return era;

    }


    @Override
    public void learnMethod4() {
        System.out.println("西暦を入力してください。");
        String yearString = new java.util.Scanner(System.in).next();
        int year = Integer.parseInt(yearString);

        System.out.println("価格を入力してください。");
        String priceString = new java.util.Scanner(System.in).next();
        int price = Integer.parseInt(priceString);

        taxCalculation(year,price);

    }

    private void taxCalculation(int year, int price) {

        String era = "";
        int tax = 0;
        final int ZERO_CONSUMPTION_TAX_RATE = 0;
        final int THREE_CONSUMPTION_TAX_RATE = 3;
        final int FIVE_CONSUMPTION_TAX_RATE = 5;
        final int EIGHT_CONSUMPTION_TAX_RATE = 8;
        final int TEN_CONSUMPTION_TAX_RATE = 10;

        final double THREE_CONSUMPTION_TAX_INCLUDED = 1.03;
        final double FIVE_CONSUMPTION_TAX_INCLUDED = 1.05;
        final double EIGHT_CONSUMPTION_TAX_INCLUDED = 1.08;
        final double TEN_CONSUMPTION_TAX_INCLUDED = 1.10;

        double resultPrice = price;

        if (year < 1900 || year > 2020) {
            System.out.println("入力範囲が正しくありません。1990年～2020年の間で入力してください");
            return;
        }

        era = yearToEra(year);

        if (year >= 1900 && year <= 1988) {
            tax = ZERO_CONSUMPTION_TAX_RATE;
            resultPrice = price;
        } else if (year >= 1989 && year <= 1996) {
            tax = THREE_CONSUMPTION_TAX_RATE;
            resultPrice = price * THREE_CONSUMPTION_TAX_INCLUDED;
        } else if (year >= 1997 && year <= 2013) {
            tax = FIVE_CONSUMPTION_TAX_RATE;
            resultPrice = price * FIVE_CONSUMPTION_TAX_INCLUDED;
        } else if (year >= 2014 && year <= 2018) {
            tax = EIGHT_CONSUMPTION_TAX_RATE;
            resultPrice = price * EIGHT_CONSUMPTION_TAX_INCLUDED;
        } else if (year >= 2019) {
            tax = TEN_CONSUMPTION_TAX_RATE;
            resultPrice = price * TEN_CONSUMPTION_TAX_INCLUDED;
        }

        String strPrice = String.valueOf(resultPrice);
        BigDecimal bd = new BigDecimal(strPrice);
        BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_DOWN);

        System.out.println("元号：" + era + "、消費税率：" + tax + "%、代金：" + bd1 + "円");


    }


    @Override
    public void learnMethod5() {
            System.out.println("君の名は何回見た？");
            String numString = new java.util.Scanner(System.in).next();
            try {
                int num = Integer.parseInt(numString);
                yourName(num);
            } catch (NumberFormatException n){
                System.out.println("数字を入力してください");
            }

            System.out.println("君の名は？");
            String name = new java.util.Scanner(System.in).next();
            yourName(name);
            }

        private void yourName(int num) {
            System.out.println(num + "回");
        }

        private void yourName(String name) {
            System.out.println("私は" + name + "です");

        }
}

