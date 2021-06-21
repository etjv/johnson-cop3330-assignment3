package ex42;

import java.util.*;

public class Records {
    public static Map<String, String> RecordCreator(String lastName, String firstName, String salary){
        Map<String, String> m = new HashMap<>();
        m.put("last", lastName);
        m.put("first", firstName);
        m.put("salary", salary);
        return m;
    }
}
