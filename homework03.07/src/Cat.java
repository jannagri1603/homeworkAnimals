import java.util.Random;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
        Random random = new Random();
        super.maxRun = random.nextInt(200)+100;
        super.maxJump = random.nextDouble()+random.nextInt(2)+1;

    }
    @Override
    public void swim(int distance) {
    System.out.println(String.format("%s  не умеет плавать",name));
    }
}
