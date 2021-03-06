package openclosedprinciple.open_closed;

import openclosedprinciple.open_closed.OpenClosed.ClaimApprovalManager;
import openclosedprinciple.open_closed.OpenClosed.HealthInsuranceSurveyor;
import openclosedprinciple.open_closed.OpenClosed.VehicleInsuranceSurveyor;
import org.junit.jupiter.api.Test;


public class ClaimApprovalTest {
    @Test
    public void testClaimProcess() throws Exception{
        HealthInsuranceSurveyor surveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claim1 = new ClaimApprovalManager();
        claim1.processClaim(surveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claim2 = new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }

}
