import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    int M;
    int N;
    int A[][];

    @Test
    public void test1 () {
        M = 5;
        N = 5;
        A = new int[][]{
                {1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 0, 1, 0},
                {1, 1, 1, 0, 1},
                {1, 1, 1, 0, 0},
        };

        Solution solution = new Solution(M, N, A);
        Assertions.assertEquals(new ArrayList<String>(
                Arrays.asList("1 3", "3 1")), solution.solve());
    }


    @Test
    public void test2 () {
        M = 5;
        N = 6;
        A = new int[][]{
                {0, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 0, 1},
                {0, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1},
                {0 ,1, 0, 1, 0, 0}
        };

        Solution solution = new Solution(M, N, A);
        Assertions.assertEquals(new ArrayList<String>(
                Arrays.asList("1 2", "3 1")), solution.solve());
    }

    @Test
    public void test3 () {
        M = 5;
        N = 6;
        A = stringToArray("1 0 1 0 1 1",
                "1 0 1 1 1 1",
                "1 0 1 1 1 1",
                "1 1 1 1 1 1",
                "0 1 1 1 1 1");

        Solution solution = new Solution(M, N, A);
        Assertions.assertEquals(new ArrayList<String>(
                Arrays.asList("1 4",
                        "2 3",
                        "2 4",
                        "3 2",
                        "3 3",
                        "3 4")), solution.solve());
    }

    private int[][] stringToArray (String... strings) {
        int M = strings.length;
        int N = strings[0].length() -
                strings[0].replaceAll(" ","").length() + 1;
        int[][] A = new int [M][N];

        for (int i = 0; i < M; i++) {
            String[] stringArray = strings[i].split(" ");
            for (int j = 0; j < stringArray.length; j++) {
                A[i][j] =  Integer.parseInt(stringArray[j]);
            }
        }

        return A;
    }

}
