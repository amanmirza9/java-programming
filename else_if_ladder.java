import java.util.Scanner;
public class else_if_ladder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int marks;
        char grade;
        System.out.println("enter marks:");
        marks = obj.nextInt();
        if (marks >= 95) {
            grade = 'A';
        } else if (marks >= 85) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 65) {
            grade = 'c';
        } else {
            grade = 'D';
        }
        System.out.println("your grade is" + grade);
    }
    }

