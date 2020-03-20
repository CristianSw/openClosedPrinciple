package openclosedprinciple.open_closed.InterfaceSegregation.toys;

public class ToyBuilder {
    public static HouseToy buildHouseToy(){
        HouseToy houseToy= new HouseToy();
        houseToy.setName("House of Chocolate");
        houseToy.setColor("Dark");
        houseToy.setPrice(15.99);
        return houseToy;
    }

    public static ToyCar buildCarToy(){
        ToyCar toyCar = new ToyCar();
        toyCar.setName("Mustang Shelby GT500");
        toyCar.setColor("Silver");
        toyCar.setPrice(50.63);
        return toyCar;
    }

    public static ToyPlane buildPlaneToy(){
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setName("Airbus A200");
        toyPlane.setColor("White");
        toyPlane.setPrice(42.15);
        return toyPlane;
    }

    public static ToySubmarine buildSubmarineToy(){
        ToySubmarine toySubmarine = new ToySubmarine();
        toySubmarine.setName("MKT3000");
        toySubmarine.setColor("Dark");
        toySubmarine.setPrice(119.99);
        return toySubmarine;
    }
}
