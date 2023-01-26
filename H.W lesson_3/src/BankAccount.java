public class BankAccount {
    static double amount;

    public double getAmount(){return amount;}

    public void deposit(double sum){amount = amount + sum;}

    public void WithDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("У вас недостаточно средств",+ getAmount());
        } else {
            amount = amount - sum;
        }

    }

}
