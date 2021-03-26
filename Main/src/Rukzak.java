import java.util.ArrayList;
import java.util.List;

public class Rukzak {

    private List<Vesch> bestItems = null;

    private double maxW;
    private double bestPrice;

    //вычисляет общий вес набора предметов
    private double calcWeight(List<Vesch> items) {
        double result = 0;
        for (Vesch item : items) {
            result += item.getWeight();
        }
        return result;
    }

    // вычисляет общую стоимость набора предметов
    private double calcPrice(List<Vesch> items) {
        double result = 0;
        for (Vesch item : items) {
            result += item.getPrice();
        }
        return result;
    }

    //проверка, является ли данный набор лучшим решением задачи
    private void checkSet(List<Vesch> veschi) {
        if (this.bestItems == null) {
            if (this.calcWeight(veschi) <= this.maxW) {
                this.bestItems = veschi;
                this.bestPrice = this.calcPrice(veschi);
            }
        } else {
            if (this.calcWeight(veschi) <= this.maxW && this.calcPrice(veschi) > this.bestPrice) {
                this.bestItems = veschi;
                this.bestPrice = this.calcPrice(veschi);
            }
        }
    }

        public void makePodbor(List<Vesch> items) {
        if (items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Vesch> newNabor = new ArrayList<>(items);
            newNabor.remove(i);
            makePodbor(newNabor);
        }
    }

    public Rukzak(double maxW) {
        this.maxW = maxW;
    }

    public List<Vesch> getNabor() {
        return this.bestItems;
    }
}