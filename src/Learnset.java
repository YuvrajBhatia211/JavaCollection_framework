import java.util.HashSet;
import java.util.Set;

public class Learnset {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();


        //basically it stores values in random order
        //Hashing is used in this which means it stores elements as key-value pair
    set.add(45);
    set.add(11);
    set.add(11);
    set.add(34);
    set.add(67);

    //duplicate elements will not be added
        // above two time 11 is added but it will add 11 only once
        System.out.println(set);

        //remove any element
        set.remove(34);
        System.out.println(set);

    }

}

