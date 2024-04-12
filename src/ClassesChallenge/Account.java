package ClassesChallenge;

public class Account {
    private Long number;
    private double accountBalance;
    private String customerName;
    private String email;
    private Long phoneNumber;

    public Account(Long accountNumber, double accountBalance, String customerName, String email, Long phoneNumber) {
        this.number = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFundsIntoAccount(double funds) {
        this.accountBalance += funds;
    }

    public void withdrawFundsFromAccount(double funds) {
        if (this.accountBalance - funds < 0) {
            System.out.println("insufficient funds");
            return;
        }

        this.accountBalance -= funds;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
