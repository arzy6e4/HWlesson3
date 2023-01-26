public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("Ваш счет пополнился. Ваш текущий счет - " + BankAccount.amount);

        while(true) {
            try {
                System.out.println("Вы сняли со счета деньги. Ваш текущий счет - " + bankAccount.getAmount());
                bankAccount.WithDraw(6000);
            } catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                System.out.println("Ваш текущий счет - " + BankAccount.amount);
                System.out.println("Мы сняли всю ту оставшуюся сумму с вашего счета в размере - " + BankAccount.amount
                        + " сом");
                try {
                    bankAccount.WithDraw(BankAccount.amount);
                    System.out.println(BankAccount.amount);
                } catch (LimitException a){
                    System.out.println("Не хватает средств на вашем счету");
                }
                break;
            }
        }






    }
}