package com.artifactId.cheatsheet;

public class BinarySearch {

    public static int binarySearch(int[] a, int l, int r, int x){

        while (l <= r){

            int m = (l + r) / 2;

            // Index of Element Returned
            if (a[m] == x) {
                return m;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                // so we decrease our r pointer to mid - 1
            }
            else if (a[m] > x) {
                r = m - 1;

                // Else the element can only be present
                // in right subarray
                // so we increase our l pointer to mid + 1
            }
            else {
                l = m + 1;
            }
        }

        // No Element Found
        return -1;
    }

}
