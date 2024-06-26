package Animals;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 50);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever",65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog husky = new Dog("Wolf", 85);
        doAnimalStuff(husky, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 2);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
