package domain.service;

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
            int height = Integer.parseInt(heightString);

            System.out.println("性別(男/女)を入力してください");
            String sex = new java.util.Scanner(System.in).next();

            System.out.println("名前は"+ name + "です");
            System.out.println("年齢は"+ age + "歳です");
            System.out.println("身長は"+ height + "cmです");
            System.out.println("性別は"+ sex + "です");

        }



    @Override
    public void learnMethod2() {
        multiplication(2);
    }

        private void multiplication(int number) {

            int results[] = new int[9];

            if (number == 0) {
                System.out.println("0は九九にはない数字です");
                return;
            }

            for (int i = 0; i < 9; i++) {
                results[i] = number * (i + 1);
            }


            for (int j = 0; j < 9; j++) {
                results[j] = number * (j + 1);

                System.out.println(number + "*" + (j + 1) + "=" + results[j]);
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

        if (year < 1900 || year > 2020) {
            System.out.println("入力範囲が正しくありません。1900年～2020年の間で入力してください");
            return "該当なし";
        }

        if (year >= 1900 && year <= 1911) {
            era = "明治";
        } else if (year >= 1912 && year <= 1925) {
            era = "大正";
        } else if (year >= 1926 && year <= 1988) {
            era = "昭和";
        } else if (year >= 1989 && year <= 2018) {
            era = "平成";
        } else if (year == 2019) {
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
        double resultPrice = price;

        if (year < 1900 || year > 2020) {
            System.out.println("入力範囲が正しくありません。1990年～2020年の間で入力してください");
            return;
        }

        if (year >= 1900 && year <= 1911) {
            era = "明治";
        } else if (year >= 1912 && year <= 1925) {
            era = "大正";
        } else if (year >= 1926 && year <= 1988) {
            era = "昭和";
        } else if (year >= 1989 && year <= 2018) {
            era = "平成";
        } else if (year >= 2019) {
            era = "令和";
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
        } else if (year == 2019) {
            tax = 10;
            resultPrice = price * 1.10;
        }

        System.out.println("元号：" + era + "、消費税率：" + tax + "%" );

    }



    @Override
    public void learnMethod5() {
            System.out.println("君の名は何回見た？");
            String numString = new java.util.Scanner(System.in).next();

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

