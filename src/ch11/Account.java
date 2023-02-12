package ch11;

public class Account {
    private long balance;

    public Account() {}
    public long getBalance() { return balance;}
    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }

    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(10000);
        System.out.println(a.getBalance());
        try {
            a.withdraw(30000);
        } catch(InsufficientException e) {
            String messaage = e.getMessage();
            System.out.println(messaage);
        }
    }
}
