package domain.service.student645;

public enum BirdAction {
    //ランダムで入ってる数値から行動する
    attack(90),
        run(10);

private int id;

private BirdAction(int id) {
        this.id = id;
        }

public int getId() {
        return this.id;
        }
        }
