package domain.service.student645;

import java.util.Random;

public class Utility {

    public static int lastDamage;

    public static int getRandom(int maxRange) {
        return new Random().nextInt(maxRange) + 1;
    }
}
