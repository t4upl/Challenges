package SolutionPackage;

import java.util.HashMap;
import java.util.Map;

//GOLD solution
public class Solution1 implements Solutionable {

    static int Q;
    static boolean isContinue = true;

    public int solution(int N, int Q, int[] B, int[] C) {
        // write your code in Java SE 8

        this.Q = Q;
        this.isContinue = true;

        Bucket[] buckets = new Bucket[N];
        for (int i = 0; i <B.length; i++) {
            if (buckets[B[i]] == null) {
                buckets[B[i]] = new Bucket();
            }

            buckets[B[i]].addToBucket(C[i]);
            //printBuckets(buckets);
            if (!isContinue) {
                //System.out.println("Early exit at turn: " + i);
                return i;
            }
        }


        //System.out.println("Solution end -1");
        return -1;
    }

//    void printBuckets (Bucket[] buckets) {
//        String s = "";
//        for (int i =0; i < buckets.length; i++) {
//            s += "[ i = " + i+":  ";
//            if (buckets[i] == null) {
//                s+=" null ";
//            } else {
//                String result = buckets[i].getBalls().entrySet()
//                        .stream()
//                        .map(entry -> entry.getKey() + " - " + entry.getValue())
//                        .collect(Collectors.joining(", "));
//
//                s+= result;
//            }
//
//            s +=" ], ";
//        }
//
//
//        System.out.println(s);
//    }



    public class Bucket {
        Map<Integer, Integer> balls = new HashMap<>();

        public void addToBucket(int ballColor) {
            if (!balls.containsKey(ballColor)) {
                balls.put(ballColor, 0);
            }
            balls.put(ballColor, balls.get(ballColor) + 1);

            if (balls.get(ballColor) == Solution1.Q) {
                isContinue = false;
            }
        }

        public Map<Integer, Integer> getBalls() {
            return balls;
        }
    }


}
