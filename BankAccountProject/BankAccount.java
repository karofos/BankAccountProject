  /**
      *Colorado State University - ITS-320 - Basic Programming
      *BankAccount class
      *This class simulates a bank account.
      *
      *(Taken from "Starting Out with Java - Early Objects
      *(Third Edition) by Tony Gaddis, 2008 by Pearson Educ.)
      *
      *Programmed By: karofos, Dr. Anwar Ahmad (March 29, 2015)
 */
     
 public class BankAccount
    {
       private double balance; // Account balance
       private double interestRate; // Interest rate
       private double interest; // Interest earned
       
       /**
          *The constructor initializes the balance
          *and interestRate fields with the values
          *passed to startBalance and intRate. The
          *interest field is assigned to 0.0
       */
       
       public BankAccount(double startBalance, double intRate)
          {
             balance = startBalance;
             interestRate = (intRate / 12) / 100;
             interest = 0.0;
           } 
           
        /**
          *The deposit method adds the parameter
          *amount to the balance field.
        */
        
        public void deposit(double amount)
          {
             balance += amount;
          }
          
         /**
          *The withdraw method subtracts the
          *parameter amount from the balance
          *field
         */ 
        
        public void withdraw(double amount)
          {
             balance -= amount;
          }
          
        /**
          *The addInterest method adds the interest
          *for the month to the balance field
        */   
        
        public void addInterest()
          {
             interest = balance * interestRate;
             balance += interest;
          }
       
        /**
          *The getBalance method returns the
          *value in the balance field.
        */
        
        public double getBalance()
          {
             return balance;
          }
          
        /**
          *The getInterest method returns the
          *value in the interest field.
        */     
        
        public double getInterest()
          {
             return interest;
          }
          
    }
