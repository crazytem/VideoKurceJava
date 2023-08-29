
package lesson9;

public class Car {
    
    int z =5;
    
    
    String color;
    String engine;
    static int count;
    
    public Car(String color, String engine){
        int x=5;
        int y=x+10;
        count++;
        this.color = color;
        this.engine = engine;
    }
     
    public void showColor(){
        System.out.println("Цвет машины: " + color);
    }
    public void changeColor(String color3){
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        color = color3;
        cena +=1000;
    }
    
}
