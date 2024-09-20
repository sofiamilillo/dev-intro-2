/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Greatest Common Divisor - recursive and iterative algorithm
 */

void main() {
    int left = 42;
    int right = 35;

    System.out.printf("Calculating GCD of %d and %d\n", left, right);
    System.out.println("Recursive: " + gcd(left, right));
    System.out.println("Iterative: " + gcdIterative(left, right));
}

//recursive
int gcd(int a, int b) {
    System.out.println(a + ", " + b);
    if (b == 0) {
        return a;
    }

    return gcd(b, a % b);
}

// iterative
int gcdIterative(int a, int b) {
    System.out.println(a + ", " + b);
    while (b != 0) {
        int temp = a;
        a = b;
        b = temp % a;
        System.out.println(a + ", " + b);
    }
    return a;
}
