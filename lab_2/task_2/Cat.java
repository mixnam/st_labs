package lab_2.task_2;

public class Cat extends Animal {
    Cat(String location, String food) {
        super(location, food);
        this.type = "Кошка";
    }

    public void makeNoise() {
        System.out.println("Мяу мяу");
    }
}
