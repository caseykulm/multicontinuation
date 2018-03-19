import models.Color;
import models.Dog;

public class TabExample {
    public void initDog() {
        Color dogColor = new Color(
                123,
                123,
                123);

        Dog dog = new Dog.Builder()
                .size(Dog.Size.SMALL)
                .color(dogColor)
                .build();

        walkDog(dog);

        dog.talkTo(
                "Who's a good dog?",
                "Mach schnell!",
                "Sit");
    }

    private void walkDog(Dog dog) {
        if (dog.getSize() == Dog.Size.TINY ||
                dog.getSize() == Dog.Size.GIANT) {
            System.out.println("That dog is going to be challenging to walk");
        }

        for (int i = 0; (i < 100) &&
                (i < 100) &&
                (i < 100); i++) {
            System.out.println("Step " + i + " with doggo :D");
        }
    }
}
