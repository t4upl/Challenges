package solutionPackage;


//SILVER ONLY :(
public class Solution3 {
    public int solution(String S) {
        int result = 0;
        if (S.isEmpty() || S.length() == 1) {
            return 0;
        }

        char firstLetter = S.charAt(0);
        char secondLetter = notFirstLetter(firstLetter, S);
        int startIndex = 0;

        if (firstLetter == secondLetter) {
            return 0;
        }

        char lastLetter =  secondLetter;
        int lastLetterCount = 1;


        for (int i = 0; i < S.length(); i++){
            char currentChar = S.charAt(i);
            if (currentChar == firstLetter || currentChar == secondLetter) {
                if (currentChar == lastLetter) {
                    lastLetterCount++;
                } else {
                    lastLetter = currentChar;
                    lastLetterCount = 1;
                }
            } else {

                firstLetter = lastLetter;
                secondLetter = currentChar;
                lastLetter = currentChar;

                int longestBalancedStringLength = inspectSolution(S, startIndex, i, firstLetter, result);
                if (result < longestBalancedStringLength) {
                    result = longestBalancedStringLength;
                }

                startIndex = i - lastLetterCount;
                lastLetterCount = 1;
            }
        }

        int longestBalancedStringLength = inspectSolution(S, startIndex, S.length(), firstLetter, result);
        if (result < longestBalancedStringLength) {
            result = longestBalancedStringLength;
        }

        return result;
    }

    void inspectSolutionCheck(String substring) {
        substring = substring.replaceAll("" + substring.charAt(0), "");
        substring = substring.replaceAll("" + substring.charAt(0), "");
        if (!substring.isEmpty()) {
            throw new RuntimeException(substring + " IS NOT EMPTY!!!");
        }
    }

    public int inspectSolution(String S, int startIndex, int endIndex, char firstLetter, int longestBlockSoFar) {
        int sum  = 0;

        //length of block
        for (int i = (endIndex - startIndex)/2*2; i > 0; i-=2) {

            if (i <= longestBlockSoFar) {
                return -1;
            }

            //check first block
            sum = inspectSolutionFitstSum(S, startIndex, firstLetter, i);
            if (sum == 0) {
                return i;
            }

            //check all other blocks
            for (int j = startIndex + i; j < endIndex; j++){
                sum += letterStackValue(S.charAt(j), firstLetter);
                sum -= letterStackValue(S.charAt(j-i), firstLetter);

                if (sum == 0) {
                    return i;
                }
            }
        }

        return 0;
    }

    int letterStackValue (char c, char firstLetter) {
        return  c == firstLetter ? 1 : -1;
    }

    public int inspectSolutionFitstSum (String S, int startIndex, char firstLetter, int blockLength) {
        int sum = 0;
        for (int k = 0; k < blockLength; k++ ) {
            if (S.charAt(startIndex + k) == firstLetter) {
                sum++;
            } else {
                sum--;
            }
        }

        return sum;
    }

    char notFirstLetter(char firstLetter, String S) {
        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) != firstLetter) {
                return S.charAt(i);
            }
        }
        return firstLetter;
    }
}
