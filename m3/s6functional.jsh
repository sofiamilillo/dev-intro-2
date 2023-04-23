/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * An example of Functional Programming
 */

String[] data = { "hello", "welcome", "hi", "goodbye", "ciao" };

// This call to sort() is not very interesting
// java.util.Arrays.sort(data);


// High Order Function - an anonymous function (a lambda) is passed to specify _how_ to sort the data
java.util.Arrays.sort(data, (a, b) -> b.length() - a.length());

// Print the (sorted) array
System.out.println(java.util.Arrays.toString(data));

// another array
int[] array = {10,12,33};

// imperative approach to get the sum of an array
int result = 0;
for(int i = 0; i < array.length; i++) {
    result += array[i];
}
System.out.println(result);

// functional approach
int recursiveSum(int[] a, int i, int accumulator) {
	if(i == a.length) {
		return accumulator;
	} else {
		return recursiveSum(a, i + 1, accumulator + a[i]);
	}
}

// same as recursiveSum(), but more compact
int sum(int[] a, int i, int acc) {
    return i == a.length ? acc : sum(a, i + 1, acc + a[i]);
}

// hide iternal details to the user
int sum(int[] a) {
    return sum(a, 0, 0);
}

// so it is just the same for the caller
System.out.println(sum(array));
