package lab_2.task_2;

public class Horse extends Animal {
    Horse(String location, String food) {
        super(location, food);
        this.type = "Конь";
    }

    public void makeNoise() {
        System.out.println("Бррррр брр");
    }
}
