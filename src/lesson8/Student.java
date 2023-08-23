package lesson8;

public class Student {

    String name;
    int course;
    static int count;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan" );
    }
    public static void showCount(){
        System.out.println("Vsego studentov # " + count + " chel" );
    }
       
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Petr",3);
        Student st3 = new Student("Masha",4);
        //showCount();
        Student.showCount();
        st2.showCount();
        
        System.out.println(st1.name);
        System.out.println(count); 
        //System.out.println(st2.count);
        //System.out.println(st3.count);
    
}}
    
/*
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Petr",3);
        Student st3 = new Student("Masha",4);
        
        System.out.println(st1.name);
        System.out.println(Student.count); 
        
    }

}
*/