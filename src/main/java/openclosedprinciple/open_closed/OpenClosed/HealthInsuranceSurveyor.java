package openclosedprinciple.open_closed.OpenClosed;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {

        System.out.println("Health Insurance: Validating health insurance claim!");

        return true;
    }
}
