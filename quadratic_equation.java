import java.util.*;
public class quadratic_equation {
    public static void main(String[] args) {
        float a,b,c;
        double x1,x2;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter variable a:");
        a=obj.nextInt();
        System.out.println("enter variable b:");
        b=obj.nextInt();
        System.out.println("enter variable c:");
        c=obj.nextInt();
        x1=-b+Math.sqrt((Math.pow(b,2)-4*a*c))/2*a;
        x2=-b-Math.sqrt((Math.pow(b,2)-4*a*c))/2*a;
        System.out.println("the quadratic equation is"+x1+","+x2);
    }
}
