package models;

public class Dog {
    private final Size size;
    private final Color color;

    public Dog(Builder builder) {
        this.size = builder.size;
        this.color = builder.color;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void talkTo(String... phrases) {
        for (String phrase : phrases) {
            if (phrase.equals("Who's a good dog?")) {
                System.out.println("Dog wags tail!");
            } else if (phrase.equals("Mach schnell!")) {
                System.out.println("Dog breaks out in a sprint");
            } else if (phrase.equals("Sit")) {
                System.out.println("Dog sits patiently, waiting for a treat...");
            }
        }
    }

    public static class Builder {
        private Size size;
        private Color color;

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }

    public enum Size {
        TINY,
        SMALL,
        MEDIUM,
        LARGE,
        GIANT
    }
}
