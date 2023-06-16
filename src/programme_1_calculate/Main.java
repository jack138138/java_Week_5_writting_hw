package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */

public class Main {
    public static void main(String[] args) {
        // Declaring a scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println(" Please enter First number :"); //input wizard
            int a = scanner.nextInt();
            System.out.println("Please enter Second number "); // input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter one of Symbol +, - , /, * :"); //input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateresult(a, b, symbol);
            System.out.println("would you like to do more calculation please enter 'Y' or 'N' :"); //input wizard
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("Y"));
        //Closing a scanner object
        scanner.close();


        }
    }

