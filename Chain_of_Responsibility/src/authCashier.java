public class authCashier extends abstructAuthorization{

    public void processRequest(long amount){
        if(amount < 10000){
            System.out.println("Cashier approved to withdraw money: " + amount);
        }else if(amount >= 10000 && amount <= 1000000){
            System.out.println("Cashier approved and forward to senior officer");
            nextAuth.processRequest(amount);
        }else{
            System.out.println("Cashier forward request to senior officer");
            nextAuth.processRequest(amount);
        }
    }
}
