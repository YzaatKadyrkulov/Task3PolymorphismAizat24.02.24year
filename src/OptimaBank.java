public class OptimaBank extends MyPhone {
    double balance;

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("You transferred " + amount + " som ");
        System.out.println("Your balance is: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You transferred " + amount + " som ");
            System.out.println("Your balance is: " + balance);

        }else{
            System.out.println("Insufficient funds in  account ");
        }
    }
        public void transaction ( double amount){
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Yzaat transferred you: " + balance);
            } else {
                System.out.println(" Insufficient funds in  account for transaction");
            }
        }

    }
