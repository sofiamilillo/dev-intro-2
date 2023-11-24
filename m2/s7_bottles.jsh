/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * From a flow chart to code: buy n or 6 bottles of milk
 *
 * To run a script in the local JVM (to access System.in): jshell --execution local script.jsh
 */

int n = 1;

System.out.print("Are there 6 fresh eggs? [y/n]: ");
Scanner scanner = new Scanner(System.in);
String next = scanner.next();

char c = next == null || next.isEmpty() ? 'y' : Character.toLowerCase(next.charAt(0));
if(c == 'y') {
	n = 6;
}

System.out.println("Buy " + n + " milk bottle(s)");

/exit
