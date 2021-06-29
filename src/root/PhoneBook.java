package root;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap <String, HashSet<String>> list;

    PhoneBook(){
        this.list = new HashMap<>();
    }

    void add (String name, String phone) {
        HashSet<String> phoneList = list.getOrDefault(name, new HashSet<>());
        phoneList.add(phone);
        list.put(name, phoneList);
    }

     void findPrint(String name){
        if (list.containsKey(name)){
            System.out.println(list.get(name));
        } else {
            System.out.println("Такого абонента нет!");
        }
    }


}
