public class BankERP {
    public static void main(String[] args) {
        Book c1 = new Book("SBI001", "Hrishika Thapa", 23000);
        Book c2 = new Book("SBI001", "Roman Karki", 24000);

        // method call
        c1.deposit(5000);
        c1.deposit(6000);
        c1.withdraw(20000);
        System.out.println("Dear" + c1.name + "Your current balance is: " + c1.balance);
        c1.withdraw(200);
        c1.withdraw(25000);
        c1.customerInfo();
        if(c1.transactionsFee(20)){
            System.out.println("Deducted!");
        }else{
            System.out.println("Zero Transactions or less balance");
        }
    }


}
