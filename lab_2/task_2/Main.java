package lab_2.task_2;

public class Main {
    public static void main(String[] args) {
        Veterinarian v = new Veterinarian();

        Animal[] a = {
            new Dog("Москва", "кости"),
            new Cat("Питер", "молоко"),
            new Horse("Севастополь", "трава"),
        };
    
        for (Animal a$: a) {
            v.treatAnimal(a$);
        }            
    }
}
