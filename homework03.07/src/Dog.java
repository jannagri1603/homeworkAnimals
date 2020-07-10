import java.util.Random;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
        Random random = new Random();
        super.maxJump = random.nextDouble();
        super.maxSwim = random.nextInt();
        super.maxRun = random.nextInt(200)+400;
    }


}
