public class Solution {
    public static int negativeNumbers(int number) {
        return number > 0 ? number * (-1) : number;
    }

    public static void main(String[] args) {
        int number = 5;
        assert(negativeNumbers(number)==-5);
        number = -3;
        assert(negativeNumbers(number)==-3);
    }
}
