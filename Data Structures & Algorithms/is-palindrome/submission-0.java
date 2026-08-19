class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        StringBuilder newString = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                newString.append(Character.toLowerCase(ch));
            }
        }

        int stringLength = newString.toString().length();

        s = newString.toString();

        if (stringLength <= 1) {
            return true;
        }

        System.out.println(s);

        int start = 0;
        int end = stringLength - 1;
        while (start < end) {

            char startCh = s.charAt(start);
            char endCh = s.charAt(end);

            if (startCh != endCh) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
