import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int roll;
        System.out.println("enter roll number:");
        roll=obj.nextInt();
        switch(roll)
        {
            case 1:
                System.out.println("student name:aman");
                break;
            case 2:
                System.out.println("student name:mubashir");
                break;
            case 3:
                System.out.println("student name:jawad");
                break;
            default:
                System.out.println("not found");
        }
    }
}
