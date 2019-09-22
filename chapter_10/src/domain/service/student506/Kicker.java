package domain.service.student506;

public class Kicker extends Player {

    public Kicker(int offensivePower, int defensivePower) {
        this.offensivePower = offensivePower;
        this.defensivePower = defensivePower;
    }

public boolean skill() {

    this.offensivePower = this.offensivePower * 2;

    return true;
}

}
