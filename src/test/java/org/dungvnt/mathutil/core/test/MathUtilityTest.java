/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.dungvnt.mathutil.core.test;

import static org.dungvnt.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author DungVNT
 */
public class MathUtilityTest {

    //test ngoại lệ thì sao?
    @Test    //(expected=tên-ngoại-lệ.class)
    public void testFactorialGivenWrongException() {
        //assertThrows(expectedType, executable);
        //       Ngoại lệ cần bắt       Đoạn code gây ra ngoại lệ
        //                              đưa 1 object chưuas đoạn code dây ngoại lệ
        //                              Lambda expression đưua vào 
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                getFactorial(-5);
            }
        };
        
        Executable exLambda = () -> getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }

    @Test
    public void testFactorialGivenRightArguementReturnWell() {
//        assertEquals(69,69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
    }

}
