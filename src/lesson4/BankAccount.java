
package lesson4;

public class BankAccount {
    
    int id;
    //String name;
    String name = new String("Petr");
    double balance;        
    }
   

class BankAccountTest{

public static void main(String[] args) {
         
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        
        MyAccount.id = 1;
        MyAccount.name = "Artem";
        MyAccount.balance = 12.35;
        
        YourAccount.id = 2;
        YourAccount.name = "Roman";
        YourAccount.balance = 15.56;
        
        HisAccount.id = 3;
        HisAccount.name = "Vasya";
        HisAccount.balance = 10.05;
                 
                      
        System.out.println(YourAccount.name);

 }
}