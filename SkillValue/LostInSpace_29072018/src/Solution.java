import java.util.LinkedList;
import java.util.List;

public class Solution {

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
