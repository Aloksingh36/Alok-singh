import java.util.HashMap;
import java.util.Map;
public class MapTest {
    public static void main(String[] args) {
        Map<String,String>courses = new HashMap<String,String>();
        courses.put("Book 1","java");
        courses.put("Book 2","Python");
        System.out.println(courses);
        System.out.println("Total size is:\t"+courses.size());
        String key = courses.get("Book 1");
        if(courses.containsKey("Book 1")){
            System.out.println("Found\t"+courses.replace("Book 1","c++"));
        }
        System.out.println(courses);
    }
}
