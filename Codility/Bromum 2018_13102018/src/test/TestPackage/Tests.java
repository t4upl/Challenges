package TestPackage;

import SolutionPackage.Solution1;
import SolutionPackage.Solutionable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests {

    boolean isPostTestOn = false;
    Solutionable solution ;

    int N;
    int Q;
    int[] B;
    int[] C;

    @BeforeEach
    private void preTest () {
        this.solution = new Solution1();
    }

    @AfterEach
    private void postTest () {
        if (isPostTestOn) {

        }
    }

    void putTestVariables (int N, int Q, int[] B, int[] C) {
        this.N = N;
        this.Q = Q;
        this.B = B;
        this.C = C;
    }

    int callSolution() {
        return this.solution.solution(this.N, this.Q, this.B, this.C);
    }


    @Test
    public void test1 () {
        putTestVariables(3, 2, new int[] {1, 2, 0, 1, 1, 0, 0, 1},  new int[]{0, 3, 0, 2, 0, 3, 0, 0});
        int result = callSolution();
        int expectedResult = 4;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void test2() {
        putTestVariables( 2, 2, new int[]{0, 1}, new int[] {5, 5});
        int result = callSolution();
        int expectedResult = -1;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void test3() {
        putTestVariables( 2, 2, new int[] {0, 1, 0, 1, 0, 1}, new int[] {1, 3, 0, 0, 3, 3});
        int result = callSolution();
        int expectedResult = 5;
        Assertions.assertEquals(expectedResult, result);
    }


    @Test
    public void test4() {
        putTestVariables( 1, 1, new int[] {0}, new int[] {1});
        int result = callSolution();
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void test5() {
        putTestVariables( 1, 2, new int[] {0}, new int[] {1});
        int result = callSolution();
        int expectedResult = -1;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void test6() {
        putTestVariables( 1, 1, new int[] {0}, new int[] {10});
        int result = callSolution();
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void test7() {
        putTestVariables( 2, 2, new int[] {0, 1, 1, 0}, new int[] {0, 0, 1, 1});
        int result = callSolution();
        int expectedResult = -1;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void test8() {
        putTestVariables( 2, 2, new int[] {0, 1, 1, 1}, new int[] {0, 0, 1, 1});
        int result = callSolution();
        int expectedResult = 3;
        Assertions.assertEquals(expectedResult, result);
    }
}
