
package lesson5.newpackage;

public class Employee {
    
        int id;
        String surname;
        int age;
        int salary;
        String departmen;
        
        int plustoo(int plus){
            
           salary*=plus;
           return salary;
        
        } 
}
        
class EmployeeTest {
    
    public static void main(String[] args) {
    
    Employee Account = new Employee();
    
    Account.id = 1;
    Account.surname = "Петров";
    Account.age = 35;
    Account.departmen = "Отдел разработки";
    Account.salary = 50000;
    Account.plustoo(2);
    
    Employee Account1 = new Employee();
    
    Account1.id = 2;
    Account1.surname = "Сидоров";
    Account1.age = 30;
    Account1.departmen = "Отдел продаж";
    Account1.salary = 30000;
    Account1.plustoo(2);
    
    System.out.println(Account.id + ". " + Account.surname + ", " + Account.age+ " лет, " + Account.departmen 
    + ", " + Account.salary + " руб.");
    
    System.out.println(Account1.id + ". " + Account1.surname + ", " + Account1.age+ " лет, " + Account1.departmen 
    + ", " + Account1.salary + " руб.");
    
    }
        
  
   
}
