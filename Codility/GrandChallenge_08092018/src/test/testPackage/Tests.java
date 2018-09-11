package testPackage;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import solutionPackage.NaiveSolution;
import solutionPackage.Solution3;

import java.util.concurrent.ThreadLocalRandom;

public class Tests {

    Solution3 solution = new Solution3();
    NaiveSolution naiveSolution = new NaiveSolution();
    String testStirngInput;

    public void postTests() {
        System.out.println("postTests");

        int naiveSolutionCount = naiveSolution.solution(testStirngInput);
        System.out.println("Naive solution: " + naiveSolutionCount);
        System.out.println("Naive solution: " + naiveSolution.getNaiveSolutionString());


        Assertions.assertEquals(naiveSolutionCount, solution.solution(testStirngInput));
    }

    public void testTemplate(String testStirngInput, int expected) {
        System.out.println("Test Case: " + testStirngInput);
        this.testStirngInput = testStirngInput;

        postTests();
        Assertions.assertEquals(expected, solution.solution(this.testStirngInput));
    }

    public void testComment() {
        System.out.println("test case " + testStirngInput);
        System.out.println("Naive " + naiveSolution.solution(testStirngInput));
        System.out.println("Normal" + solution.solution(testStirngInput));
    }

    @Test
    public void test1 () {
        testStirngInput = "cabbacc";
        Assertions.assertEquals(4, solution.solution(testStirngInput));
        //postTests();
    }

    @Test
    public void test2 () {
        testStirngInput = "abababa";
        Assertions.assertEquals(6, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test3 () {
        testStirngInput = "aaaaaaa";
        Assertions.assertEquals(0, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test4 () {
        testStirngInput = "aaccab";
        Assertions.assertEquals(4, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test5 () {
        testStirngInput = "ab";
        Assertions.assertEquals(2, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test6 () {
        testStirngInput = "abb";
        Assertions.assertEquals(2, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test7 () {
        testStirngInput = "bbbccc";
        Assertions.assertEquals(6, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test8 () {
        testStirngInput = "abbbccc";
        Assertions.assertEquals(6, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test9 () {
        testStirngInput = "bbbccca";
        Assertions.assertEquals(6, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test10 () {
        testStirngInput = "aabb";
        Assertions.assertEquals(4, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test11 () {
        testTemplate("aabbccbc", 6);

//        testStirngInput = "aabbccbc";
//        Assertions.assertEquals(6, solution.solution(testStirngInput));
//        postTests();
    }

    @Test
    public void test12 () {
        testStirngInput =  "";
        Assertions.assertEquals(0, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test13 () {
        testStirngInput = "abc";
        Assertions.assertEquals(2, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test14 () {
        //testStirngInput = "ccacaaccabbabbba";
        //Assertions.assertEquals(8, solution.solution(testStirngInput));
        //postTests();

        testTemplate("ccacaaccabbabbba", 8);
    }

    @Test
    public void test15 () {
        testStirngInput = "aadabdabaaccdabbdadb";
        Assertions.assertEquals(4, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test16() {
        testStirngInput = "dabdddcaab";
        Assertions.assertEquals(2, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test17() {
        testStirngInput = "bcccaccacccccabddcda";
        Assertions.assertEquals(4, solution.solution(testStirngInput));
        postTests();
    }

    @Test
    public void test18 () {
        testTemplate("abcddaccbcaaaccdbaad", 6);
    }

    @Test
    public void testRandom () {
        int testCaseLength = 30;
        int numberOfTest = 100;

        for (int i = 0; i < numberOfTest; i++) {

            String s = "";
            for (int j = 0; j < testCaseLength; j++) {
                int randomNum = ThreadLocalRandom.current().nextInt(97, 101);
                s += (char)randomNum;
            }

            testStirngInput = s;
            testComment();

            postTests();


        }
    }







}
