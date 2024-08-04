/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From flow chart to code: print the natural numbers in 1 .. n (provided by the user)
 */

import java.util.Scanner;

void main() {
    System.out.print("Pass me a (small) natural number: ");

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int i = 1;
    while (i <= n) {
        System.out.println(i);
        i += 1;
    }

    scanner.close();
}
