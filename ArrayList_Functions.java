/*
Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
ArrayList for Integers
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
ArrayList for Strings
ArrayList<String> friends = new ArrayList<String>();

Functions List
(1)arraylistObject.add()
(2)arraylistObject.get(position)
(3)arraylistObject.set(postion,value)
(4)remove(position)
(5)arrayListObject.size() - gives the number of values of the arrayList
(6)Collections.sort(ArrayListObject) - Sorts the arraylist in ascending order
   
 */
import java.util.ArrayList;
import java.util.Collections;
class ArrayList_Functions
{
    public static void main()
    {
        ArrayList<String> friends = new ArrayList<String>();
        String f;
        friends.add("ram");
        friends.add("shyam");
        friends.add("rita");
        friends.add("geeta");
        System.out.println(friends);
        /*
        Access an Item
        To access an element in the ArrayList, use the get() method and refer to the index number:
         */
        f=friends.get(1);
        System.out.println("friends.get(1)"+f);
        /*
        Change an Item
        To modify an element, use the set() method and refer to the index number:
         */
        System.out.println("ArrayList before change");
        System.out.println(friends);
        friends.set(3, "priya");
        System.out.println("ArrayList after change of geeta to priya");
        System.out.println(friends);
        /*
        Remove an Item
        To remove an element, use the remove() method and refer to the index number:
        Example
        friends.remove(0);
        */
        System.out.println("ArrayList before removing");
        System.out.println(friends);
        friends.remove(2);
        System.out.println("ArrayList after removing 2nd value-rita");
        System.out.println(friends);
        
        /*traverse through ArrayList using loop*/
        
        for (int i = 0; i < friends.size(); i++) 
        {
            System.out.println(friends.get(i));
        }
        // Sort the ArrayList
        System.out.println("Sorting the arraylist using Collections.sort(ArrayListObject)");
        Collections.sort(friends);  // Sort friends in ascending order
        for (String i : friends) 
        {
          System.out.println(i);
        }
    }
}

