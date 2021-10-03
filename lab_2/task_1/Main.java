package lab_2.task_1;

public class Main {
    public static void main(String[] args) {
        Student[] ss = {
            new Student("Peter", "Parker", "1851", 3.0),
            new Student("Tonny", "Stark", "1851", 3.0),
            new Aspirant("Bruce", "Benner", "1851", 5.0),
        };
        
        for (Student s: ss) {
            System.out.println(String.format("%s - %d", s.firstName, s.getScholarship()));
        }
    }
}
