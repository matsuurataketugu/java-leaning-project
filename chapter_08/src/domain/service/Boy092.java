package domain.service;

public class Boy092 {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isNullOrEmpty(name)) {
            System.out.println("name: value is null or empty.");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String age) {
        if (isNullOrEmpty(age)) {
            System.out.println("age: value is null or empty.");
            return;
        }
        if (!isNumeric(age)) {
            System.out.println("age: value is not an integer.");
            return;
        }
        if (!isRange(age)) {
            System.out.println("age: value is range over. range:0-100");
            return;
        }
        this.age = Integer.parseInt(age);
    }

    private boolean isNullOrEmpty(String arg) {
        return arg == null || arg.isEmpty();
    }

    private boolean isNumeric(String arg) {
        try {
            int v = Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isRange(String arg) {
        int v = Integer.parseInt(arg);
        return MIN_AGE <= v && v <= MAX_AGE;
    }
}
