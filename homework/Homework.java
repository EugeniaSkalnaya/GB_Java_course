package homework;

import java.sql.Time;

public class Homework {
    public static void main(String[] args) {
        Cat Murzik = new Cat("Murzik", 70, 50.0);
        HomePlate plateNew = new HomePlate(100);

        System.out.println(Murzik);
        System.out.println(plateNew);
        Murzik.eat(plateNew);
        System.out.println("Покормили, теперь котик сыт");
        System.out.println(plateNew);
        System.out.println("Прошло время, кот проголодался");
        Murzik.timePasses(Murzik);
        System.out.println(Murzik);
        Murzik.eat(plateNew);
        System.out.println("Покормили, теперь котик сыт");
        System.out.println(plateNew);
    }
}