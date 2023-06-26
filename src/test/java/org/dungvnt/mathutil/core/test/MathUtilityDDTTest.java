/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.dungvnt.mathutil.core.test;

import org.dungvnt.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DungVNT
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initTestData(){
        
        Integer testData[][] = {{0, 1}, 
                                {1, 1}, 
                                {2, 2}, 
                                {3, 6},
                                {4, 24},
                                {5, 1200}};
                               //n  expected 
                               //c0  c1
        
        return testData;
    }
    //Nhồi data ở trên vào hàm assertEquals(expected-cột 1, getF(cột 0))
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
// Kĩ Thuật DDT: data driven testing - tách data kiểm thử ra khỏi câu lệnh assert()
// cho dễ theo dõi, dễ bảo trì các bộ test case, các bộ test data

//Thường dùng mảng 2 chiều để chứa bộ data test
//mảng 2  chiều gồm: các input, và expected
//các unit test framework tự động biết cách trích từng cặp 
//input/expected ở trong mảng ra rồi nhồi vào trong hàm test

//Mãng dữ liệu test case phải là public static - quy ước
