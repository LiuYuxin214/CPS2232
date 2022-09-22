package Unit4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DisplayWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);
        LinkedList<String> list = new LinkedList();
        while (sc.hasNext()) {
            list.add(sc.next());
        }
        list.sort(null);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
