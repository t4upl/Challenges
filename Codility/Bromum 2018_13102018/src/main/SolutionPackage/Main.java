package SolutionPackage;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello");

        Solution1 solution1 = new Solution1();
        int result  = solution1.solution(3, 2, new int[] {1, 2, 0, 1, 1, 0, 0, 1},  new int[]{0, 3, 0, 2, 0, 3, 0, 0});
        System.out.println("Result " + result);

    }
}
