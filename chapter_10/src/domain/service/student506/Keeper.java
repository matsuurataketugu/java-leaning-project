package domain.service.student506;

public class Keeper extends Player {

    public Keeper(int offensivePower, int defensivePower) {
        this.offensivePower = offensivePower;
        this.defensivePower = defensivePower;
    }

    public boolean skill() {

        this.defensivePower = this.defensivePower * 2;

        return true;

    }
}
