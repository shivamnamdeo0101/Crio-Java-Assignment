import java.util.*;

public class Solution {

        public static String theNextZombie(String[] array) {
        int index = 0;
        for(int i=0;i<array.length;i++){
           
            if(array[i].equals("Zombie")){
                index = i;
                break;    
            }
                
        }
        index = index+1;
        String s ="Run away "+ array[index];
        s +="!";
       // s = "\"" + s + "\"";
        return s;
        
    }

    public static void main(String args[]) {
        String[] array = { "Anil", "Zombie", "Pulkit", "Chinmay" };
        assert (theNextZombie(array).equals("Run away Pulkit!"));
    }
}

