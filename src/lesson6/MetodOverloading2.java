
package lesson6;

public class MetodOverloading2 {
    int sum(int i1, int i2){
        return i1+i2;
         
    
    }
    
    String sum (String s1, String s2){
        return s1+s2;
    
    }
  
}

class MetodOverloading2Test {
    public static void main(String[] args) {
        MetodOverloading2 mO2 = new MetodOverloading2();
        
        int a = mO2.sum(5, 7);
        System.out.println(a);
        String s = mO2.sum("Privet ", "moy drug!!!");
        System.out.println(s);
        
        
    }



}