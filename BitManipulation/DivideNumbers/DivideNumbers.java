// Importing required package
import java.util.*;

class Solution {
    /* Function to divide two numbers
    without multiplication and division */
    public int divide(int dividend, int divisor) {
        
        // Base case
        if (dividend == divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == 1) return dividend;
        
        // Variable to store the sign of result
        boolean isPositive = true;
        
        // Updating the sign of quotient
        if (dividend >= 0 && divisor < 0) 
            isPositive = false;
        else if (dividend < 0 && divisor > 0)
            isPositive = false;
            
        // Storing absolute dividend & divisor
        long n = dividend;
        long d = divisor;

        n = Math.abs(n);
        d = Math.abs(d);
        
        // Variable to store the answer and sum
        long ans = 0, sum = 0;
        
        /* Looping while sum added to divisor is
        less than or equal to dividend */
        while (sum + d <= n) {
            
            // Increment the count
            ans++;
            // Update the sum
            sum += d;
        }
        
        // Handling overflowing condition
        if (ans > Integer.MAX_VALUE && isPositive) 
            return Integer.MAX_VALUE;
        if (ans > Integer.MAX_VALUE && !isPositive)
            return Integer.MIN_VALUE;
        
        /* Returning the quotient 
        with proper sign */
        return isPositive ? (int)ans : (int)(-1 * ans);
    }
}

public class Main {
    public static void main(String[] args) {
        int dividend = 10, divisor = 3;
        
        /* Creating an instance of 
        Solution class */
        Solution sol = new Solution();
        
        /* Function call to divide two numbers
        without multiplication and division */
        int ans = sol.divide(dividend, divisor);
        
        System.out.println("The result of dividing " 
                           + dividend + " and " 
                           + divisor + " is " + ans);
    }
}
