package p4;

import p1.*;
import p1.p2.p3.*;
import p4.p5.*;
import static p1.p2.B.*;

public class D {

    public static void main(String[] args) {
        A aa1 = new A();
        System.out.println(aa1.a1);
        
        C cc1 = new C();
        System.out.println(cc1.c1);
        
        E ee1 = new E();
        System.out.println(ee1.e1);
        
        //B bb1 = new B();
        System.out.println(a + " " + b);

    }

}
