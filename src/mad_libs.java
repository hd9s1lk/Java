import java.util.Scanner;

public class mad_libs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write an adjective: ");
        String adj1 = scanner.nextLine();

        System.out.println("Please write an adjective: ");
        String adj2 = scanner.nextLine();

        System.out.println("Please write an adjective: ");
        String adj3 = scanner.nextLine();

        System.out.println("Please write a noun: ");
        String noun1 = scanner.nextLine();

        System.out.println("Please write a verb: ");
        String verb1 = scanner.nextLine();



        System.out.println("Today I went to a " + adj1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + "was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        scanner.close();

    }
}
