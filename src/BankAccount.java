public class BankAccount {
    private final String holder;
    private String accNum;
    private double balance;

    BankAccount(String holder, String accNum){
        this.holder = holder;
        this.accNum = accNum;
    }

    // METHODS
    private void deposit(double value){
        this.balance += value;
    }

    private void withdraw(double value){
        this.balance -= value;
    }

    // SETTERS
    public String setAccNum(String acc){
        String defaultNum = "00000-0";
        if(acc != ""){
            return this.accNum = acc;
        }else{
            return this.accNum = defaultNum;
        }
    }
    public void setDeposit(double value){
        if(value > 0){
            this.deposit(value);
            System.out.printf("Depósito de %.2f realizado.%nSaldo atualizado: %.2f", value, this.balance);
        }else{
            System.out.println("%nNão foi possível realizar o depósito!");
        }
    }

    public void setWithdraw(double value){
        if(value > 0 && value <= this.balance){
            this.withdraw(value);
            System.out.printf("%nSaque de %.2f realizado. Saldo dísponível: %.2f", value, this.balance);
        }else{
            System.out.println("Saldo insuficiente para realização do saque!");
        }
    }


    // Getters
    public double getCurrentBalance(){
        return this.balance;
    }

    public String getHolder(){
        return this.holder;
    }
}

