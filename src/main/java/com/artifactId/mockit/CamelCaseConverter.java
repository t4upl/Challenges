package com.artifactId.mockit;

import java.util.Arrays;

public class CamelCaseConverter {

    public static void main(String[] args) {
        System.out.println(toCamelCase("geeks_for_geeks"));
        System.out.println(toSwapCase("aBc"));

    }

    static private String toSwapCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    static private String toCamelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '_') {
                continue;
            }
            if (i > 0 && input.charAt(i -1 ) == '_' ) {
                c = Character.toUpperCase(c);
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }


}
