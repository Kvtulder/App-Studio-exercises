

// transfer method is not in the javadocs!

public class SavingsAccount {
   private int balance;

   public SavingsAccount(){
      balance = 0;
   }

   public SavingsAccount(int initialBalance)
   {
      balance = initialBalance;
   }

   // provides a simple text greeting
   public void greet()
   {
      System.out.println("Hello there!");
   }

   // there is a mistake in the exercise! The javadocs says the function is void and the pdf says it should return an interger.
   // I'll follow the javadocs
   public void showBalance()
   {
      System.out.println("Balance: " + balance);
   }

   // deposit an amount
   public void deposit(int howMuch)
   {
      // if the amount is negative, do nothing
      if(howMuch < 0)
         return;

      // deposit!
      balance += howMuch;
   }

   // withdraw an amount
   public void withdraw(int howMuch)
   {
      // if the amount is negative, do nothing
      if(howMuch < 0)
         return;

      // withdraw!
      balance -= howMuch;
   }

}
