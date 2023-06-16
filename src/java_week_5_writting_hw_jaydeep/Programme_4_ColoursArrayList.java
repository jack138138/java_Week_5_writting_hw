package java_week_5_writting_hw_jaydeep;

import java.util.ArrayList;

/**
 * Create bny jay vaghani
 * Write a Java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("BLACK");
        colorList.add("WHITE");
        colorList.add("SILVER");
        colorList.add("GOLDEN");
        colorList.add("ORANGE");
        colorList.add("PURPLE");
        colorList.add("YELLOW");
        for ( String colourList : colorList) {
            System.out.println(colourList + ",");

        }

    }

}
