package sg.edu.nus.iss;

import java.io.Console;
import java.text.Format;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console con = System.console();
        String name = con.readLine("What's your name ");
        if (name.isEmpty()) {
            System.out.println("You have not told me your name");
        } else {
        // Different ways to print
        System.out.printf("Hello %s. Pleased to meet you.\n", name);
        System.out.println("Hello " + name + ". Pleased to meet you");
        }

        Integer age = 80;
        System.out.printf("\n%s is %d years old", name, age);

        //Slide 17
        String input = con.readLine();
        input.trim();

        if (input.equals("swim")) {
            System.out.println("The nearest swimming pool is Clementi");
        } else if (input.equals("jog")) {
            System.out.println("The nearest park is West Coast Park");
        } else if (input.equals("cycle")) {
            System.out.println("You can cycle along the PCN");
        } else {
            System.out.println("dang, you boring");
        }
    }
}
