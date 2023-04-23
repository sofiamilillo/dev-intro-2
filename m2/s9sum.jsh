/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From flow chart / pseudo-code to code: sum of values in an array
 */

int[] data = { 1, 42, 13, 3, 45, 2 };

int result = 0;
for(int i = 0; i < data.length; i++) {
	result += data[i];
}

System.out.println("Sum of array is " + result);