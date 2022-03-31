package ArrayPractice;

import java.util.ArrayList;

public class ArrayEExample2 {
    public static void main (String[] args){
        ArrayList<String> animals= new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        String str= animals.get(0);
        System.out.println("Element at index 0:"+str);
        //change the element of arraylist
        animals.set(2,"mouse");
        System.out.println("Changed Arraylist:"+animals);
        //Remove the element from ArrayList
        String Str=animals.remove(2);
        System.out.println("Updated Arraylist:"+animals);
        System.out.println("Removed Element:"+Str);
    }
}
