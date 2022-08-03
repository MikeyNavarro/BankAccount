import java.util.ArrayList;

class BankAccount {

  private double checkingBalance;
  private double savingsBalance;
  public static int numOfPeople;
  public static double totalMoney;
  
  // Constructors

  // Constructors with saving and checkin account

  public BankAccount(double checkingBalance , double savingsBalance){
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
    BankAccount.numOfPeople++;
    BankAccount.totalMoney = this.checkingBalance + this.savingsBalance;
  }

  
  // get checking Balance

  public double getCheckingBalance(){
    return this.checkingBalance;
  }

  // get saving balance
  public double getSavingsBalance(){
    return this.savingsBalance;
  }

  public double depositChecking(double amount){
  BankAccount.totalMoney +=amount;
  return this.checkingBalance += amount;
  }

  public double depositSaving(double amount){
    BankAccount.totalMoney +=amount;
    return this.savingsBalance += amount;
    }

  public double withdrawChecking(double amount){
    BankAccount.totalMoney -=amount;
    if(amount > this.checkingBalance){
      System.out.println("Insufficient funds");
      return this.checkingBalance;
    } else{
      return this.checkingBalance -= amount;
    }
  }

  public double withdrawSaving(double amount){
    BankAccount.totalMoney -=amount;
    if(amount > this.savingsBalance){
      System.out.println("Insufficient funds");
      return this.savingsBalance;
    } else{
      return this.savingsBalance -= amount;
    }
  }
  

  public void BankTotal(){
    System.out.println(BankAccount.totalMoney);
  }

  public void netWorth(){
    System.out.println("Your total balance is " + " " + (this.checkingBalance + this.savingsBalance));
  }
}

