import java.util.*;
public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter total classes: ");
        int total = sc.nextInt();
        System.out.print("Enter attended classes: ");
        int attended = sc.nextInt();

        double percent = (attended * 100.0) / total;

        System.out.println("Attendance Percentage: " + percent + "%");

        if (percent >= 75)
            System.out.println("Eligible for Exam");
        else
            System.out.println("Not Eligible for Exam");
    }
}

