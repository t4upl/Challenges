package com.CodilityJobs;

public class TestUtils {

    public static int[] reverseArray(int validData[]) {
        for(int i = 0; i < validData.length / 2; i++)
        {
            int temp = validData[i];
            validData[i] = validData[validData.length - i - 1];
            validData[validData.length - i - 1] = temp;
        }

        return validData;
    }
}
