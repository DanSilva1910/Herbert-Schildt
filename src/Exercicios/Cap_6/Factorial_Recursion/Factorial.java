package Cap_6.Factorial_Recursion;

public class Factorial {

    // Simple example of recursion
    int factR(int num) {
        if( num == 1) return 1;
        int result = factR(num - 1) * num;
        return result;
    }
}
