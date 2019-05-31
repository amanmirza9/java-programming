import java.util.Scanner;
public class conditional_operator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter first number:");
        a=obj.nextInt();
        System.out.println("enter second number:");
        b=obj.nextInt();
        c=(a>b)?a:b;
        System.out.println("greater value is"+c);
    }
}
