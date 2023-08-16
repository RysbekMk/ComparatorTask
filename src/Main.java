
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }
        sortIntegers(linkedList);

    } static void sortIntegers (int[] arrays){
        Arrays.sort(arrays);
        for (int array : arrays) {
            System.out.print(array);
        }
    }static void sortIntegers(ArrayList<Integer> arrayList){
        Comparator<Integer>integerComparator= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };arrayList.sort(integerComparator);
        for (Integer integer : arrayList) {
            System.out.print(integer);
        }
    }static void sortIntegers (LinkedList<Integer> linkedList){
        Comparator<Integer>integerComparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };linkedList.sort(integerComparator);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
    }
}