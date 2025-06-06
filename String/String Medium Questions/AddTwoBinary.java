// Java program to add two binary strings
// using Bit-by-Bit addition
public class AddTwoBinary {

    // Function to trim leading zeros from a binary string
    static String trimLeadingZeros(String s) {
        // Find the position of the first '1'
        int firstOne = s.indexOf('1');
        return (firstOne == -1) ? "0" : s.substring(firstOne);
    }

    // This function adds two binary strings and returns the result as a third string
    static String addBinary(String s1, String s2) {
        // Trim Leading Zeros
        s1 = trimLeadingZeros(s1);
        s2 = trimLeadingZeros(s2);

        int n = s1.length();
        int m = s2.length();

        // Swap the strings if s1 is of smaller length
        if (n < m) {
            return addBinary(s2, s1);
        }

        int j = m - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Traverse both strings from the end
        for (int i = n - 1; i >= 0; i--) {
            // Current bit of s1
            int bit1 = s1.charAt(i) - '0';
            int sum = bit1 + carry;

            // If there are remaining bits in s2, add them
            if (j >= 0) {
                // Current bit of s2
                int bit2 = s2.charAt(j) - '0';
                sum += bit2;
                j--;
            }

            // Calculate the result bit and update carry
            int bit = sum % 2;
            carry = sum / 2;

            // Update the current bit in result
            result.append((char)(bit + '0'));
        }

        // If there's any carry left, update the result
        if (carry > 0) {
            result.append('1');
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        System.out.println(addBinary(s1, s2));  // Output will be "11000"
    }
}
