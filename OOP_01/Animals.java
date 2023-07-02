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
    protected boolean happy;
    protected boolean sleepy;
    protected boolean hungry;
    protected int apples;
    protected int minutes;


    public Animals(String name, int age, String makeNoise, String animalType) {
        this.name = name;
        this.age = age;
        this.makeNoise = makeNoise;
        this.animalType = animalType;
        this.sleepy = false;
        this.happy = true;
        this.hungry = false;
        this.minutes = 0;
        this.apples = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNoise() {
        return this.makeNoise;
    }

    public void sleepy() {
        if (generateRandom() > 2) {
            this.sleepy = true;
        }
    }

    public void hungry() {
        if (generateRandom() > 2) {
            this.hungry = true;
        }
    }

    public boolean happy() {
        if (!(hungry == sleepy)) {
            this.happy = false;
        }
        return happy;
    }

    public void Activity() {
        this.minutes += 10;
        System.out.println(String.format("%s поиграл %d минут!",
                this.name, this.minutes));
    }

    //    public void playAndFeed() {
//        int playAndFeedRandom = generateRandom();
//        int randomNum = generateRandom();
//        if (randomNum <= playAndFeedRandom){
//            this.hungry = true;
//            this.sleepy = true;
//        } else {
//        System.out.println("Вы мало поиграли и покормили животное")
//        }
//    }
//
//    protected void timePasses() {
//        if (generateRandom()>2) {
//            this.hungry = true;
//            this.sleepy = true;
//        } else {
//        System.out.println("Прошлои мало времени, чтобы животное проголодалось или захотело спать")
//        }
//    }
    protected static int generateRandom() {
        Random rand = new Random();
        int max = 10, min = 1;
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }

    @Override
    public String toString() {
        return String.format("Животное: %s, имя: %s, возраст: %d лет, счастлив: %s",
                this.animalType, this.name, this.age, this.happy);
    }
}
