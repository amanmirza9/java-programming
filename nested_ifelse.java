import java.util.Scanner;
public class nested_ifelse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter number a:");
        a=obj.nextInt();
        System.out.println("enter number b:");
        b=obj.nextInt();
        System.out.println("enter number c:");
        c=obj.nextInt();
        if(a>b)
        {
            if (a > b) {
                System.out.println("greater value is" + a);
            }
        }
            else
                {
                    System.out.println("greater value is"+c);
                }//we can also use else in if
            if(b>a)
            {
                if(b>c)
                {
                    System.out.println("greater is "+b);
                }
                else
                    {
                        System.out.println("greater is "+c);
                    }
            }
        }
    }

