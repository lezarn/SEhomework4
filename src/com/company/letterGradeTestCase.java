package com.company;
import org.junit.*;
import static junit.framework.TestCase.assertEquals;

public class letterGradeTestCase {
    @Test
    public void letterXTest(){
        assertEquals('X', letterGrade.letterGrade(102));
        assertEquals('X', letterGrade.letterGrade(-50));
    }
    @Test
    public void letterATest(){
        assertEquals('A', letterGrade.letterGrade(95));
    }
    @Test
    public void letterBTest(){
        assertEquals('B', letterGrade.letterGrade(85));
    }
    @Test
    public void letterCTest(){
        assertEquals('C', letterGrade.letterGrade(75));
    }
    @Test
    public void letterDTest(){
        assertEquals('D', letterGrade.letterGrade(65));
    }
    @Test
    public void letterFTest(){
        assertEquals('F', letterGrade.letterGrade(30));
    }

}
