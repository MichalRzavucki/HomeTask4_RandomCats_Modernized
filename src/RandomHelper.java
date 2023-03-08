import java.util.Random;

public class RandomHelper {

    Random random = new Random();

    public String getRandomName() {
        String result = "";
        char a;
        for (int i = 0; i < 5; i++) {
            a = (char) (random.nextInt(35) + '0');
            result = result + a;
        }
        return (result);
    }

    public boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public int getRandomInt() {
        return random.nextInt(10);
    }

}
