public class Vesch {

    private String name;
    private double weight;
    private double price;

    public Vesch(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weigth) {
        this.weight = weigth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Вещь <" + " Название: '" + name + "' Вес: " + weight + " Цена: " + price +" >\n";
    }
}
