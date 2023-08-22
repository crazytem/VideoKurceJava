
package lesson6.domashka;

public class Sumtreh {
    
    
    int sum (){
    
        int result =0;
        System.out.println(result);
        return result;
            
    }
    int sum (int a){
        int result1 =a;
        System.out.println(result1);
        return result1;
    }
    int sum (int a, int b){
        int result2 =a+b;
        System.out.println(result2);
        return result2;
    }
    int sum (int a, int b, int c){
        int result3 =a+b+c;
        System.out.println(result3);
        return result3;
    }
    int sum (int a, int b, int c, int d){
        int result4 =a+b+c+d;
        System.out.println(result4);
        return result4;
    }
}

class Summirovanie{
    public static void main(String[] args) {
        Sumtreh x = new Sumtreh();
        x.sum();
        x.sum(5);
        x.sum(10, 20);
        x.sum(30, 5, 10);
        x.sum(5, 5, 15, 10);
           
    }

}



    