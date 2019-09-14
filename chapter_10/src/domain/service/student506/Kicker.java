package domain.service.student506;

public class Kicker extends Player {

public boolean skill() {

    java.util.Random rnd = new java.util.Random();
    int result = rnd.nextInt(1);

    if (result == 0) {
        return false;
    } else {
        return true;
    }

}

}
