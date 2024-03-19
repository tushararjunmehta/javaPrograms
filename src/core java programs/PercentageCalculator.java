import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {

        System.out.println("enter marks of the student in 5 subjects");
        Scanner sc = new Scanner(System.in);
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();
        float m5 = sc.nextFloat();

        System.out.println("enter total marks");
        float totalmarks = sc.nextFloat();

        float percentage = ((m1 + m2 + m3 + m4 + m5) / totalmarks) * 100;
        System.out.println("percentage of student is " + percentage);
    }
}