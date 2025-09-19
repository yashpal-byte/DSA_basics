package net.javaguides.java;

import java.util.Scanner;

public class BooleanExpression {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean a, b, c,d,e,f;
        double x, y;

        System.out.println("give me 2 numbers. first ");
        x = keyboard.nextDouble();
        System.out.println("second");
        y = keyboard.nextDouble();

        a = x<y;
        b = x<=y;
        c = x==y;
        d = (x!=y);
        e = x>y;
        f = x>=y;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);     

    }

}
