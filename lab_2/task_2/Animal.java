package lab_2.task_2;

public abstract class Animal {
    public String location;
    public String food;
    public String type;

    public Animal(String location, String food) {
        this.food = food;
        this.location = location;
        this.type = "Животное";
    }

    public abstract void makeNoise();

    public void eat() {
        System.out.println(String.format("%s - ест", this.type));
    }

    public void sleep() {
        System.out.println(String.format("%s - спит", this.type));
    }
}
