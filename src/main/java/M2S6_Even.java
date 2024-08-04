/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From flow chart to code: print only the even numbers in an array
 */

/**
 * This code almost doesn't look Java The idea is following the related
 * flowchart blindly. We'll see how to rewrite it in a more idiomatic way
 */
void main() {
    // an array of integers
    int[] data = { 1, 42, 13, 3, 45, 2 };

    if (data.length == 0) {
        System.out.println("Done");
    } else {
        int i = 0;

        while (true) {
            // check if the current value in the array is even
            if (data[i] % 2 == 0) {
                System.out.println(data[i]);
            }

            // check if it is the last element
            if (i == data.length - 1) {
                break;
            }
            i = i + 1;
        }
        System.out.println("Done");
    }
}
