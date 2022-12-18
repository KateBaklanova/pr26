import java.io.*;
import java.util.*;

public class hash {

    public static void find(int key, Hashtable<Integer, String> ht)
    {
        if(ht.containsKey(key)){
            System.out.println("Key " + key + " found = " + ht.get(key));
        }else{
            System.out.println("Key " + key+ " does not exist");
        }
    }

    public static void main(String args[])
    {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>(2);

        // второе значение хранимое, первое - ключ
        ht.put(4, "four");
        ht.put(5, "five");
        ht.put(6, "six");

        System.out.println("Mappings of ht2 : " + ht);
        find(1, ht);
        find(6, ht);
    }
}
