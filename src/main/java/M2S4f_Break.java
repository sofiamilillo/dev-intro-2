/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Interrupt a loop with break
 */

void main() {
    int value = 0;

    while (true) {
        System.out.println(value);
        value++;
        if (value > 9) {
            break;
        }
    }
}
