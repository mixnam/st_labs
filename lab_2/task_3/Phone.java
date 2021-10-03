package lab_2.task_3;

public class Phone {
    public String number;
    public String model;
    public String weight;

    Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    Phone() {
        this.model = "Nokia";
        this.number = "123";
        this.weight = "100";
    }

    public void receiveCall(String name) {
        System.out.println(String.format("Звонит %s", name));
    }

    public void receiveCall(String name, String number) {
        System.out.println(String.format("Звонит %s - %s", name, number));
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessages(String ...numbers) {
        System.out.println(String.join(",", numbers));
    }
}
