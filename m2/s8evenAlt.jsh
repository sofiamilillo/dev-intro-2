/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From pseudo-code to code: print even values only from an array
 */

int[] data = { 1, 42, 13, 3, 45, 2 };

for(int i = 0; i < data.length; i++) {
	if(data[i] % 2 == 0) {
		System.out.println(data[i]);
	}
}
