public class Solution {
    public static boolean roadTrip(double p, double x, double y) {
        return p * x >= y ? true : false;
    }

    public static void main(String[] args) {
        double p=3, x=50, y=100;
        assert(roadTrip(p,x,y));
    }
}
