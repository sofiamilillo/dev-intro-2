/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Factorial - recursive and iterative algorithm
 */

// recursive
int fact(int n) {
    if(n < 2) {
        return 1;
    }

    return n * fact(n-1);
}

// tail recursive
int factTail(int n) {
    return factTail(n, 1);
}

int factTail(int n, int accumulator) {
    return n < 2 ? accumulator : factTail(n-1, accumulator * n);
}

// iterative
int factIterative(int n) {
    int result = 1;

    for(int i = 2; i <= n; i++) {
        result *= i;
    }
    
    return result;
}
