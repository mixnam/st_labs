package lab_2.task_2;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(String.format("""
        На прием пришел %s из %s. Он ест %s
        """, animal.type, animal.location, animal.food));
    }
}
