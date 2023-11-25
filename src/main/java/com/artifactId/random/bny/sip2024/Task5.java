package com.artifactId.random.bny.sip2024;

public class Task5 {

    public int func(int a, int b) {
        if (b==0) {
            return 1;
        }

        int temp = func(a, b/2);
        if (b %2 != 0 ) {
            return temp * temp * a;
        } else  {
            return temp * temp;
        }

    }

}
