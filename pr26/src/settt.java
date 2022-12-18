import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class settt {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(10);

        set.add("One");
        set.add("Two");
        set.add("Three");

        Iterator<String> it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
