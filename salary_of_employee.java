import java.util.*;
public class salary_of_employee {
    public static void main(String[] args) {
        int salary_of_employee;
        Scanner obj = new Scanner(System.in);
        System.out.println("salary of employee:");
        salary_of_employee = obj.nextInt();
        if ((salary_of_employee == 25000 || salary_of_employee <= 35000))
        {
            System.out.println("research assistant");
        }
        else if((salary_of_employee == 36000 || salary_of_employee <= 50000))
        {
            System.out.println("junior lecturer");
        }
        else if((salary_of_employee == 51000 || salary_of_employee <= 65000))
        {
            System.out.println("lecturer");
        }
        else if((salary_of_employee == 66000 || salary_of_employee <= 80000))
        {
            System.out.println("assistant professor");
        }
        else
        {
           System.out.println("invalid salary");
        }
    }
}
