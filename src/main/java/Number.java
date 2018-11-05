public class Number {
    public double sqrtValue(double N) {
        return Math.sqrt(N);
    }

    public double squereValue(double N) {
        return Math.pow(N, 2);
    }

    public double cosValue(double N) {
        return Math.cos(N);
    }

    public int serialMethodFactorial(int N) {
        int rez = 1;
        for (int i = 1; i <= N; i++)
            rez *= i;
        return rez;
    }

    public int recursionMethodFactorial(int N) {
        if (N == 1) return 1;
        return N * recursionMethodFactorial(N - 1);
    }
}
