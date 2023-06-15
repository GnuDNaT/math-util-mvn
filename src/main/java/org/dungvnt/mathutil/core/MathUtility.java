/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dungvnt.mathutil.core;

/**
 *
 * @author DungVNT
 */
public class MathUtility {

    public static final double PI = 3.1415;

    // ham tinh n! = 1.2...n
    // 0! = 1! = 1
    // ko co giai thua am
    // 21 giai thu la vuot kieu long ko chua noi, vuot 18 con so
    //gai rang buoc dau vao cho ham/method
    public static long getFactorial(int n) {
        //TODO
        long product = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
