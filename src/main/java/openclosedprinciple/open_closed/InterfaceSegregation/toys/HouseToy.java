package openclosedprinciple.open_closed.InterfaceSegregation.toys;

import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Toy;

public class HouseToy implements Toy {
    String name;
    String color;
    double price;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HouseToy{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

