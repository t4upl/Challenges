package com.artifactId.random.bny.sip2024;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nurses {
    public static char findHardestWorkingNurse(List<List<Integer>> arr) {

        final int[] mostWorkingTime = {arr.get(0).get(1)};
        final int[] mostHardWorkingNurseIndex = {arr.get(0).get(0)};

        IntStream.range(1, arr.size()).forEach(index -> {
                    int start = arr.get(index - 1).get(1);
                    int end = arr.get(index).get(1);
                    int time = end - start;
                    if (time > mostWorkingTime[0]) {
                        mostWorkingTime[0] = time;
                        mostHardWorkingNurseIndex[0] = arr.get(index).get(0);
                    }
                }
        );

        int a = 'a';
        int i = a + mostHardWorkingNurseIndex[0];
        return (char) i;
    }
}