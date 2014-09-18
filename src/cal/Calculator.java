package cal;

import java.util.Scanner;

/**
 * The Class Calculator.
 */
public class Calculator {

    private Parser parser;

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        String input = "";
        boolean isTryAgain = true;
        do {

            System.out.print("Enter: ");
            input = scanInput();

            isTryAgain = input.toLowerCase().equals("quit");

            cal.setInputExpression(input);
            System.out.println("Result:\n" + cal.execute() + "\n");

        } while (isTryAgain);

        System.out.println("Bye!");

    }

    public static String scanInput() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        return input;
    }

    public void setInputExpression(final String input) {
        ParserFactory factory = new ParserFactory();
        factory = new ParserFactory();
        parser = factory.createParser(input);
    }

    public String execute() {
        return parser.execute();
    }

}
