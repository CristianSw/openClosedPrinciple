package openclosedprinciple.open_closed.OpenClosed;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {

    @Override
    public boolean isValidClaim() {
        System.out.println("Vehicle Insurance: Validating vehicle insurance claim!");
        return true;
    }
}
