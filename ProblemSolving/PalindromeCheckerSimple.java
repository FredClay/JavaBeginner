package ProblemSolving;

public class PalindromeCheckerSimple {

    public static void main (String[] args) {
        // If the string we are checking is merely plaintext, we do not need to use the string re-formatter method.

        String unformattedStr = "race???   !c----ar";
        String str = stringReformatter(unformattedStr);

        int strLength = str.length();
        char[] ans = new char[strLength];

        // fill the ans array backwards with the chars in 'question' string.
        for (int i = 0; i < strLength; i++) {
            char focusChar = str.charAt(i);
            ans[strLength - i - 1] = focusChar;
        }
        String strAns = new String(ans);

        // evaluate new string against the original.
        if (strAns.equals(str)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }

    public static String stringReformatter (String str) {
        str = str.replace( " ", "");
        str = str.replaceAll("\\p{Punct}","");
        return str;
    }

}
