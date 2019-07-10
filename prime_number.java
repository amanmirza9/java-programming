import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        int age;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your age");
        age=obj.nextInt();
        if (age<=10)
        {
            System.out.println("childhood");
        }
        else if (age<=18){
            System.out.println("adult");

        }
        else
        {
            System.out.println("u are not in a category of childhood and adult");
        }

    }
}
