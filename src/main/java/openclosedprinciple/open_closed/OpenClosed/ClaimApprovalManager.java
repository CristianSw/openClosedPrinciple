package openclosedprinciple.open_closed.OpenClosed;

public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor){
        if (surveyor.isValidClaim()){
            System.out.println("Claim Manager : Claim is valid! Processing claim for approval");
        }
    }
}
