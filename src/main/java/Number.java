public class Number {
    public double sqrtValue(double n) {
        return Math.sqrt(n);
    }

    public double squereValue(double n) {
        return Math.pow(n, 2);
    }

    public double cosValue(double n) {
        return Math.cos(n);
    }

    public int serialMethodFactorial(int n) {
        int rez = 1;
        for (int i = 1; i <= n; i++)
            rez *= i;
        return rez;
    }

    public int recursionMethodFactorial(int n) {
        if(n==0) return 1;
        if (n == 1) return 1;
        return n * recursionMethodFactorial(n - 1);
    }
}
