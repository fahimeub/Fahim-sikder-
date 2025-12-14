package Test;

public class BankAccount {
            private int accountNumber ; 
private double balance ;
static private String bankName ;
static private double interestRate ;

void set_AccountNumber(int accountNumber){
this.accountNumber=accountNumber;
}
int get_AccountNumber(){
return accountNumber ;
}

void set_Balance(double balance){
this.balance=balance;
} 
double get_Balance (){
return balance;
}

static void set_BankName(String bankName){
BankAccount.bankName=bankName;
}
static String get_BankName(){
return bankName;
} 

static void  set_InterestRate(double interestRate ){
BankAccount.interestRate=interestRate;
}   
static double get_InterestRate(){
return interestRate;
}

void display (){
System.out.println("AccountNumber:"+accountNumber);
System.out.println("Balance:"+balance);
System.out.println("BankName:"+BankAccount.bankName);
System.out.println("InterestRate:"+BankAccount.interestRate);
}
  public static void main (String[]args){
  BankAccount b= new BankAccount();
  b.set_AccountNumber(1649801);
  b.set_Balance(2500.00);
  BankAccount.set_InterestRate(6.05);
  BankAccount.set_BankName("ABc");
   
  b.display();
  
  } 
}
