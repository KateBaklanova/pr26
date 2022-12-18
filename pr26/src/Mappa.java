
import java.util.HashMap;
import java.util.Map;


public class Mappa {
    public static HashMap createMap ()
    {
        HashMap<String, String> people = new HashMap<String, String>();
        people.put("Ivanov", "Ivan");
        people.put("Ivanov", "name");
        people.put("Ivanovich", "name");
        people.put("f00rnmcemfem", "fvnmfvm");
        people.put("Rusov", "Ilya");
        people.put("surname", "name");
        people.put("Ivanov", "shush");
        people.put("surname1", "name1");
        people.put("Ivanova", "name");
        return people;
    }

    public static void getSameFirstNameCount (HashMap<String, String> people)
    {
        int maxi1=0;
        Map<String, Integer> mp = new HashMap<String, Integer>();


        int maxi2 =0;
        for (String i : people.values()) {
            if (mp.containsKey(i)) { // если имя уже есть
                mp.put(i, mp.get(i) + 1);
                // если нет, то кладем ключ и присваиваем значение 1
            } else {
                mp.put(i, 1);
            }

            //System.out.println(mp);
        }

        //System.out.println(mp);
    }

    public static void getSameLastNameCount (HashMap<String, String> people)
    {
        int maxi1=0;
        Map<String, Integer> mp = new HashMap<String, Integer>();


        int maxi2 =0;
        for (String i : people.keySet()) {
            if (mp.containsKey(i)) { // если имя уже есть
                mp.put(i, mp.get(i) + 1);
                // если нет, то кладем ключ и присваиваем значение 1
            } else {
                mp.put(i, 1);
            }

            System.out.println(i);
        }

        System.out.println(mp);
    }

    // Метод getSameLastNameCount () должен возвращать количество людей с одинаковой фамилией
    // нельзя использовать так как в hashMap не дублируются ключи
    // можно использовать hashSet

    public static void main(String[] args)
    {
        HashMap<String, String> people = createMap();
        System.out.println(people);
        getSameFirstNameCount(people);
        getSameLastNameCount(people);
    }

}
