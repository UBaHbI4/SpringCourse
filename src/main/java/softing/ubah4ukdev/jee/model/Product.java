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
    private int id;
    private String title;
    private double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    private int getId() {
        return id;
    }

    private  void setId(int id) {
        this.id = id;
    }

    private  String getTitle() {
        return title;
    }

    private  void setTitle(String title) {
        this.title = title;
    }

    private  double getCost() {
        return cost;
    }

    private  void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return title + ",  стоимость: <b><font color='#FF0000'>" + cost + "</font></b> руб.";
    }
}