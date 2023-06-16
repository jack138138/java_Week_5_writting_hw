package java_week_5_writting_hw_jaydeep;

import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("APPLE");
        fruitList.add("BANANA");
        fruitList.add("GRAPES");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("ORANGE");
        fruitList.add("BLACKBERRY");
        fruitList.add("CHERRY");
        fruitList.add("STRAWBERRY");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next() + ",");
        }
    }
}
