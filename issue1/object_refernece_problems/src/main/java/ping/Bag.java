package ping;

public class Bag {
    Integer fruitNumber;

    public Bag() {
    }

    public Bag(Integer fruitNumber) {
        this.fruitNumber = fruitNumber;
    }

    public Integer getFruitNumber() {
        return this.fruitNumber;
    }

    public void setFruitNumber(Integer fruitNumber) {
        this.fruitNumber = fruitNumber;
    }

    public void addFruitNumber(Integer add) {
        this.fruitNumber = this.fruitNumber + add;
    }
}