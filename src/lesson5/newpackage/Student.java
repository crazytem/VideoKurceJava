
package lesson5.newpackage;

import lesson4.domashka.*;

public class Student {
    
    int numer;
    String name;
    String family;
    int god;
    double pred1;
    double pred2;
    double pred3;
    
   
       
    
   
}
    
    
class StudentTest{ 
    
    double SrednArifm (Student sr){
        double sredn = (sr.pred1+sr.pred2+sr.pred3)/3;
        System.out.println("Имя " + sr.name + " Фамилия " + sr.family + " Средняя оценка " + sredn );
        return sredn;
    }
    
         
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
                                
        s1.numer = 1234;
        s1.name = "Ivan";
        s1.family = "Petrov";
        s1.god = 2013;
        s1.pred1 = 4.5;
        s1.pred2 = 4.0;
        s1.pred3 = 4.8;
            
        
        
        s2.numer = 2345;
        s2.name = "Stac";
        s2.family = "Govrilov";
        s2.god = 2014;
        s2.pred1 = 4.9;
        s2.pred2 = 3.9;
        s2.pred3 = 4.5;
        
        
        
        s3.numer = 3245;
        s3.name = "Julia";
        s3.family = "Ivanova";
        s3.god = 2015;
        s3.pred1 = 4.9;
        s3.pred2 = 5.0;
        s3.pred3 = 4.6;
        
        StudentTest St = new StudentTest();
        St.SrednArifm(s1);
        St.SrednArifm(s2);
        St.SrednArifm(s3);
    
    
    
        
        
        
       /* 
        
        System.out.println("Номер билета: "+s1.numer);
        System.out.println("Фамилия: "+s1.family);
        System.out.println("Имя: "+s1.name);
        System.out.println("Год обучения: "+s1.god);
        System.out.println("Средняя оценка: " + SrednArifm);
        System.out.println();   
        
        
        System.out.println("Номер билета: "+s2.numer);
        System.out.println("Фамилия: "+s2.family);
        System.out.println("Имя: "+s2.name);
        System.out.println("Год обучения: "+s2.god);
        System.out.println("Средняя оценка: " + (s2.pred1+s2.pred2+s2.pred3)/3);
        System.out.println();
        System.out.println("Номер билета: "+s3.numer);
        System.out.println("Фамилия: "+s3.family);
        System.out.println("Имя: "+s3.name);
        System.out.println("Год обучения: "+s3.god);
        System.out.println("Средняя оценка: " + (s3.pred1+s3.pred2+s3.pred3)/3);

        */
        
        
    }




}
