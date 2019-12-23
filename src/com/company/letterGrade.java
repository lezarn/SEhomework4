package com.company;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class letterGrade {

    public static char letterGrade(int score) {
        char grade;
        if (score < 0 || score > 100)
            grade = 'X';
        else if (score >= 90 && score <= 100)
            grade = 'A';
        else if (score >= 80 && score < 90)
            grade = 'B';
        else if (score >= 70 && score < 80)
            grade = 'C';
        else if (score >= 60 && score < 70)
            grade = 'D';
        else
            grade = 'F';
        return grade;

    }

    public static void main(String[] args) {

        Result TestResult = JUnitCore.runClasses(letterGradeTestCase.class);

        for(Failure failure: TestResult.getFailures()){
            System.out.println(failure.toString());
        }

        if(TestResult.wasSuccessful())
            System.out.println("letterGradeTestCase is passed");

        TestResult = JUnitCore.runClasses(letterGradeBoundaryTest.class);

        for(Failure failure: TestResult.getFailures()){
            System.out.println(failure.toString());
        }

        if(TestResult.wasSuccessful())
            System.out.println("letterGradeBoundaryTest is passed");

        System.out.print("Enter the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            char grade = letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
