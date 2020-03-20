package openclosedprinciple.open_closed;

import openclosedprinciple.open_closed.InterfaceSegregation.toys.HouseToy;
import openclosedprinciple.open_closed.InterfaceSegregation.toys.ToyBuilder;
import openclosedprinciple.open_closed.InterfaceSegregation.toys.ToyCar;
import openclosedprinciple.open_closed.InterfaceSegregation.toys.ToyPlane;
import org.junit.jupiter.api.Test;

public class ToyTest {
    @Test
    public void testBuildHouseToy() {
        HouseToy houseToy = ToyBuilder.buildHouseToy();
        System.out.println(houseToy);
    }

    @Test
    public void testBuildCarToy(){
        ToyCar toyCar = ToyBuilder.buildCarToy();
        System.out.println(toyCar);
    }

    @Test
    public void testBuildPlaneToy(){
        ToyPlane toyPlane = ToyBuilder.buildPlaneToy();
        System.out.println(toyPlane);
    }
}
