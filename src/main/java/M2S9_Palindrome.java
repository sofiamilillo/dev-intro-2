/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From flow chart / pseudo-code to code: is a palindrome?
 */

void main() {
    // indices: 0123
    String s = "abba";

    boolean isPal = true;

    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
        if (s.charAt(i) != s.charAt(j)) {
            isPal = false;
            break;
        }
    }

    System.out.println(s + " is a palindrome? " + isPal);
}
