import java.util.Scanner;
public class if_statements {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int sal,b;
        System.out.println("enter your salary");
        sal=obj.nextInt();
        if(sal>=10000)
        {
            b = (sal * 10) / 100;
            sal=sal+b;
        }
        System.out.println("salary is"+sal);
    }
}
