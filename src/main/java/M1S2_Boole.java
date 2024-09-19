/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Boolean variables and operators
 */

void main() {
    // a boolean variable
    boolean a = true;
    System.out.println("a is " + a);

    // another boolean variable
    boolean b = false;
    System.out.println("b is " + b);

    // AND
    boolean conjunction = a && b;
    System.out.println("a and b is " + conjunction);

    // OR
    boolean inclusiveDisjunction = a || b;
    System.out.println("a or b is " + inclusiveDisjunction);

    // NOT
    boolean negation = !a;
    System.out.println("not a is " + negation);

    // XOR
    boolean exclusiveDisjunction = a ^ b;
    System.out.println("a xor b is " + exclusiveDisjunction);
}
