
package lesson2;


public class domashka {
    public static void main(String[] args)
    {    
        byte b1 = 12;
        byte b2 = 0B1100;
        byte b3 = 014;
        byte b4 = 0xC;
        
        System.out.println("" + b1 + " " + b2 + " " + b3 + " " + b4);
        
        short c1 = 1300;
        short c2 = 0B10100010100;
        short c3 = 02424;
        short c4 = 0x514;
        
        System.out.println("" + c1 + " " + c2 + " " + c3 + " " + c4);
        
        int i1 = 0;
        int i2 = 0B0;
        int i3 = 00;
        int i4 = 0x0;
        
        System.out.println("" + i1 + " " + i2 + " " + i3 + " " + i4);
        
        long l1 = 123456789L;
        long l2 = 0B111010110111100110100010101L;
        long l3 = 0726746425L;
        long l4 = 0x75BCD15L;
        
        System.out.println("" + l1 + " " + l2 + " " + l3 + " " + l4);
        
        float f1 = 1.14f;
        float f2 = 3.14f;
        
        double d1 = 6.15;
        double d2 = 9.15;
        
        System.out.println("" + f1 + " " + f2 + " " + d1 + " " + d2);
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        System.out.println("" + bool1 + " " + bool2);
        
        char x1 = 'X';
        char x2 = 600;
        char x3 = '\u0258';
        
        
        System.out.println("" + x1 + " " + x2 + " " + x3);      
        
        
    }
    
    
}
