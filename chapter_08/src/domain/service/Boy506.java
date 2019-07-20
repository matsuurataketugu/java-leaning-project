package domain.service;

public class Boy506 {

    static final int MIN_AGE = 0;
    static final int MAX_AGE = 100;

    private String name = "";
    private int age = 0;


    public String getName() {
        return name;
    }

    public void setName(String pName) {

        if (pName == null) {
            System.out.println("引数が不正です");
            return;
        }

        this.name = pName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String pAge) {

        if (!isNum(pAge)) {
            System.out.println("引数が不正です");
            return;
        }

        if (Integer.parseInt(pAge) < MIN_AGE || Integer.parseInt(pAge) > MAX_AGE) {
            System.out.println("引数が不正です");
            return;
        }

        this.age = Integer.parseInt(pAge);
    }

    static boolean isNum(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
