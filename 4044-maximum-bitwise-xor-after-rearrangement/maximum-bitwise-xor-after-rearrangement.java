class Solution {
    public String maximumXor(String s, String t) {

        int ones = 0;
        for (char ch : t.toCharArray()) {
            if (ch == '1') ones++;
        }

        int zeros = t.length() - ones;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                if (zeros > 0) {
                    sb.append('1');
                    zeros--;
                } else {
                    sb.append('0');
                    ones--;
                }
            } 
            else { // s[i] == '0'
                if (ones > 0) {
                    sb.append('1');
                    ones--;
                } else {
                    sb.append('0');
                    zeros--;
                }
            }
        }

        return sb.toString();
    }
}