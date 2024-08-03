/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From flow chart / pseudo-code to code: max value in an array
 */

int[] a = { 12, 3, -10, 0, 50, 15 };
// indices   0  1    2  3   4   5

int max = a[0];

for(int i = 1; i < a.length; i++) {
    if(a[i] > max) {
        max = a[i];
    }
}

System.out.println("The biggest value is: " + max);
