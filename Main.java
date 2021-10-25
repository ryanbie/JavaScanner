import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Declaring an object

        System.out.println("What's your first name?");
        String name = scan.next(); //contains what the user entered
        System.out.println("Hey " + name + "!");

        System.out.println("What's your age?");
        int age = scan.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.println("What's your senior quote?");
        String quote = scan.next();
        quote = quote + scan.nextLine(); // or can write quote += scan.nextLine();

        System.out.println("Thank you " + name + " for your quote");
        System.out.println(quote);


    }
}
