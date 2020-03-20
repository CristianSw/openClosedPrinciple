package openclosedprinciple.open_closed.InterfaceSegregation.toys;

import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Swim;
import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Toy;

public class ToySubmarine implements Toy, Swim {

    private String name;
    private String color;
    private double price;

    @Override
    public void swim() {

    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ToySubmarine{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", able to swim"+'}';
    }
}
