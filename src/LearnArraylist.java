import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArraylist {
    public static void main(String[] args){
        ArrayList<String> studentName = new ArrayList<>();
//          its size increase after
//                size = n+n/2+1


        //time complexity of adding a element is O(n)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4);
        System.out.println(list);

        list.add(3,778);
        System.out.println(list);

 // new list can append//
        List<Integer> l2 = new ArrayList<>();
        l2.add(345);
        l2.add(332);

        list.addAll(l2);
        System.out.println(list);
//remove function// time complexity 0(n)
        list.remove(3);
        System.out.println(list);

        //if want to remove element by value
        list.remove(Integer.valueOf(4));
        System.out.println(list);

        //for iterating
        for(int i =0;i< list.size();i++){
            System.out.println("Element are "+list.get(i));
        }
        for(Integer ele : list){
            System.out.println("Elements are "+ele);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }
    }
}
