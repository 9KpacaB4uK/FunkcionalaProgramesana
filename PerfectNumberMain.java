package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

enum STATE {
    PERFECT,
    ABUNDANT,
    DEFICIENT;
}
public class PerfectNumberMain {
    public static void main(String[] args) {
        System.out.println("START:");
        System.out.println("6 is "+PerfectNumber.detect(6));
        System.out.println("28 is "+PerfectNumber.detect(28));
        System.out.println("-105 is "+PerfectNumber.detect(-105));
        System.out.println("1 is "+PerfectNumber.detect(1));
        System.out.println("999 is "+PerfectNumber.detect(999));
        //System.out.println(PerfectNumber.divisors(6));
    }
}
class PerfectNumber {
    public static STATE detect(int k) {
        return process(k);
    }

    public static STATE process(int i) {
        int sum = IntStream
                .range(1, i)
                .filter(j -> i % j == 0)
                .sum();
        if(sum == i)
            return STATE.PERFECT;
        if (sum < i)
            return STATE.DEFICIENT;
        else
            return STATE.ABUNDANT;
    }

    public static Set<Integer> divisors(int k) {
        return IntStream
                .range(1, k + 1)
                .filter(i -> k % i == 0)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
    }
}
