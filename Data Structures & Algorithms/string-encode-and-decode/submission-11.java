class Solution {

    public String encode(List<String> strs) {
        
        if (strs == null || strs.size() == 0) {
            return null;
        }

        StringBuilder encodedString = new StringBuilder("");

        for (String str : strs) {
            StringBuilder temp = new StringBuilder("");
            int lengthStr = str.length();
            temp.append(Integer.toString(lengthStr));
            temp.append("#");
            temp.append(str);

            encodedString.append(temp);
        }

        System.out.println(encodedString.toString());
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList<String>();
        }

        int encodeLen = str.length();
        int index = 0;

        List<String> returnString = new ArrayList<>();

        while (index < encodeLen) {

            int delimiterIndex = str.indexOf("#", index);
            int strLen = Integer.parseInt(str.substring(index, delimiterIndex));
            index = delimiterIndex + 1;

            System.out.println(str.split("#")[0]);

            if (strLen == 0) {
                returnString.add("");
                System.out.println(returnString.toString());
                continue;
            }

            StringBuilder tempString = new StringBuilder();

            for (int i = 0; i < strLen; i++) {
                tempString.append(str.charAt(i + index));
            }

            index += strLen;
            System.out.println(index);

            returnString.add(tempString.toString());
        }
        return returnString;
    }
}
