/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode7.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode7
*/

// import
import java.util.*;

public class JavaCode7 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");

        System.out.println("Java Code 7");
        System.out.println("Java - ArrayList");
        System.out.println("");

        // Display Current Date
        ArrayList<String> the_Lord_of_the_Rings_The_Rings_of_Power_main_characters = new ArrayList<String>();
        the_Lord_of_the_Rings_The_Rings_of_Power_main_characters.add("Galadriel");
        the_Lord_of_the_Rings_The_Rings_of_Power_main_characters.add("Gil-galad");
        the_Lord_of_the_Rings_The_Rings_of_Power_main_characters.add("Eärien");
        the_Lord_of_the_Rings_The_Rings_of_Power_main_characters.add("Celebrimbor");
        System.out.println(the_Lord_of_the_Rings_The_Rings_of_Power_main_characters);

        /*
         * print items of ArrayList
         * ArrayList methods -
         * get()
         * add()
         * size()
         */
        for (int i = 0; i < the_Lord_of_the_Rings_The_Rings_of_Power_main_characters.size(); i++) {
            System.out.println(the_Lord_of_the_Rings_The_Rings_of_Power_main_characters.get(i));
        }

        // Numbers in ArrayList
        // https://www.powerball.com/draw-result - 04/08/2024
        ArrayList<Integer> powerball_numbers_from_last_night = new ArrayList<Integer>();
        powerball_numbers_from_last_night.add(6);
        powerball_numbers_from_last_night.add(21);
        powerball_numbers_from_last_night.add(23);
        powerball_numbers_from_last_night.add(39);
        powerball_numbers_from_last_night.add(54);
        powerball_numbers_from_last_night.add(23);
        for (int i = 0; i < powerball_numbers_from_last_night.size(); i++) {
            System.out.println(powerball_numbers_from_last_night.get(i));
        }

        // ArrayList sorting
        // ArrayList<Integer> clone_powerball_numbers_from_last_night_clone;
        // clone_powerball_numbers_from_last_night_clone = (ArrayList<Integer>)
        // powerball_numbers_from_last_night.clone();
        ArrayList<Integer> clone_powerball_numbers_from_last_night_clone = (ArrayList<Integer>) powerball_numbers_from_last_night.clone();
        System.out.println("Clone copy (original) = " + clone_powerball_numbers_from_last_night_clone);

        // Sort ascending (default)
        clone_powerball_numbers_from_last_night_clone = (ArrayList<Integer>) powerball_numbers_from_last_night.clone();
        Collections.sort(clone_powerball_numbers_from_last_night_clone);
        System.out.println("Sorted = " + clone_powerball_numbers_from_last_night_clone);

        // Sort descending
        clone_powerball_numbers_from_last_night_clone = (ArrayList<Integer>) powerball_numbers_from_last_night.clone();
        Collections.sort(clone_powerball_numbers_from_last_night_clone, Collections.reverseOrder());
        System.out.println("Sorted descending = " + clone_powerball_numbers_from_last_night_clone);

        // Reverse a list
        clone_powerball_numbers_from_last_night_clone = (ArrayList<Integer>) powerball_numbers_from_last_night.clone();
        Collections.reverse(clone_powerball_numbers_from_last_night_clone);
        System.out.println("Sorted reverse = " + clone_powerball_numbers_from_last_night_clone);

        // Convert ArrayList of Array
        clone_powerball_numbers_from_last_night_clone = (ArrayList<Integer>) powerball_numbers_from_last_night.clone();
        int[] int_array_powerball_numbers_from_last_night_clone = new int[powerball_numbers_from_last_night.size()];

        for(int i=0; i< powerball_numbers_from_last_night.size(); i++) {
            int_array_powerball_numbers_from_last_night_clone[i] = powerball_numbers_from_last_night.get(i);
        }
        
        for(int i=0; i<int_array_powerball_numbers_from_last_night_clone.length; i++) {
            System.out.print(int_array_powerball_numbers_from_last_night_clone[i] + " "  );
        }




    }
}