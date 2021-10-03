package lab_3.task_2;

public class Lorry extends Car{
    public int grusopodem;

    Lorry(String marka, String klass, int weight, Engine engine, int grusopodem) {
        super(marka, klass, weight, engine);
        this.grusopodem = grusopodem;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(String.format(
            """
            Eto gruzovik LORRY
            marka - %s,
            klass - %s,
            weight - %d,
            grusopodem - %d,
            engine
                moshnost - %d,
                proisvoditel - %s
            """, 
            this.marka,
            this.klass,
            this.weight,
            this.grusopodem,
            this.engine.moshnost,
            this.engine.proizvoditel));
    }
}
