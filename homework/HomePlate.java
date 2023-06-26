package homework;

public class HomePlate {
    private int food;

    public HomePlate(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("Положи хоть немного еды");
        }
        this.food = food;
    }

    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public double eatFood(int appetite, double hunger) {
        int canEat = (int) ((hunger) / 100 * appetite);
        if (this.food >= canEat) {
            this.food -= canEat;
            return 0;
        }
        double outHunger = (double) this.food/appetite * 100 + hunger;
        this.food = 0;
        return outHunger;
    }

    @Override
    public String toString() {
        return String.format("Еды в миске - %d", food);
    }
}