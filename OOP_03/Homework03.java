package OOP.OOP_Homework.OOP_03;

/**
 * Создать класс Контейнер - Container.!
 * В контейнере могут быть ящики (класс Box).!
 * <p>
 * У каждого ящика есть вес.!z
 * У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков,
 * которые находятся в контейнере.
 * <p>
 * 1. Класс Контейнер должен быть Comparable. Сравнивать он должен по весам
 * контейнера (чем меньше вес, тем меньше контейнер).
 * 2. Класс ContainerCountComparator - Comparator, который сравнивает контейнеры
 * по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
 * 3. Класс контейнер должен быть Iterable - итерирование должно происходить по
 * ящикам внутри контейнера.
 * <code>
 * Container c = new Container(...);
 * // ...
 * for (Box box: c) {
 * box - это контейнер
 * }
 * </code>
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Homework03 {
    public static void main(String[] args) {

        Container container1 = new Container("Maersk");
        container1.addBox(new Box());
        container1.addBox(new Box());
        container1.addBox(new Box());
        container1.addBox(new Box());

        Container container2 = new Container("DHL");
        container2.addBox(new Box());
        container2.addBox(new Box());

        Container container3 = new Container("CDEK");
        container3.addBox(new Box());
        container3.addBox(new Box());
        container3.addBox(new Box());

        System.out.println("Посмотрим, сколько весят ящики в контейнере Maersk");
        for (Box box : container1) {
            System.out.print(box);
        }

        System.out.println("\nСравним контейнеры по весу");
        Set<Container> containerWeightSet = new TreeSet<>(Arrays.asList(container1, container2, container3));
        for (Container container : containerWeightSet) {
            System.out.println("Контейнер " + container.name + ":вес - " +
                    container.getWeight());
        }

        System.out.println("\nСравним контейнеры по количеству ящиков в них");
        Set<Container> containerBoxSet = new TreeSet<>(new ContainerBoxesComparator());
        containerBoxSet.addAll(Arrays.asList(container1, container2, container3));
        for (Container container : containerBoxSet) {
            System.out.println("Контейнер " + container.name + ", количество ящиков - " + container.getBoxQuantity());
        }
    }

    static class Container implements Comparable<Container>, Iterable<Box> {
        private ArrayList<Box> boxArray = new ArrayList<>();
        private String name;

        Container(String name) {
            this.name = name;
        }

        public void addBox(Box box) {
            this.boxArray.add(box);
        }

        public int getWeight() {
            int containerWeight = 0;
            for (Box box : boxArray) {
                containerWeight += box.boxWeight;
            }
            return containerWeight;
        }

        public int getBoxQuantity() {
            return boxArray.size();
        }

        @Override
        public int compareTo(Container another) {
            return getWeight() - another.getWeight();
        }

        @Override
        public Iterator<Box> iterator() {
            return boxArray.iterator();
        }
    }

    static class ContainerBoxesComparator implements Comparator<Container> {
        @Override
        public int compare(Container o1, Container o2) {
            return o1.getBoxQuantity() - o2.getBoxQuantity();
        }
    }

    static class Box {
        int boxWeight = ThreadLocalRandom.current().nextInt(1, 20);

        @Override
        public String toString() {
            return "[" + boxWeight + "]";
        }
    }
}
