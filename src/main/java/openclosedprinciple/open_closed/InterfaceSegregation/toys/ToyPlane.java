package openclosedprinciple.open_closed.InterfaceSegregation.toys;

import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Fly;
import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Move;
import openclosedprinciple.open_closed.InterfaceSegregation.interfaces.Toy;

public class ToyPlane implements Toy, Move, Fly {

    private String name;
    private String color;
    private double price;


    @Override
    public void fly() {
        System.out.println("Plane is able to fly!");
    }

    @Override
    public void move() {
        System.out.println("Plane is able to move!");
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
        return "ToyPlane{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", is able to fly, move"+'}';
    }
}
