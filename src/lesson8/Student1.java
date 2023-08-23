package lesson8;

public class Student1 {

    String name;
    int course;
    static int count;
    int a;

    public Student1(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan" );
    }
    public static void showCount(){
        System.out.println("Vsego studentov # " + count + " chel" );
    }
    public void showInfo(){
        System.out.println("Welcome to the Student class!" );
    }
    
    void abc(){
        a++;
        count++;
    }
    
    static void abcd(){
        count++;
        // в статичном методе не работают не статичные переменные 
        // a++;
        Student1 st2 = new Student1("Petr",1);
        st2.a++;
    }
       
    public static void main(String[] args) {
        abcd(); // Можем создать, принадлежит классу
        // abc(); принадлежит обьекту не можем вызвать
        
        Student1 st3 = new Student1("Иван",4);
        st3.abc();
    }
     
}
