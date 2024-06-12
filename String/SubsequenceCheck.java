package String;

public class SubsequenceCheck {
    static boolean isSubSeq(String S1, String S2) {
        int n = S1.length();
        int m = S2.length();
        int j = 0; // Index for S2

        // Traverse S1 and S2
        for (int i = 0; i < n && j < m; i++) {
            // If characters match, move to next character in S2
            if (S1.charAt(i) == S2.charAt(j)) {
                j++;
            }
        }

        // If all characters of S2 were found in S1 in order
        return (j == m);
    }

    public static void main(String[] args) {
        String S1 = "ABCDEF";
        String S2 = "ADE";
        System.out.println(isSubSeq(S1, S2)); // This should print true
    }
}
