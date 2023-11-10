import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Жава");
        arrayList.add("Питон");
        arrayList.add("Плюсы");
        System.out.println("Лист: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Банана");
        linkedList.add("Эпле");
        linkedList.add("Рэд эпл");
        System.out.println("Связный список: " + linkedList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Зеленый");
        hashSet.add("Белый");
        hashSet.add("Желтый");
        System.out.println("Таблица: " + hashSet);

        List<String> vector = new Vector<>();
        vector.add("Один");
        vector.add("Пятьдесят");
        vector.add("Два");
        System.out.println("Вектор: " + vector);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        System.out.println("Дикшиноари: " + hashMap);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Леон");
        treeSet.add("Багги");
        treeSet.add("Жвачка");
        System.out.println("Коллекция: " + treeSet);
    }
}