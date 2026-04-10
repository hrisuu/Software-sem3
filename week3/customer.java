public class customer {
    // class level variable: instance, static
    String cusId;
    String name;
    double balance;
    int transactions;
    // objcect ko attributes hucxa, behaviour hunxa

    // Constructor-obj create, instance value initialize garne
    public customer(String cusId, String name, double Balance) {
        this.cusId = cusId; // this- local var, class level var value same bhayo bhane current var lina.
        this.name = name;
        this.balance = Balance;
        transactions = 0;
    }

    // method to deposit
    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance = balance + depositAmount;
            transactions++;
            System.out.println(depositAmount + " has Successfully deposited! ");

        } else {
            System.out.println("Invalid Amount!");
        }

    }

    // method to withdraw
    public void withdraw(double withdrawAmount) {
        if (balance > 0 && withdrawAmount < 0) {
            balance = balance - withdrawAmount;
            transactions++;
            System.out.println();
        } else {
            System.out.println("Your new balance is: Rs" + withdrawAmount);
        }
    }

    // method to display customer details
    public void customerInfo() {
        System.out.println("Customer ID: " + cusId);
        System.out.println("Customer Name:" + name);
        System.out.println("Bank Balance: " + balance);
        System.out.println("No of transacctions: " + transactions);

    }

    // transaction fee deductions
    public boolean transactionsFee(double feePerTransactions){
        if(transactions > 0){
            double totalFee = transactions"feePerTransactions";
            if(totalFee<=balance){
                balance=balance-totalFee;
                System.out.println("Transaction Fee: ");
                return true;
            }else{
                return false;
            }else{
                return false;
            }


        }else{

        }


    }
}