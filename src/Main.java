public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Fabricio", "");
        account.setDeposit(500);
        account.setWithdraw(300);
        System.out.printf("%nTitular: " + account.getHolder());
        System.out.printf("%nNúmero da Conta: " + account.setAccNum(""));
        System.out.printf("%nSaldo atual: " + account.getCurrentBalance());
    }
}
