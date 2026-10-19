class Solution {
    public int dayOfYear(String date) {
        java.time.LocalDate localDate = java.time.LocalDate.parse(date);
        return localDate.getDayOfYear();
    }
}