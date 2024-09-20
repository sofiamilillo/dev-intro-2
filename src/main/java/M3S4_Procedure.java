/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * An example of Procedural Programming
 */
void main() {
    hello();

    caller();
    f();

    hello();
}

// a global variable - accessible by all the procedures!
int count = 0;

int triple(int base) {
    count += 1;
    return base * 3;
}

void caller() {
    int value = 12;
    int result = triple(value);
    System.out.println(value + " ---> " + result);
}

void f() {
    count = triple(27);
    System.out.println(count);
}

void hello() {
    System.out.println("Hello! ... " + count);
}
