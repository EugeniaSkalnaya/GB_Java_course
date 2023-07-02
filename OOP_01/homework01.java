package OOP.OOP_Homework.OOP_01;


/*
есть животные, у них есть кличка, возраст, тип животного, счастливы они или нет.
к ним применяются методы голод, сонливость, после этого замеряется счастье.
в итоге кошки менее довольны, если они сонные, собаки - если голодные, а еж сам по себе =)))
*/
import java.util.Arrays;
import java.util.List;

public class homework01 {
    public static void main(String[] args) {
        Animals cat1 = new Cat("Чешир", 8);
        Animals cat2 = new Cat("Квини", 2);
        Animals dog1 = new Dog("Баркл", 3);
        Animals dog2 = new Dog("Боб", 4);
        Animals hedgehog = new Hedgehog("Юрий", 10);

        List<Animals> animals = Arrays.asList(dog1, dog2, cat1, cat2, hedgehog);

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
        cat1.hungry();
        cat2.sleepy();
        dog1.hungry();
        dog2.sleepy();
        cat1.happy();
        cat2.happy();
        dog1.happy();
        dog2.happy();

        for (Animals animal : animals) {
            System.out.println(animal);
        }
        System.out.println("--------------");
        hedgehog.Activity();
        ((Hedgehog) hedgehog).Apples();
        dog1.Activity();
    }
}
