package solutionPackage;

import java.util.*;

public class NaiveSolution {


    private String naiveSolutionString;

    public int solution(String S) {

        naiveSolutionString = "";

        for (int i = S.length(); i > 0; i --) {
            for (int j = 0; j < S.length(); j++) {

                if ( j + i > S.length()) {
                    break;
                }
                String substring = S.substring(j, j + i);
                int testValue = testValuefunction(substring);

                if (testValue != -1) {
                    naiveSolutionString = substring;
                    return testValue;
                }

            }
        }

        return 0;
    }



    public int testValuefunction (String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }

            map.put(c, map.get(c) +1);
        }

        if (map.entrySet().size() != 2) {
            return -1;
        } else {
            List<Integer> list = new ArrayList(map.values());
            return list.get(0).equals(list.get(1)) ? 2 * list.get(0) : -1;
        }
    }

    public String getNaiveSolutionString() {
        return this.naiveSolutionString;
    }
}
