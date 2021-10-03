package lab_2.task_1;

public class Aspirant extends Student {
    Aspirant(String a, String b, String c, Double d) {
        super(a, b, c, d);
    }

    @Override
    public int getScholarship() {
        return this.averageMark == 5 ? 200 : 180;
    }
}
