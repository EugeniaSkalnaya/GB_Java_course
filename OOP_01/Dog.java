package OOP.OOP_Homework.OOP_01;

public class Dog extends Animals {
    public Dog(String name, int age) {
        super(name, age, "гав-гав", "собака");
    }

    @Override
    public void sleepy() {
        if (generateRandom() > 5) {
            this.sleepy = true;
        }
    }
    @Override
    public void Activity() {
        this.minutes += 25;
        System.out.println(String.format("%s поиграл %d минут!",
                this.name, this.minutes));
    }
    @Override
    public void hungry() {
        if (generateRandom() > 1) {
            this.hungry = true;
        }
    }

    @Override
    public boolean happy() {
        if (hungry == true) {
            happy = false;
        }
        return happy;
    }
}