package OOP.OOP_Homework.OOP_01;

public class Cat extends Animals {

    public Cat(String name, int age) {
        super(name, age, "мур-мяу", "кошка");
    }

    @Override
    public void hungry() {
        if (generateRandom() > 5) {
            this.hungry = true;
        }
    }

    @Override
    public void sleepy() {
        if (generateRandom() > 1) {
            this.sleepy = true;
        }
    }

    @Override
    public boolean happy() {
        if (hungry ^ sleepy) {
            happy = false;
        }
        return happy;
    }
}
