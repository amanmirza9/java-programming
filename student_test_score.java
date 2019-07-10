import java.util.*;
public class student_test_score {
    public static void main(String[] args) {
        double s1,s2,s3,s4,s5;
        int student_marks=5;
        char student_name=5;
        double[][] student_Score = new double[student_name][student_marks];
        char[] grades = new char[5];
        String[] names = new String[student_name];
        Scanner  obj = new Scanner(System.in);
        System.out.println("Enter student's name");
        String student1 = obj.nextLine();
        System.out.println("Now enter student's first test score");
        s1=Double.parseDouble(obj.nextLine());
        System.out.println("Enter student's name");
        String student2 = obj.nextLine();
        System.out.println("Now enter student's second test score");
        s2=Double.parseDouble(obj.nextLine());
        System.out.println("Enter student's name");
        String student3 = obj.nextLine();
        System.out.println("Now enter student's first test score");
        s3=Double.parseDouble(obj.nextLine());
        System.out.println("Enter student's name");
        String student4 = obj.nextLine();
        System.out.println("Now enter student's second test score");
        s4=Double.parseDouble(obj.nextLine());
        System.out.println("Enter student's name");
        String student5 = obj.nextLine();
        System.out.println("Now enter student's first test score");
        s5=Double.parseDouble(obj.nextLine());
        double average;
        average=s1/5.0;
        average=s2/5.0;
        average=s3/5.0;
        average=s4/5.0;
        average=s5/5.0;
        char grade;
        if(average >=90)
            grade='A';
        else if(average >=80 && average <=89.99)
            grade='B';
        else if(average >=70 && average <=79.99)
            grade='C';
        else if(average >=60 && average <=69.99)
            grade='D';
        else
            grade='E';
        System.out.println("your result  is="+student1+average+s1+grade);
        System.out.println("your result is="+student2+average+s2+grade);
        System.out.println("your result is="+student3+average+s3+grade);
        System.out.println("your result is="+student4+average+s4+grade);
        System.out.println("your result is="+student5+average+s5+grade);
    }
}