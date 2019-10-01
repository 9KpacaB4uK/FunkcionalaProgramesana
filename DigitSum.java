package com.company;

public class DigitSum {

    public static void main(String[] args) {
	System.out.println("55,res:"+superDigit(55));
	System.out.println("121,res:"+superDigit(121));
	System.out.println("7,res:"+superDigit(7));
    }
    static long superDigit(long x) {
        if (x == 0) {
            return 0;
        }
        return (x % 10 + superDigit(x / 10));
    }
}
