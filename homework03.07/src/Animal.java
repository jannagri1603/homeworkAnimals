public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected double maxJump;
    protected int maxRun;
    protected int maxSwim;

    public Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void swim(int distance) {
        if (distance <= maxSwim)
            System.out.println(String.format("%s плывет %d метров",name,distance));

        else System.out.println(String.format("%s не может проплыть %d метров",name,distance));

    }
    public void run(int distance) {
        if (distance <= maxRun)
            System.out.println(String.format("%s бежит %d метров",name,distance));
        else System.out.println(String.format("%s не может пробежать %d метров",name,distance));
    }
    public void jump(double hgt) {
        if (hgt <= maxJump)
            System.out.println(String.format("%s прыгает %.1f метров",name,hgt));
        else System.out.println(String.format("%s не может подпрыгнуть %.1f метров",name,hgt));
    }


}
