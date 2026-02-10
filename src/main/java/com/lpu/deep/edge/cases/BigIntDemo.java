package com.lpu.deep.edge.cases;

import java.math.BigInteger;

public class BigIntDemo {
    public static void main(String[] args) {
        long maxLong = Long.MAX_VALUE;

        long overflowed = maxLong * 10;
        System.out.println("Overflowerd Long: " + overflowed);

        BigInteger bigNum = BigInteger.valueOf(maxLong);
        BigInteger result = bigNum.multiply((BigInteger.valueOf(10)));
        System.out.println("BigINteger Result: " + result);
    }
}
