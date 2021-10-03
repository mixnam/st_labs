package lab_3.task_2;

public abstract class Car {
    public String marka;
    public String klass;
    public int weight;
    public Engine engine;

    Car(String marka, String klass, int weight, Engine engine) {
        this.marka = marka;
        this.klass = klass;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направа");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
