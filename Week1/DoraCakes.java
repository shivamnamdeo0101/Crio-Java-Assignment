import java.util.*;

public class Solution {

    static int doraCakes(double days) {
        int c = (int)days / 2;
        return c;
    }

    public static void main(String args[]) {
        double number = 5.0;
        assert (doraCakes(number) == 2);
        number = 2.2;
        assert (doraCakes(number) == 1);
    }
}
