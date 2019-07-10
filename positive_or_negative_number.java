import java.util.*;
public class positive_or_negative_number {
    public static void main(String[] args) {
        int number;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number:");
        number=obj.nextInt();
        if(number<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is positive");
        }
    }
}
