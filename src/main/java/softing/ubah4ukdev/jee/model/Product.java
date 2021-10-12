package softing.ubah4ukdev.jee.model;

/**
 * Project: JEE Maven WebApp
 *
 * Package: softing.ubah4ukdev.jee.model
 *
 * Created by Ivan Sheynmaer
 *
 * Description:
 * Класс продукты
 *
 * 2021.10.12
 *
 * v1.0
 */
public class Product {
    int id;
    String title;
    double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return title + ",  стоимость: <b><font color='#FF0000'>" + cost + "</font></b> руб.";
    }
}