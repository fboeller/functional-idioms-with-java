public class BankAccount {

    private final int euros;

    public BankAccount(int euros) {
        this.euros = euros;
    }

    public BankAccount addSavings(int euros) {
        return new BankAccount(this.euros + euros);
    }

    public BankAccount withdraw(int euros) {
        return new BankAccount(this.euros + euros);
    }

}
