/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Selection sort - most basic implementation
 */

int[] data = { 4, 5, 1, 8, 2 };
System.out.println("The array: " + java.util.Arrays.toString(data));

// for each position (but the last one)
for(int i = 0; i < data.length - 1; i++) {
    // find the position of the smallest element to the right
    int pos = i;
    for(int j = i + 1; j < data.length; j++) {
        if(data[j] < data[pos]) {
            pos = j;
        }
    }

    // swap current and minimal elements
	System.out.printf("Swap between %d and %d%n", data[i], data[pos]);
    int temp = data[i];
    data[i] = data[pos];
    data[pos] = temp;
}

System.out.println("The sorted array: " + java.util.Arrays.toString(data));
