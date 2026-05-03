class Solution {
    public boolean rotateString(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();
        
        if (n1 != n2) {
            return false;
        }

        String temp = str1 + str1;
        
        if (temp.contains(str2)) {
            return true;
        } else {
            return false;
        }
    }
}