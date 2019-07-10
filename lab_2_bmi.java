
import java.util.*;
public class lab_2_bmi {
    public static void main(String[] args) {
        float weight,height_into_inches;
        double weight_pounds,bmi,height_in_feets;
        Scanner obj=new Scanner(System.in);
        System.out.println("compute the body mass index:");
        System.out.print("enter your weight=");
        weight=obj.nextInt();
        weight_pounds=weight*0.45359237;
        System.out.println("enter weight into pounds"+weight_pounds);
        System.out.print("enter height into inches=");
        height_into_inches=obj.nextInt();
        height_in_feets=height_into_inches*0.0254;
        System.out.println("height in feets="+height_in_feets);
        bmi=weight_pounds/(height_in_feets*height_in_feets);
        System.out.println("your BMI is :"+bmi);
    }
}
