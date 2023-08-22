
package lesson6;


public class MetodOverLoading {
    
    void show(int i1){
        System.out.println(i1);
    }
    
    void show(boolean b1){
        System.out.println(b1);
    }
    
    void show(String s1){
        System.out.println(s1);
    
    }
    
    void show(String s, int a){
        System.out.println("Data type String: " + a);
        
    }
}
class MetodOverlodingTest {
    public static void main(String[] args) {
        MetodOverLoading mO = new MetodOverLoading();
        int a=500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s ="Привет";
        mO.show(s);
        mO.show(s,a);
        
    }

}