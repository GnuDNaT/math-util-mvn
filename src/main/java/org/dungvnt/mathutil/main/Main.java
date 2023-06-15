/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dungvnt.mathutil.main;

import org.dungvnt.mathutil.core.MathUtility;

/**
 *
 * @author DungVNT
 */
public class Main {
     public static void main(String[] args) {
        //Test case #1: n = 0
        System.out.println("Check getF(0) 0! | Expected: 1 | Actual: " + MathUtility.getFactorial(0));

        //Test case #2: n = 1
        System.out.println("Check getF(1) 1! | Expected: 1 | Actual: " + MathUtility.getFactorial(1));

        //Test case #3: n = 2
        System.out.println("Check getF(2) 2! | Expected: 2 | Actual: " + MathUtility.getFactorial(2));
        
        //Test case #4: n = 3
        System.out.println("Check getF(3) 3! | Expected: 6 | Actual: " + MathUtility.getFactorial(3));
        
        //Test case #5: n = 5
        System.out.println("Check getF(5) 5! | Expected: 120 | Actual: " + MathUtility.getFactorial(5));
        
        //am gia thua thi sao
        //Test case #6: n = -1
//        System.out.println("Check getF(-1) (-1)! | Expected: Exception | Actual: " );
//        MathUtility.getFactorial(-1);  //vi ngoai le se ngat lenh println()
//                                        //In truoc roi cho ngoai le xh
    }

}
