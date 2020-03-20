package openclosedprinciple.open_closed.InterfaceSegregation.toys;

import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Move;
import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Toy;

import java.sql.SQLOutput;

public class ToyCar implements Toy, Move {
    String name;
    String color;
    double price;


    @Override
    public void move() {
        System.out.println("Car is able to move!");
    }

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
        return "ToyCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                " is able to move"+'}';
    }
}
