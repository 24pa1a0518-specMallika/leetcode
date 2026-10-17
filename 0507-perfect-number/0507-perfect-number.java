class Solution {
    public boolean checkPerfectNumber(int num) {
        // There are only 5 perfect numbers within the range of a standard 32-bit integer.
        // We can check against them directly for immediate execution.
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }
}
