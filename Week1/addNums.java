import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static int addNums(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }

        return sum;
    }

    public static void main(String args[]) {
        int n = 3;
        assert (addNums(n) == 6);
    }
}

