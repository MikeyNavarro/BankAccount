public class BankAccountTest{
  public static void main(String [] args){

    BankAccount bankAccount1 = new BankAccount(340.76,87.99);
    System.out.println(bankAccount1.getCheckingBalance());
    bankAccount1.depositChecking(500);
    System.out.println(bankAccount1.getCheckingBalance());
  }
}