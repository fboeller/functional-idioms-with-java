public class BankAccount {

    private int euros = 0;

    public void addSavings(int euros) {
        this.euros += euros;
    }

    public void withdraw(int euros) {
        this.euros -= euros;
    }

}
