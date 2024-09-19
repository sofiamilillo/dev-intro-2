/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Decision by if-else
 */

void main() {
    int a = 7;
    System.out.println("a is " + a);

    int b = 3;
    System.out.println("b is " + b);

    // if
    if (a < b) {
        System.out.println("a is less than b");
    }

    // if - else
    if (a == b) {
        System.out.println("a is equal to b");
    } else {
        System.out.println("a is not equal to b");
    }

    // if - else if
    if (a > b) {
        System.out.println("a is bigger than b");
    } else if (b > a) {
        System.out.println("b is bigger than a");
    }

    // if - else if - else
    if (a > b) {
        System.out.println("a is bigger than b");
    } else if (b > a) {
        System.out.println("b is bigger than a");
    } else {
        System.out.println("a is equal to b");
    }

    // ...
    System.out.println("Done!");
}
