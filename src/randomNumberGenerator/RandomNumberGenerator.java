package randomNumberGenerator;

import java.util.Random;

public class RandomNumberGenerator {

    public static int random(){
        Random random = new Random();
        return random.nextInt(10)+1;
    }
}
