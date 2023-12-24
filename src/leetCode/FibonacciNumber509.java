package leetCode;

public class FibonacciNumber509 {
    public int fib(int n) {
        //
        int f0 = 0, f1 = 1, fn = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int i = 2; i <= n; i++) {
            fn = f1+f0;
            f0 = f1;
            f1 = fn;

        }
        return fn;
    }

    public static void main(String[] args) {
        FibonacciNumber509 f = new FibonacciNumber509();
        System.out.println(f.fib(0));//2
        System.out.println(f.fib(10));//3
    }
}
