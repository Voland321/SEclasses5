/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.seclasses5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsiwek
 */
public class SuperAdditionTest {
    
    public SuperAdditionTest() {
    }

    @Test
    public void testSuperaddition() {
        System.out.println("superaddition");
        String a = "1";
        String b = "2";
        String expResult = "4";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testSuperadditionRoman() {
        System.out.println("superadditionroman");
        String a = "V";
        String b = "IV";
        String expResult = "IX";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperaddition2() {
        System.out.println("superaddition2");
        String a = "1";
        String b = "1";
        String expResult = "3";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperaddition3() {
        System.out.println("superaddition3");
        String a = "0";
        String b = "0";
        String expResult = "1";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }



    @Test
    public void testSuperadditionS452483_001() {
        System.out.println("superaddition3");
        String a = "2";
        String b = "1";
        String expResult = "452486";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionS452483_002() {
        System.out.println("superaddition3");
        String a = "4";
        String b = "2";
        String expResult = "452489";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionS452483_003() {
        System.out.println("superaddition3");
        String a = "-1";
        String b = "0";
        String expResult = "452482";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSuperadditionKS1() {
        System.out.println("superadditionKS");
        String a = "2";
        String b = "3";
        String expResult = "8";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSuperadditionKS2() {
        System.out.println("superadditionKS");
        String a = "1";
        String b = "3";
        String expResult = "6";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionKS3() {
        System.out.println("superadditionKS");
        String a = "3";
        String b = "3";
        String expResult = "10";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSuperadditionDP1(){
        System.out.println("superadditionDP1");
        String a = "12";
        String b = "1";
        String expResult = "10";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionDP2(){
        System.out.println("superadditionDP1");
        String a = "3";
        String b = "0";
        String expResult = "13";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionDP3(){
        System.out.println("superadditionDP1");
        String a = "-3";
        String b = "-3";
        String expResult = "6";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSuperadditionMD1() {
        System.out.println("superaddition");
        String a = "I";
        String b = "I";
        String expResult = "II";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionMD2() {
        System.out.println("superaddition");
        String a = "3";
        String b = "3";
        String expResult = "18";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionMD3() {
        System.out.println("superaddition");
        boolean a = true;
        boolean expSubstraction = true;
        assertEquals(expSubstraction, a);
        //????????????????
    }
    @Test
    public void testSuperaddition452496_1(){
        System.out.println("Michał Osiński");
        String a = "6";
        String b = "6";
        String expResult = "13";
        String result = SuperAddition.superaddition(a,b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperaddition452496_2(){
        System.out.println("Michał Osiński");
        String a = "9";
        String b = "-2";
        String expResult = "19";
        String result = SuperAddition.superaddition(a,b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperaddition452496_3(){
        System.out.println("Michał Osiński");
        String a = "8";
        String b = "9";
        String expResult = "1";
        String result = SuperAddition.superaddition(a,b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSuperadditionAK1(){
        String a = "X";
        String b = "1";
        String expResult="11";
        String result = SuperAddition.superaddition(a,b);
        assertEquals(expResult,result);
    }
        @Test
    public void testSuperadditionAK2(){
        String a = "15";
        String b = "-X";
        String expResult = "V";
        assertEquals(expResult,SuperAddition.superaddition(a,b));
    }
        @Test
    public void testSuperadditionAK3(){
        String a ="0";
        String b="III";
        String expResult="3";
        String result = SuperAddition.superaddition(a,b);
        assertEquals(expResult,result);
        
    }
    @Test
    public void testSuperadditionJS1() {
        System.out.println("SuperAdditionJS1");
        String a = "XXV";
        String b = "XXV";
        String expResult = "C";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionJS2() {
        System.out.println("SuperAdditionJS2");
        String a = "D";
        String b = "D";
        String expResult = "DD";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuperadditionJS3() {
        System.out.println("SuperAdditionJS3");
        String a = "-50";
        String b = "49";
        String expResult = "1";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
    }

}
