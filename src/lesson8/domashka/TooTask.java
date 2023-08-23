
package lesson8.domashka;

public class TooTask {
    public static final double PI=3.14;
    
    public double SKrug (double r1){
        double p1 = PI*r1*r1;
        return p1;
    }
    
    public static double LKrug (double r2){
        double L1 = 2*PI*r2;
        return L1;
    }
    
    public void Info (double r3){
        
        System.out.println("Радиус " + r3);
        System.out.println("Площадь " + SKrug(r3));
        System.out.println("Длина " + LKrug(r3));
    }
       
}
class TooTaskTest {
    public static void main(String[] args) {
      TooTask T2 = new TooTask();
      T2.SKrug(5);
      TooTask.LKrug(3.5);
      T2.Info(5);
    }
}
