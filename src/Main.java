
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
          //Age
        System.out.println("Enter your age:");
        String age = scanner.nextLine();
        //gpa
        System.out.print("What is your GPA:");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name +"You are " + age +"years old ");
        System.out.print("Your GPA is "+ gpa);

        scanner.close();
    }

}