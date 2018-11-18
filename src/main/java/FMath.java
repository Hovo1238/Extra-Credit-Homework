public class FMath {
    public static int Factorial(int n){
        if(n < 0)
            throw new RuntimeException("Factorial is not defined for negative numbers");
        if(n == 0)
            return 1;
        return n * Factorial(n-1);
    }
}
