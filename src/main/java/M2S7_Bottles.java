/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From flow chart to code: buy n or 6 bottles of milk
 */

import java.util.Scanner;

void main() {
    int n = 1;

    System.out.print("Are there 6 fresh eggs? [y/n]: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();

    char c = input == null || input.isEmpty() ? 'y' : Character.toLowerCase(input.charAt(0));
    if (c == 'y') {
        n = 6;
    }

    System.out.println("Buy " + n + " milk bottle(s)");
    scanner.close();
}
