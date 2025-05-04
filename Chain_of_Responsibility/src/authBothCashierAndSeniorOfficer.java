public class authBothCashierAndSeniorOfficer extends abstructAuthorization{
    public void processRequest(long amount){
        if(amount >= 10000 && amount <= 1000000){
            System.out.println("Senior Officer approved to withdraw money: "+amount);
        }else{
            System.out.println("Senior Officer approved and forward request to manager");
            nextAuth.processRequest(amount);
        }
    }
}
