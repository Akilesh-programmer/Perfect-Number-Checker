package com.akilesh;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0; // Variable to store the sum of factors.
        int divisor = 0;
        while (true) {
            divisor++;
            if (number == divisor) {
                break;
            }
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        return sum == number;
        }
}
