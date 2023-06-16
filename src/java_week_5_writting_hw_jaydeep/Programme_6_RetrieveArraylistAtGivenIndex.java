package java_week_5_writting_hw_jaydeep;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jay vaghani
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("TOMATO");
        vegetableList.add("BRINGEL");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER_GOURO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("LADYFINGER");
        vegetableList.add("BEEN");
        vegetableList.add("BLACKCURRANT");
        System.out.println(vegetableList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scan.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));
        } else {
            System.out.println("INVALID INDEX");
        }
        scan.close();


    }
}
