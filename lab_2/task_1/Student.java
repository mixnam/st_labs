package lab_2.task_1;

public class Student {
    String firstName, lastName, group;
    Double averageMark;

    public Student(String firstName, String lastName, String group, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return this.averageMark == 5 ? 100 : 80;
    }
}
