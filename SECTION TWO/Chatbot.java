import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + "! I am Javabot. Where are you from?");
        String home = scan.nextLine();

        System.out.println("\nI hear it is beautiful at " + home + "! I am from a place called Oracle");
        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("\nSo you are " + age + ", cool! I am 400 years old.");
        System.out.println("This means I am " + (400/age) + " times older than you.");
        System.out.println("Enough about me. What is your favorite language? (just don't say Python)");

        scan.nextLine();
        String language = scan.nextLine();

        System.out.println("\n" + language + ", that is great! Nice chatting with you " + name + ". I have to log off now. See ya!");
    }
    }
}
