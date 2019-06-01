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
        int size = Integer.parseInt(sizeString);

        System.out.println("性別(男/女)を入力してください >");
        String sex = new java.util.Scanner(System.in).next();

        if ("".equals(name) || "".equals(ageString) || "".equals(sizeString) || "".equals(sex)) {
            System.out.println("入力されていない項目があります。");
            return;
        }
        System.out.println("名前は" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + size + "cmです。");
        System.out.println("性別は" + sex + "です。");

    }

    @Override
    public void learnMethod2() {

        multiplication(2);

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

        for (int j = 0; j < 9; j++) {
            results[j] = number * (j + 1);
            System.out.println(number + "×" + (j + 1) + " = " + results[j]);
        }

    }

    @Override
    public void learnMethod3() {

        System.out.println("西暦を入力してください。");
        String yearString = new java.util.Scanner(System.in).next();
        int year = Integer.parseInt(yearString);

        System.out.println("元号は" + yearToEra(year) + "です");

    }

    private String yearToEra (int year) {

        String gengou = "";

        if (year < 1900 || year > 2020) {
            System.out.println("入力範囲が正しくありません。");
            return "該当なし";
        }

        if (year >= 1900 && year <= 1911) {
            gengou = "明治";
        } else if (year >= 1912 && year <= 1925) {
            gengou = "大正";
        } else if (year >= 1913 && year <= 1988) {
            gengou = "昭和";
        } else if (year >= 1989 && year <= 2018) {
            gengou = "平成";
        } else if (year >= 2019) {
            gengou = "令和";
        }

        return gengou;

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

        String gengou = "";
        int tax = 0;

        double resultPrice = price;

        if (year < 1900 || year > 2020) {
            System.out.println("入力範囲が正しくありません。");
            return;
        }

        if (price <= 0) {
            System.out.println("価格の入力が正しくありません。");
            return;
        }

        if (year >= 1900 && year <= 1911) {
            gengou = "明治";
        } else if (year >= 1912 && year <= 1925) {
            gengou = "大正";
        } else if (year >= 1913 && year <= 1988) {
            gengou = "昭和";
        } else if (year >= 1989 && year <= 2018) {
            gengou = "平成";
        } else if (year >= 2019) {
            gengou = "令和";
        }

        if (year >= 1900 && year <= 1988) {
            tax = 0;
            resultPrice = price;
        } else if (year >= 1989 && year <= 1996) {
            tax = 3;
            resultPrice = price * 1.03;
        } else if (year >= 1997 && year <= 2013) {
            tax = 5;
            resultPrice = price * 1.05;
        } else if (year >= 2014 && year <= 2018) {
            tax = 8;
            resultPrice = price * 1.08;
        } else if (year >= 2019) {
            tax = 10;
            resultPrice = price * 1.10;
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

        if ("".equals(numString)) {
            System.out.println("回数が未入力です");
        } else {
            int num = Integer.parseInt(numString);
            yourName(num);
        }

        System.out.println("君の名は？");
        String name = new java.util.Scanner(System.in).next();

        yourName(name);

    }

    private void yourName(int num) {

        System.out.println(num + "回");

    }

    private void yourName(String name) {

        if ("".equals(name) || name == null) {
            System.out.println("名前が未入力です");
            return;
        }

        System.out.println("私は" + name + "です。");

    }
}
