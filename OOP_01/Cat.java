package OOP.OOP_Homework.OOP_01;

public class Cat extends Animals {

    public Cat(String name, int age) {
        super(name, age, "мур-мяу", "кошка");
    }

    @Override
    public void timePasses() {
        if (generateRandom() >= 3) {
            sleepy = true;
            hungry = true;
        }
    }
}

