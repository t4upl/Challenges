import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
public class SendVersion {
    public static void main(String[] args) {
        BufferedReader in;
        int x = -1,y = -1;
        try {
            in = new BufferedReader(new FileReader(new File(args[0])));
            int M = Integer.valueOf(in.readLine());
            int N = Integer.valueOf(in.readLine());
            int A[][] = new int[M][N];
            for (int i = 0; i < M; i++) {
                String[] line = in.readLine().split(" ");
                for (int j = 0; j < line.length; j++) {
                    A[i][j] = Integer.valueOf(line[j]);
                }
            }

            Solution solution = new Solution(M, N, A);



            for (String string : solution.solve()) {
                System.out.println(string);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        /* YOUR CODE HERE */

    }


    public static class Solution {

        int M;
        int N;
        int [][] A;

        public Solution (int M, int N, int [][] A) {
            this.M = M;
            this.N = N;
            this.A = A;
        }

        public List<String> solve () {
            List<String> list = new LinkedList<>();
            for (int i = 0 ; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (isCenter(i, j)) {
                        list.add(i+" "+j);
                        updateStar(i, j);

                    }
                }
            }

            if (list.isEmpty()) {
                list.add(0+" "+0);
            }

            return list;
        }

        private void updateStar(int i, int j) {
            this.A[i+1][j] = 0;
            this.A[i][j+1] = 0;
        }

        private Boolean isCenter(int i, int j) {
            if (i - 1 < 0 || i + 1  == M || j - 1 < 0 || j + 1  == N ) {
                return false;
            }

            if ( A[i-1][j] == 1 && A[i][j] == 1 && A[i+1][j] == 1 && A[i][j+1] == 1 && A[i][j-1] == 1) {
                return true;
            }

            return false;
        }

    }

}