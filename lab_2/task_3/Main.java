package lab_2.task_3;

public class Main {
    public static void main(String[] args) {
        Phone[] p = {
            new Phone("123", "Nokia", "150"),
            new Phone("321", "Samsung", "50"),
            new Phone("999", "iPhone", "10"),
        };
    
        for (Phone p$: p) {
            System.out.println(String.format("модель - %s, номер - %s, вес - %s", 
                p$.model,
                p$.number,
                p$.weight
            ));
            p$.receiveCall("Hank");
            p$.receiveCall("Hank", "911");
            p$.sendMessages("1", "2", "3", "4");
        }   
    }
}
