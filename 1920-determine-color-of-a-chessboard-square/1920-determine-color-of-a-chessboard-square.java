class Solution {
    public boolean squareIsWhite(String c) {
        int a=c.charAt(0);
        int b=c.charAt(1);
        int sum=(int)a + (int)b;
        if((sum%2)==0) return false;
        else return true;
    }
}