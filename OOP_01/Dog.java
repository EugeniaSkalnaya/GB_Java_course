package OOP.OOP_Homework.OOP_01;

public class Dog extends Animals {
    public Dog(String name, int age) {
        super(name, age, "гав-гав", "собака");
    }
        @Override
        public void timePasses () {
            if (generateRandom()>4)  {
                hungry = true;
                sleepy = true;
        }
    }
}
