package lab_3.task_2;

public class Main {
    public static void main(String[] args) {
        Car l = new Lorry("BMW", "E", 150, new Engine(200, "LADA"), 400);
        Car s = new SportCar("LADA", "B", 10, new Engine(1, "LADA"), 60);
        
        l.printInfo();
        s.printInfo();
    }
}
