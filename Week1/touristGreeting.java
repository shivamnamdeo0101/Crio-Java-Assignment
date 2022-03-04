import java.util.*;

public class Solution {

    static String touristGreeting(String nationality) {

        return String.format("Welcome to Wonderland, citizen from %s!", nationality);

        if (nationality.toLowerCase().equals("wonderland")) {
            return "Welcome back!";
        }

    }

    public static void main(String args[]) {
        String nationality = "Wakanda";
        assert (touristGreeting(nationality).equals("Welcome to Wonderland, citizen from Wakanda!"));
        nationality = "Wonderland";
        assert (touristGreeting(nationality).equals("Welcome back!"));
    }
}

