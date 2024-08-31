package com.example.wrapper;

import java.io.Console;

public class WrapperTest {
    // 2
    public static void main(String[] args) {
        //2.1
        Integer int1 = 10;
        Integer int2 = Integer.valueOf(20);
        Integer int3 = new Integer(30);
        Integer int4 = Integer.parseInt("40");

        Double double1 = 10.0;
        Double double2 = Double.valueOf(3120.235235);
        Double double3 = new Double(123.463);
        Double double4 = Double.parseDouble("54.42334");

        Float float1 = 10.1f;
        Float float2 = Float.valueOf(3120.235235f);
        Float float3 = new Float(453.2f);
        Float float4 = Float.parseFloat("54.42334");

        Boolean boolean1 = Boolean.TRUE;
        Boolean boolean2 = Boolean.valueOf(true);
        Boolean boolean3 = new Boolean(false);
        Boolean boolean4 = Boolean.parseBoolean("true");

        // 3
        Double double3_1;
        Float float3_1 = 44.462f;
        double3_1 = Double.valueOf(float3_1);
        // 3.1

        byte byte3_1 = double3_1.byteValue();
        short short3_1 = double3_1.shortValue();
        int int3_1 = double3_1.intValue();
        long long3_1 = double3_1.longValue();
        float float3_2 = double3_1.floatValue();

        // 4
        double nonZero = 10.0;
        double zero = 0.0;

        double resultDivNonZeroByZero = nonZero / zero;
        double resultDivZeroByZero = zero / zero;

        if (Double.isNaN(resultDivNonZeroByZero)) {
            System.out.println("Переменная = NaN");
        } else if (Double.isInfinite(resultDivNonZeroByZero)) {
            System.out.println("Переменная = Infinity");
        }

        if (Double.isNaN(resultDivZeroByZero)) {
            System.out.println("Переменная = NaN");
        } else if (Double.isInfinite(resultDivZeroByZero)) {
            System.out.println("Переменная = Infinity");
        }

        // 5
        int a = 120;
        int b = 120;

        System.out.println("a и b (120): " + (a == b));

        a = 1200;
        b = 1200;

        System.out.println(" a и b (1200): " + (a == b));



    }
}
