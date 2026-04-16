class Solution {
    public int[] countBits(int n) {
        return java.util.stream.IntStream.rangeClosed(0,n).map(Integer::bitCount).toArray();
    }
}