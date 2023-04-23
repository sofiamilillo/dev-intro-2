/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Jump to the next iteration in a loop with continue
 */

for(int i = 0; i < 20; i++) {
	System.out.print("[");
	if(i < 3 || i > 16) {
		System.out.print(" ? ] ");
		continue;
	}
	System.out.print(i + "] ");
}

System.out.println();
