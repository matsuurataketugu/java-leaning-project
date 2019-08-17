package domain.service;

public class Boy645 {
    static final int MIN_AGE = 0;
    static final int MAX_AGE = 100;

    private String name;
    private int age;

    public String getName(){return name;}

    public void setName(String name){
        //nameがnullか判定
        if(name == null){
            System.out.println(name + "に文字列の設定が行われていません");
            return ;
        }
        this.name = name;
    }

    public int getAge(){return age;}

    public void setAge(int age){
        //ageがnullか判定
        if(age == 0){
            System.out.println(age + "に文字列の設定が行われていません");
            return ;
        }
        //最小より小さい場合エラー
        if(age <= MIN_AGE){
            System.out.println("最小値　MIN_AGE" + MIN_AGE + "より小さい値は入力できません");
            return ;
        }
        //最小大より大きい場合エラー
        if(age >= MAX_AGE){
            System.out.println("最大値　MAX_AGE" + MAX_AGE + "より大きい値は入力できません");
            return ;
        }
        this.age = age;

    }






}
