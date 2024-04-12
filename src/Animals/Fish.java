package Animals;

public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.println("muscles moving");
    }

    private void moveBackfin() {
        System.out.println("Backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackfin();
        }

        System.out.println();
    }
}
