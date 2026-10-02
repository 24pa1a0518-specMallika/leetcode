class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // negative numbers can't be palindrome

        int rev = 0, temp = x;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        return x == rev;
    }

    public static void main(String[] args) {
        Solution o1 = new Solution();
    }
}
