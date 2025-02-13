/*
Nth Element Of Modified Fibonacci Series
You have been given two integers ‘X’ and ‘Y’ which are the first two integers of a series and an integer ‘N’. You have to find the Nth number of the series using the Fibonacci rule given by f(x) = f(x - 1) + f(x - 2).
The answer may be very large, return it after modulus 10 ^ 9 + 7. 
*/

import java.util.Scanner;
public class fibonacci{
    static final int mod = 1000000007;

    public static void main(String[] args){
        int x= 5;
        int y=8;
        int n = 10;

        int fibN = fibonacci(x, y, n);
        System.out.println(fibN);
    }

    public static int fibonacci(int x, int y, int n){
        int ans = 0;

        if(n==1){
            return x % mod;
        }

        if(n==2){
            return y % mod;
        }

        int prev2 = x%mod;
        int prev1 = y%mod;

        for(int i=3; i<=n; i++){
            ans = (prev1 + prev2)%mod;
            prev2 = prev1;
            prev1 = ans;
        }

        return ans;
    }
}