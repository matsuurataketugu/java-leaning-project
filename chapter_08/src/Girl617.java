package domain.service;

public class Girl617 {

    static final int MIN_AGE = 0;
    static final int MAX_AGE = 100;

    private String name = "";
    private int age = 0;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {

        if (isNull(name)) {
            System.out.println("setName:引数が設定されていません。");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(String age) {

        if (!isNum(age)) {
            System.out.println("setAge:引数が数値ではありません。");
            return;
        }
        int ageNum = Integer.parseInt(age);
        if (ageNum <= MIN_AGE || ageNum >= MAX_AGE) {
            System.out.println("setAge:引数が範囲外です。");
            return;
        }
        this.age = ageNum;
    }

    private boolean isNum(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isNull(String string) {

        return string == null || string.isEmpty();
    }
}
