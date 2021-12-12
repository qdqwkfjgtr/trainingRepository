import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        LinkedList<Integer> list1=new LinkedList();
        LinkedList<Integer> list2=new LinkedList();

        for(int i=0;i<10;i++) {
            list1.push(i);
        }
        for (int i=5;i<15;i++){
            list2.push(i);
        }
        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());
        List<Integer> newList = new ArrayList<Integer>() { { addAll(list1); addAll(list2); } };
        Collections.sort(newList);
        for(int i=0;i<newList.size();i++){
            System.out.println(newList.get(i));
        }
    }

}
