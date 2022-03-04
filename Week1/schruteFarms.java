import java.util.*;

public class Solution {

    public static String schruteFarms(int x, int y) {
        if(y>x){
            return "Profit of " +(y-x)+ " dollars!";
        }

        if(y < x){
            return "Loss of " +(x-y)+ " dollars!";
        }

        if(y == x){
            return "No Profit this year!";
        }

        return "";
    }

    public static void main(String args[]) {
        assert (schruteFarms(3, 3).equals("No Profit this year!"));
        assert (schruteFarms(3, 4).equals("Profit of 1 dollars!"));
        assert (schruteFarms(3, 2).equals("Loss of 1 dollars!"));
    }
}
