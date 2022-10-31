package by.step.teach_java.classwork.classwork311022;

import java.util.ArrayList;
import java.util.List;

public class Task1ArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(6);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(null);
        showArray(arrayList);

    }
public static <E> void showArray(List<E> List) {
        for (E val : List){
            System.out.println();

        }
}
    }

