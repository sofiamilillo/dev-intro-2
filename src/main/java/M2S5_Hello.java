/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From a flow chart to code: say hello to the user
 */

import java.util.Scanner;

void main() {
    System.out.print("What's your name? ");

    Scanner scanner = new Scanner(System.in);
    String next = scanner.next();

    String message = "Hello, ";

    if (next.equals("Tom")) {
        message += next;
    } else {
        message += "stranger";
    }

    System.out.println(message);
    scanner.close();
}
