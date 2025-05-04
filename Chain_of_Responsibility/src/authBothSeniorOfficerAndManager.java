public class authBothSeniorOfficerAndManager extends  abstructAuthorization{
    public void processRequest(long amount){
        if(amount > 1000000) {
            System.out.println("Manager approved to withdraw money: " + amount);
        }
    }
}
