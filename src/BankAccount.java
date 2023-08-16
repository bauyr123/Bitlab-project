class BankAccount{
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(){
    }

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){// принимает сумму в качестве параметра и добавляет ее к балансу счета.
        System.out.println(getBalance());
    }
    void withdraw(double amount){// принимает сумму в качестве параметра и вычитает ее из баланса счета.
        System.out.println(getBalance()-amount);
    }
}