public class Functions {
    public int factorial(int n) {
        if (n<0) throw new IllegalArgumentException("Factorial cannot take negative values");
        int result=1;
        for (int i=1;i<=n;i++) result*=i;
        return result;
    }

    public double power(double base, double exp) {
        double result = Math.pow(base, exp);
        return result;
    }

    public double loge(double x) {
        if (x<=0) throw new IllegalArgumentException("log cannot take 0 or negative values");
        double result = Math.log(x);
        return result;
    }

    public double sqroot(double x) {
        if (x<0) throw new IllegalArgumentException("sqroot cannot take negative values");
        double result = Math.sqrt(x);
        return result;
    }
}
