package com.company;
import junit.framework.TestCase;
import org.junit.*;
import com.company.letterGrade;
public class letterGradeBoundaryTest {
    @Test
    public void BoundaryTestX(){
        TestCase.assertEquals('X', letterGrade.letterGrade(101));
        TestCase.assertEquals('X', letterGrade.letterGrade(-1));
    }
    @Test
    public void BoundaryTestA(){
        TestCase.assertEquals('A', letterGrade.letterGrade(100));
        TestCase.assertEquals('A', letterGrade.letterGrade(90));
    }
    @Test
    public void BoundaryTestB(){
        TestCase.assertEquals('B', letterGrade.letterGrade(89));
        TestCase.assertEquals('B', letterGrade.letterGrade(80));
    }
    @Test
    public void BoundaryTestC(){
        TestCase.assertEquals('C', letterGrade.letterGrade(79));
        TestCase.assertEquals('C', letterGrade.letterGrade(70));
    }
    @Test
    public void BoundaryTestD(){
        TestCase.assertEquals('D', letterGrade.letterGrade(69));
        TestCase.assertEquals('D', letterGrade.letterGrade(60));
    }
    @Test
    public void BoundaryTestF(){
        TestCase.assertEquals('F', letterGrade.letterGrade(59));
        TestCase.assertEquals('F', letterGrade.letterGrade(0));
    }
}
