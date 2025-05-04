public class authorization {
    public static void main(String[] args) {
        abstructAuthorization cashier = new authCashier();
        abstructAuthorization seniorOfficer = new authBothCashierAndSeniorOfficer();
        abstructAuthorization manager = new authBothSeniorOfficerAndManager();

        cashier.setNextAuth(seniorOfficer);
        seniorOfficer.setNextAuth(manager);

        long[] withdrawalRequest = {5000, 11000, 2200000, 15000};

        for(long amount: withdrawalRequest){
            System.out.println("Request withdrawal amount: " + amount);
            cashier.processRequest(amount);
            System.out.println("Paid: " + amount);
            System.out.println("------------------");
        }
    }
}
