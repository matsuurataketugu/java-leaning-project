package domain.service.student645;

public enum VeteranHeroAction {
    //ランダムで入ってる数値から行動する
    guard(10),
    skill(40),
    attack(100);

    private int id;

    private VeteranHeroAction(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
