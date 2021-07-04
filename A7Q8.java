package Assignments;
import java.util.Scanner;

public class A7Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the email");
        String Email = input.next();
        if (Email.contains("alejandro") || Email.contains("Alejandro"))
        {
            System.out.print("Read this Email");
        }
        else
        {
            System.err.println(" Do not read this Email");
        }
    }
}
