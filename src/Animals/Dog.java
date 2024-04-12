package Animals;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(
                type,
                weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight
        );
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("wooooooo");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            walk();
            bark();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    private void bark() {
        System.out.println("woof!");
        System.out.println("Dogs walk, run and wag their tail");
    }

    private void run() {
        System.out.println("Dog running");
    }

    private void walk() {
        System.out.println("Dog walks");
    }

    private void wagTail() {
        System.out.println("Dog wags tail");
    }
}
