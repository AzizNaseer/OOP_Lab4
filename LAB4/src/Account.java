public class Account {
    private double Balance;
    Account(){
        Balance=0;
    }
    Account(double B){
        this.Balance=B;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;

    }
    public void deposit(double D){
        System.out.println("Before deposit method your balance was "+Balance);
        Balance=Balance+D;
        System.out.println("Now your balance is "+Balance);
    }
    public void Withdraw(double D){
        Balance=Balance-D;
        System.out.println("After withdrawal your balance is "+Balance);
    }
}
