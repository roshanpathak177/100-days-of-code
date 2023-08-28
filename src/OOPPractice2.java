public class OOPPractice2 {
    public static void main(String[] args) {
        BankAccount bob = new BankAccount("Bob Vance", 49857, 34000);
        BankAccount bella = new BankAccount("Bella Sheen", 49817, 3400);
        bob.deposit(5000);
        bella.withdraw(317);
        bob.DisplayAcctDetails();


    }

    static class BankAccount {
        String name;
        int AcctNum;
        int Balance;

        BankAccount(String name, int AcctNum, int Balance) {
            this.name = name;
            this.AcctNum = AcctNum;
            this.Balance = Balance;
        }

        void deposit(int amount) {
            Balance += amount;
        }

        void withdraw(int amount) {
            if (amount > 0) {
                if (Balance >= amount) {
                    Balance -= amount;
                } else {
                    System.out.println("Insufficient funds.");
                }
            }
        }
        void DisplayAcctDetails(){
            System.out.println("Account Holder's name is: " + this.name);
            System.out.println("Your Account Number is: " + this.AcctNum);
            System.out.println("Your Remaining Balance is: " + this.Balance);
        }

    }
}
