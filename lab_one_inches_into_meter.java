import java.util.*;
public class lab_one_inches_into_meter {
    public static void main(String[] args) {
        float inches;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter inches=");
        inches=obj.nextInt();
        System.out.println("convert inches into meter="+inches*0.0254);
    }
}
