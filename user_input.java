import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criar objeto do tipo scanner

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        System.out.print("Enter your average score: ");
        double avg = scanner.nextDouble();
        System.out.println("Your average score is " + avg);

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent == true){
            System.out.println("Yes, you are a student");
        } else if (isStudent == false){
            System.out.println("No you are not a student");
        } else {
            System.out.print("Insert a good answer");
        }
        


        scanner.close(); //fechar
    }
}
