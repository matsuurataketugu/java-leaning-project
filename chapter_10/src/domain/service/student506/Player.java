package domain.service.student506;

abstract class Player {

    String name = "";
    int offensivePower = 0;
    int defensivePower = 0;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        if (isNullOrEmpty(name)) {
            System.out.println("setName:引数が設定されていません");
            return;
        }

        this.name = name;
    }

    public int getOffensivePower() {
        return this.offensivePower;
    }

    public void setOffensivePower(int offensivePower) {

        this.offensivePower = offensivePower;
    }

    public int getDefensivePower() {
        return this.defensivePower;
    }

    public void setDefensivePower(int defensivePower) {

        this.defensivePower = defensivePower;
    }

    abstract boolean skill();

    private boolean isNullOrEmpty(String string) {

        return string == null || string.isEmpty();
    }
}
