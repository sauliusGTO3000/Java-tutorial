package ClassesChallenge;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(
                86761542L,
                0.00,
                "customerName",
                "customerEmail",
                746666352344L
        );

        account.depositFundsIntoAccount(1000.00);
        account.withdrawFundsFromAccount(5);
        System.out.println(account.getAccountBalance());
    }
}
