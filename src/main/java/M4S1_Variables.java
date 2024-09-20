
void main() {
    // declaration
    int x;

    // initialization
    x = 12;

    // usage
    System.out.println(x);

    // definition
    int y = 12;

    y = x * 5;

    System.out.println(y);

    String s = "ciao";

    y = s.length();
    System.out.println(y);

    final int a = 42;
    // won't compile
//    a = 23;
    System.out.println(a);

    // unnamed temporary variable
    System.out.println(x + y);
}
