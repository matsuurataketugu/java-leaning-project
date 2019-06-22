package domain.service;

public class Human092 {
    private String name = "鈴木 一郎";
    private int age = 41;
    private String sex = "man";
    private String sexJa = "男";

    public void selfIntroduction()
    {
        System.out.println("\n");
        System.out.println("==================================");
        System.out.println("             自己紹介             ");
        System.out.println("==================================");
        System.out.println("名前は" + name + "といいます。");
        System.out.println("年は" + age + "歳です。");
        System.out.println("性別は" + sexJa + "(" + sex + ")です。");
        System.out.println("将来の夢は素敵な女性とめぐり逢い、結婚して幸せな家庭を築くことです！");
        System.out.println("よろしくお願いいたします。");
        System.out.println("\n");
    }
}
