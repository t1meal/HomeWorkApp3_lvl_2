package root;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    String [] arr = {"дерево","палка","палка","работа","колесо","звезда","колесо","валенки","листва","каток","работа","антенна"};
        System.out.print("Общий список: ");
	    for (String a: arr){
            System.out.print(a + "  ");
        }
        System.out.println();

        HashMap<String, Integer> hm = new HashMap<>();

	   for (String b: arr){
	       if (hm.containsKey(b)){
	            hm.put(b, hm.get(b)+1);
           } else{  hm.put(b,1); }
       }

	   System.out.println("Список уникальных слов: " + hm.keySet());
	   System.out.println("Количество повторений: " + hm);

    }
}

