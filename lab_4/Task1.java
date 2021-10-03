package lab_4;

public class Task1 {
    class Animal {
        private boolean vegetarian;
        private String eats;
        private int noOfLegs;

        Animal(boolean vegetarian, String eats, int noOfLegs) {
            this.vegetarian = vegetarian;
            this.eats = eats;
            this.noOfLegs = noOfLegs;
        }
    }

    class Cat extends Animal {
        private String color;

        Cat(boolean vegetarian, String eats, int noOfLegs) {
            super(vegetarian, eats, noOfLegs);
            this.color = color;
        }
    }
}
