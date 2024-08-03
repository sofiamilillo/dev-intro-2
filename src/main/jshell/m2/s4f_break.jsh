/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Interrupt a loop with break
 */

int i = 0;

while(true) {
	System.out.println(i);
	i++;
	if(i > 9) {
		break;
	}
}
