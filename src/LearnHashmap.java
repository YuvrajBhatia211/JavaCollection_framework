import java.util.HashMap;
import java.util.Map;

public class LearnHashmap {

    public static void main(String[] args){
        Map<String , Integer> numbers = new HashMap<>();
        //key will always be unique
        //values can have duplicacy
        numbers.put("one" , 1);
        numbers.put("two" ,2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);
        System.out.println(numbers);

    //check whether a key is present or not

        numbers.putIfAbsent("two" ,24);
        System.out.println(numbers);

        //iteration
    for(Map.Entry<String , Integer> e:numbers.entrySet()){
        System.out.println(e);

        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }

    //iterate only keys
        for(String key:numbers.keySet()){
            System.out.println(key);
        }

        //iterate only value
        for(Integer e : numbers.values()){
            System.out.println(e);
        }
    }
}
