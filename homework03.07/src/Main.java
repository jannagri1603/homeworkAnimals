public class Main {

    public static void main(String[] args) {
	Dog Doggy = new Dog("Бублик", "Коричневый", 2);
    System.out.println(Doggy.toString());
    Doggy.run(500);
    Doggy.swim(10);
    Doggy.jump(0.5);
    Cat Kitty = new Cat("Персик", "Рыжий", 6);
    Kitty.run(200);
    Kitty.jump(2);
    Kitty.swim(0);
    }
}
