
package lesson5.newpackage;

public class BankAccount {
    
    int id;
    String name = new String();
    double balance;  
    
    
    double PopolnenieSheta(double p){
        balance+=p;
        return balance;     
        }
    
    double SnyatiesoSheta(double s){
        balance-=s;
        return balance;     
        }
    void showInfo(){
        
        System.out.println(name + " " + balance);
    
    }
        
}
    
  
class BankAccountTest{

public static void main(String[] args) {
         
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        
        MyAccount.id = 1;
        MyAccount.name = "Artem";
        MyAccount.balance = 12.35;
        MyAccount.PopolnenieSheta(30);
        MyAccount.showInfo();
        
        
        YourAccount.id = 2;
        YourAccount.name = "Roman";
        YourAccount.balance = 15.56;
        YourAccount.SnyatiesoSheta(5);
        YourAccount.showInfo();
        
        HisAccount.id = 3;
        HisAccount.name = "Vasya";
        HisAccount.balance = 10.05;
        HisAccount.SnyatiesoSheta(4);
        HisAccount.showInfo();
        
                 
                      
        //System.out.println(MyAccount.name + " " + MyAccount.balance);
        //System.out.println(YourAccount.name + " " + YourAccount.balance);
        //System.out.println(HisAccount.name + " " + HisAccount.balance);
        
        
 }
}