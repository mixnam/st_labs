package lab_2.task_2;

public class Dog extends Animal {
    Dog(String location, String food) {
        super(location, food);
        this.type = "Собака";
    }

    public void makeNoise() {
        System.out.println("Гав гав");
    }
}
