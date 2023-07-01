package OOP.OOP_Homework.OOP_01;

import java.util.Arrays;
import java.util.List;

public class homework01 {
    public static void main(String[] args) {
        Animals cat = new Cat("Чешир", 8);
        Animals dog1 = new Dog("Баркл", 3);
        Animals dog2 = new Dog("Боб", 2);

        List<Animals> animals = Arrays.asList(dog1, dog2, cat);

        System.out.println("В нашем доме есть такие животные: ");
        for (Animals animal : animals) {
            System.out.println(animal);
        }
        System.out.println("-------------");

        System.out.println("Эти животные общаются так: ");
        for (Animals animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getNoise());
        }
        System.out.println("--------------");
        cat.timePasses();
        dog1.timePasses();
        dog2.timePasses();
        cat.happy();
        dog1.happy();
        dog2.happy();


        for (Animals animal : animals) {
            System.out.println(animal);
        }
        System.out.println("--------------");


    }
}