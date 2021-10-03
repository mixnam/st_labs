package lab_3.task_2;

public class SportCar extends Car{
    public int maxSpeed;

    SportCar(String marka, String klass, int weight, Engine engine, int maxSpeed) {
        super(marka, klass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(String.format(
            """
            Eto SportCar SportCar
            marka - %s,
            klass - %s,
            weight - %d,
            maxSpeed - %d,
            engine
                moshnost - %d,
                proisvoditel - %s
            """, 
            this.marka,
            this.klass,
            this.weight,
            this.maxSpeed,
            this.engine.moshnost,
            this.engine.proizvoditel));
    }
}
