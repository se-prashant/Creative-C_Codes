import java.io.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger fac;
        fac = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++)
        fac = fac.multiply(BigInteger.valueOf(i));

        System.out.println(fac);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
