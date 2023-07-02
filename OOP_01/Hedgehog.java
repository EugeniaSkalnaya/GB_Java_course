package OOP.OOP_Homework.OOP_01;

public class Hedgehog extends Animals {
    public Hedgehog(String name, int age) {
        super(name, age, "фыр-фыр-фыр", "ёж");
    }
    public void Apples() {
        this.apples = minutes * 5;
        System.out.println(String.format("%s походил по лесу %d минут и собрал %d яблок",
                this.name, this.minutes, this.apples));
    }
    @Override
    public void Activity() {
        this.minutes += 5;
    }
}
