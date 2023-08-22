
package lesson5.newpackage;


public class Employee1 {
      
    int id;
    String surname;
    int age;
    int salary;
    String departmen;
    
    Employee1(int id2, String surname2, int age2, int salary2, String departmen2){
        
    id=id2;
    surname=surname2;
    age=age2;
    salary=salary2;
    departmen=departmen2;
    
    
    }
    
    int uvelzp(){
    salary*=2;
    return salary;  
    
       
    }
    
 }
 class EmployeeTest1 {
    
    public static void main(String[] args) {
        
        Employee1 emp1 = new Employee1(1, "Popov", 25, 50000, "IT");
        Employee1 emp2 = new Employee1(2, "Zarubin", 32, 60000, "Seller");
        
        emp1.uvelzp();
                
        System.out.println("Новая зарплата работника " + emp1.surname + ":" + emp1.salary);
        
        int NewZp = emp2.uvelzp();
        
        System.out.println("Новая зарплата работника " + emp2.surname + ":" + NewZp);
    
    }
  }