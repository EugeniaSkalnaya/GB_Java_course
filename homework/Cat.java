package homework;
import java.util.Random;
public class Cat {
    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private double hunger; // голод кота

    public Cat(String name, int appetite, double hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    public void eat(HomePlate plateNew) {
        if (hunger > 0) {
            hunger = plateNew.eatFood(appetite, hunger);
        }
    }
public void timePasses(Cat Murzik){
    Random rand = new Random();
    int max=100, min=0;
    int randomNum = (min + (int)(Math.random() * ((max - min) + 1)));
        hunger = hunger + randomNum;;
}
    @Override
    public String toString() {
        return String.format("Имя кота - %s, его аппетит - %d, текущий голод - %.2f%%", name, appetite, hunger);
    }
}