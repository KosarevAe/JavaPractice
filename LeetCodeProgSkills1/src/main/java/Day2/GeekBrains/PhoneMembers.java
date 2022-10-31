package Day2.GeekBrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneMembers {
    private HashMap<String, HashSet<String>> map;

    public PhoneMembers(){
        this.map = new HashMap<>();
    }

    public void add(String surname, String phone){
        if(!map.containsKey(surname)){
            map.put(surname, new HashSet<>());
        }
        map.get(surname).add(phone);

        System.out.println("added");
    }

    public void get(String surname){
        if(map.containsKey(surname)){
            System.out.println("Номер(-а) телефон(-ов) по фамилии " + surname + " " + map.get(surname));
        } else {
            System.out.println("Номера телефона с такой фамилией не существует");
        }
    }


    public static void main(String[] args) {
        PhoneMembers ph = new PhoneMembers();
        ph.add("test", "123");
        ph.add("test", "12322222");
        ph.add("test", "123333333");
        ph.add("test1", "1234");
        ph.add("test2", "12345");

        ph.get("test");
    }
}
