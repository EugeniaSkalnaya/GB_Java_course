package OOP.OOP_Homework.OOP_01;

//Нужно создать несколько классов животных:
//        1. Пес (Собака)
//        2. Кот (Кошка)
//        3. ... придумать еще парочку
//
//        Каждое животное имеет: (поля)
//        1. Имя (кличка)
//        2. Возраст
//        3. ... придумать еще какие-то параметры
//
//        Каждое животное может: (методы)
//        1. Подавать голос
//        2. Питаться (съедает какое-то количество еды, переданное в метод)
//        3. Двигаться
//        4. ... все, что сумеете придумать
//
//        Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
//        Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.

import java.util.Random;

public class Animals {
    private String animalType;
    protected String name;
    private int age;
    private String makeNoise;
    public boolean happy;
    public boolean sleepy;
    public boolean hungry;

    protected int activity;


    public Animals(String name, int age, String makeNoise, String animalType) {
        this.name = name;
        this.age = age;
        this.makeNoise = makeNoise;
        this.animalType = animalType;
        this.sleepy = false;
        this.happy = true;
        this.hungry = false;
        this.activity = 0;
    }

    public String getName() {
        return this.name;
    }
    public String getNoise() {
        return this.makeNoise;
    }

    public void sleepy() {
        if (generateRandom()>2) {
            this.sleepy = true;
        }
    }
    public void hungry() {
        if (generateRandom()>2) {
            this.hungry = true;
        }
    }
    public void happy() {
        if (!(hungry == sleepy)) {
            this.happy = false;
        }
    }
//    public void playAndFeed() {
//        int playAndFeedRandom = generateRandom();
//        int randomNum = generateRandom();
//        if (randomNum <= playAndFeedRandom){
//            this.hungry = true;
//            this.sleepy = true;
//        }
//    }
   protected static int generateRandom() {
       Random rand = new Random();
       int max = 10, min = 2;
       return (min + (int) (Math.random() * ((max - min) + 1)));
   }
    protected void timePasses() {
        if (generateRandom()>2) {
            this.hungry = true;
            this.sleepy = true;
        }
    }


    @Override
    public String toString() {
        return String.format("Животное: %s, имя: %s, возраст: %d лет, счастлив: %s",
                this.animalType, this.name, this.age , this.happy);
    }
}